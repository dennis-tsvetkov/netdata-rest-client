package dtsvetkov.tools.netdata;

import dtsvetkov.tools.netdata.beans.responses.ChartsResponse;
import dtsvetkov.tools.netdata.beans.responses.DataResponse;
import dtsvetkov.tools.netdata.beans.simple.*;
import dtsvetkov.tools.netdata.enums.GetDataFormat;
import dtsvetkov.tools.netdata.enums.GetDataOptions;
import dtsvetkov.tools.netdata.enums.GroupingMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SimpleNetdataRestClient {

    public static final String CHART_SYSTEM_CPU = "system.cpu";
    public static final String CHART_SYSTEM_LOAD = "system.load";
    public static final String CHART_SYSTEM_RAM = "system.ram";
    public static final String CHART_SYSTEM_NET = "system.net";
    public static final String CHART_DISK_UTIL_PREFIX = "disk_util.";

    protected NetdataRestClient _client = null;

    public SimpleNetdataRestClient(String url) {
        _client = new NetdataRestClient(url);
    }


    protected Map<String, Double> getData(String chart, int seconds) throws Exception {
        Map<String, Double> result = new HashMap<>();
        DataResponse data = _client.getData(chart, null, -seconds, 0, 1,
                GroupingMethod.AVERAGE, 0, GetDataFormat.JSON,
                new GetDataOptions[]{GetDataOptions.SECONDS, GetDataOptions.JSON_WRAP});
        for (int idx=0; idx<data.getResult().getLabels().size(); idx++) {
            String key = data.getResult().getLabels().get(idx);
            Double value = data.getResult().getData().get(0).get(idx);
            result.put(key, value);
        }
        return result;
    }

    /**
     * Returns average CPU usage with <b>user, system, softirq, nice, iowait</b> metrics
     *
     * @param seconds for how many last seconds avg value should be calculated
     * @return
     */
    public CpuLoad getCpuLoad(int seconds) throws Exception {
        CpuLoad result = new CpuLoad();
        Map<String, Double> data = getData(CHART_SYSTEM_CPU, seconds);
        result.setUser(data.get("user"));
        result.setSystem(data.get("system"));
        result.setSoftirq(data.get("softirq"));
        result.setNice(data.get("nice"));
        result.setIowait(data.get("iowait"));
        return result;
    }

    /**
     * Returns average system load metrics as <b>load1, load5, load15</b> metrics
     *
     * @param seconds for how many last seconds avg value should be calculated
     * @return
     */
    public SystemLoad getSystemLoad(int seconds) throws Exception {
        SystemLoad result = new SystemLoad();
        Map<String, Double> data = getData(CHART_SYSTEM_LOAD, seconds);
        result.setLoad1(data.get("load1"));
        result.setLoad5(data.get("load5"));
        result.setLoad15(data.get("load15"));
        return result;
    }

    /**
     * Returns average memory usage with <b>free, used, cached, buffers</b> metrics
     *
     * @param seconds for how many last seconds avg value should be calculated
     * @return
     */

    public MemoryUsage getMemoryUsage(int seconds) throws Exception {
        MemoryUsage result = new MemoryUsage();
        Map<String, Double> data = getData(CHART_SYSTEM_RAM, seconds);
        result.setFree(data.get("free"));
        result.setUsed(data.get("used"));
        result.setCached(data.get("cached"));
        result.setBuffers(data.get("buffers"));
        return result;
    }

    /**
     * Returns average network utilization with <b>sent, received</b> metrics
     *
     * @param seconds for how many last seconds avg value should be calculated
     * @return
     */
    public NetworkUtilization getNetworkUtilization(int seconds) throws Exception {
        NetworkUtilization result = new NetworkUtilization();
        Map<String, Double> data = getData(CHART_SYSTEM_NET, seconds);
        result.setSent(data.get("sent"));
        result.setReceived(data.get("received"));
        return result;
    }


    /**
     * Returns average disks utilization as map <b>disk - utilization value</b>
     *
     * @param seconds for how many last seconds avg value should be calculated
     * @return
     */
    public DisksUtilization getDisksUtilization(int seconds) throws Exception {
        DisksUtilization result = new DisksUtilization();

        // get list if all disk in that system
        Set<String> disks = new TreeSet<>();
        ChartsResponse charts = _client.getCharts();
        for (Map.Entry entry : charts.getCharts().entrySet()){
            String chartName = entry.getKey().toString();
            if (chartName.startsWith(CHART_DISK_UTIL_PREFIX)){
                String diskName = chartName.substring(CHART_DISK_UTIL_PREFIX.length(), chartName.length());
                disks.add(diskName);
            }
        }

        // for each disk get its utilization value
        for (String disk : disks) {
            Map<String, Double> data = getData(CHART_DISK_UTIL_PREFIX + disk, seconds);
            result.put(disk, data.get("utilization"));
        }

        return result;
    }

}
