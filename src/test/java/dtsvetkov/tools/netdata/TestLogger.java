package dtsvetkov.tools.netdata;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Test
    public void testLogger() {
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }

}
