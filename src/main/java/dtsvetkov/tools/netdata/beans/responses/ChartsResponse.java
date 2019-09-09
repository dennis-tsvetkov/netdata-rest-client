package dtsvetkov.tools.netdata.beans.responses;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "hostname",
        "version",
        "release_channel",
        "os",
        "timezone",
        "update_every",
        "history",
        "custom_info",
        "charts",
        "charts_count",
        "dimensions_count",
        "alarms_count",
        "rrd_memory_bytes",
        "hosts_count",
        "hosts"
})
public class ChartsResponse {

    @JsonProperty("hostname")
    private String hostname;
    @JsonProperty("version")
    private String version;
    @JsonProperty("release_channel")
    private String releaseChannel;
    @JsonProperty("os")
    private String os;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("update_every")
    private Integer updateEvery;
    @JsonProperty("history")
    private Integer history;
    @JsonProperty("custom_info")
    private String customInfo;
    @JsonProperty("charts")
    private Map<String, ChartResponse> charts;
    @JsonProperty("charts_count")
    private Integer chartsCount;
    @JsonProperty("dimensions_count")
    private Integer dimensionsCount;
    @JsonProperty("alarms_count")
    private Integer alarmsCount;
    @JsonProperty("rrd_memory_bytes")
    private Integer rrdMemoryBytes;
    @JsonProperty("hosts_count")
    private Integer hostsCount;
    @JsonProperty("hosts")
    private List<Host> hosts = null;

    @JsonProperty("hostname")
    public String getHostname() {
        return hostname;
    }

    @JsonProperty("hostname")
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("release_channel")
    public String getReleaseChannel() {
        return releaseChannel;
    }

    @JsonProperty("release_channel")
    public void setReleaseChannel(String releaseChannel) {
        this.releaseChannel = releaseChannel;
    }

    @JsonProperty("os")
    public String getOs() {
        return os;
    }

    @JsonProperty("os")
    public void setOs(String os) {
        this.os = os;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("update_every")
    public Integer getUpdateEvery() {
        return updateEvery;
    }

    @JsonProperty("update_every")
    public void setUpdateEvery(Integer updateEvery) {
        this.updateEvery = updateEvery;
    }

    @JsonProperty("history")
    public Integer getHistory() {
        return history;
    }

    @JsonProperty("history")
    public void setHistory(Integer history) {
        this.history = history;
    }

    @JsonProperty("custom_info")
    public String getCustomInfo() {
        return customInfo;
    }

    @JsonProperty("custom_info")
    public void setCustomInfo(String customInfo) {
        this.customInfo = customInfo;
    }

    @JsonProperty("charts")
    public Map<String, ChartResponse> getCharts() {
        return charts;
    }

    @JsonProperty("charts")
    public void setCharts(Map<String, ChartResponse> charts) {
        this.charts = charts;
    }

    @JsonProperty("charts_count")
    public Integer getChartsCount() {
        return chartsCount;
    }

    @JsonProperty("charts_count")
    public void setChartsCount(Integer chartsCount) {
        this.chartsCount = chartsCount;
    }

    @JsonProperty("dimensions_count")
    public Integer getDimensionsCount() {
        return dimensionsCount;
    }

    @JsonProperty("dimensions_count")
    public void setDimensionsCount(Integer dimensionsCount) {
        this.dimensionsCount = dimensionsCount;
    }

    @JsonProperty("alarms_count")
    public Integer getAlarmsCount() {
        return alarmsCount;
    }

    @JsonProperty("alarms_count")
    public void setAlarmsCount(Integer alarmsCount) {
        this.alarmsCount = alarmsCount;
    }

    @JsonProperty("rrd_memory_bytes")
    public Integer getRrdMemoryBytes() {
        return rrdMemoryBytes;
    }

    @JsonProperty("rrd_memory_bytes")
    public void setRrdMemoryBytes(Integer rrdMemoryBytes) {
        this.rrdMemoryBytes = rrdMemoryBytes;
    }

    @JsonProperty("hosts_count")
    public Integer getHostsCount() {
        return hostsCount;
    }

    @JsonProperty("hosts_count")
    public void setHostsCount(Integer hostsCount) {
        this.hostsCount = hostsCount;
    }

    @JsonProperty("hosts")
    public List<Host> getHosts() {
        return hosts;
    }

    @JsonProperty("hosts")
    public void setHosts(List<Host> hosts) {
        this.hosts = hosts;
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "hostname"
    })
    public static class Host {

        @JsonProperty("hostname")
        private String hostname;

        @JsonProperty("hostname")
        public String getHostname() {
            return hostname;
        }

        @JsonProperty("hostname")
        public void setHostname(String hostname) {
            this.hostname = hostname;
        }
    }


}