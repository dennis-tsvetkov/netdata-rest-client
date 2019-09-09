package dtsvetkov.tools.netdata;

import dtsvetkov.tools.netdata.beans.simple.*;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class TestSimpleNetdataRestClient {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    protected final String URL = "http://localhost:30001";
    protected SimpleNetdataRestClient client;

    @Before
    public void before() {
        client = new SimpleNetdataRestClient(URL);
    }

    @Test
    public void test_getCpuLoad() throws Exception {
        CpuLoad cpuLoad = client.getCpuLoad(3);
        assert cpuLoad.getUser() > 0;
        assert cpuLoad.getSystem() > 0;
    }

    @Test
    public void test_getSystemLoad() throws Exception {
        SystemLoad systemLoad = client.getSystemLoad(3);
        assert systemLoad.getLoad1() > 0;
        assert systemLoad.getLoad5() > 0;
        assert systemLoad.getLoad15() > 0;
    }

    @Test
    public void test_getMemoryUsage() throws Exception {
        MemoryUsage memoryUsage = client.getMemoryUsage(3);
        assert memoryUsage.getFree() > 0;
        assert memoryUsage.getUsed() > 0;
        assert memoryUsage.getCached() > 0;
    }

    @Test
    public void test_getNetworkUtilization() throws Exception {
        NetworkUtilization networkUtilization = client.getNetworkUtilization(3);
        assert networkUtilization.getSent() < 0;
        assert networkUtilization.getReceived() > 0;
    }

    @Test
    public void test_getDisksUtilization() throws Exception {
        DisksUtilization disksUtilization = client.getDisksUtilization(3);
        for (Map.Entry<String, Double> entry : disksUtilization.entrySet()) {
            assert entry.getValue() > 0;
        }
    }




    @Test
    public void test_() {
    }

}

