package dtsvetkov.tools.netdata;

import dtsvetkov.tools.netdata.beans.responses.*;
import dtsvetkov.tools.netdata.enums.GetDataFormat;
import dtsvetkov.tools.netdata.enums.GetDataOptions;
import dtsvetkov.tools.netdata.enums.GroupingMethod;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestNetdataRestClient {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    protected final String URL = "http://localhost:30001";
    protected NetdataRestClient client;

    @Before
    public void before() {
        client = new NetdataRestClient(URL);
    }

    @Test
    public void test_getInfo() throws Exception {
        InfoResponse info = client.getInfo();
        assert info.getOsName().equals("Debian GNU/Linux");
        assert info.getOsVersion().equals("9 (stretch)");
    }

    @Test
    public void test_getCharts() throws Exception {
        ChartsResponse charts = client.getCharts();
        assert charts.getHostname().equals("host4510");
        assert charts.getCharts().get("disk_qops.sdb").getName().equals("disk_qops.sdb");
        assert charts.getCharts().get("disk_qops.sdb").getTitle().equals("Disk Current I/O Operations (disk_qops.sdb)");
    }

    @Test
    public void test_getChart() throws Exception {
        ChartResponse chart = client.getChart("system.cpu");
        assert chart.getName().equals("system.cpu");
        assert chart.getTitle().equals("Total CPU utilization (system.cpu)");
    }

    @Test
    public void test_getAlarmVariables() throws Exception {
        AlarmVarsResponse alarmVariables = client.getAlarmVariables("system.cpu");
        assert alarmVariables.getHost().equals("host4510");
        assert alarmVariables.getChartVariables().get("update_every").toString().equals("1.0");
    }

    @Test
    public void test_getData_short() throws Exception {
        DataResponse data = client.getData("system.cpu", -100);
        assert data.getName().equals("system.cpu");
        assert data.getResult().getLabels().get(1).equals("guest_nice");
    }

    @Test
    public void test_getData() throws Exception {
        DataResponse data = client.getData("system.cpu", null, -100, 0, 10, GroupingMethod.AVERAGE,
                5, GetDataFormat.JSON, new GetDataOptions[]{GetDataOptions.SECONDS});
        assert data.getLabels().get(1).equals("guest_nice");
    }

    @Test
    public void test_getBadgeSvg_short() throws Exception {
        String badgeSvg = client.getBadgeSvg("system.cpu", -100);
        log.info(badgeSvg.substring(0, 5));
        assert badgeSvg != null;
        assert badgeSvg.length() > 5;
        assert badgeSvg.substring(0, 5).equals("<svg ");
    }

    @Test
    public void test_getAllmetrics() throws Exception {
        AllmetricsResponse allmetrics = client.getAllmetrics();
        assert allmetrics.get("system.cpu").getName().equals("system.cpu");
        assert (Double)allmetrics.get("system.cpu").getDimensions().get("user").getValue() > 0;
    }

    @Test
    public void test_getAlarms() throws Exception {
        AlarmsResponse alarms = client.getAlarms(true);
        assert alarms.getHostname().equals("host4510");
        assert alarms.getAlarms().get("system.ram.ram_in_use").getValue() > 0;
    }

    @Test
    public void test_getAlarmLog() throws Exception {
        AlarmLogResponse alarmLog = client.getAlarmLog();
        assert alarmLog.get(0).getHostname().equals("host4510");
    }

}
