package dtsvetkov.tools.netdata.beans.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "type",
        "family",
        "context",
        "title",
        "priority",
        "plugin",
        "module",
        "enabled",
        "units",
        "data_url",
        "chart_type",
        "duration",
        "first_entry",
        "last_entry",
        "update_every",
        "dimensions",
        "green",
        "red",
        "alarms"
})
public class ChartResponse {


    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("family")
    private String family;
    @JsonProperty("context")
    private String context;
    @JsonProperty("title")
    private String title;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("plugin")
    private String plugin;
    @JsonProperty("module")
    private String module;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("units")
    private String units;
    @JsonProperty("data_url")
    private String dataUrl;
    @JsonProperty("chart_type")
    private String chartType;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("first_entry")
    private Integer firstEntry;
    @JsonProperty("last_entry")
    private Integer lastEntry;
    @JsonProperty("update_every")
    private Integer updateEvery;
    @JsonProperty("dimensions")
    private Map<String, Dimension> dimensions;
    @JsonProperty("green")
    private Object green;
    @JsonProperty("red")
    private Object red;
    @JsonProperty("alarms")
    private Map<String, Alarm> alarms;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("family")
    public String getFamily() {
        return family;
    }

    @JsonProperty("family")
    public void setFamily(String family) {
        this.family = family;
    }

    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    @JsonProperty("context")
    public void setContext(String context) {
        this.context = context;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @JsonProperty("plugin")
    public String getPlugin() {
        return plugin;
    }

    @JsonProperty("plugin")
    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    @JsonProperty("module")
    public String getModule() {
        return module;
    }

    @JsonProperty("module")
    public void setModule(String module) {
        this.module = module;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("units")
    public String getUnits() {
        return units;
    }

    @JsonProperty("units")
    public void setUnits(String units) {
        this.units = units;
    }

    @JsonProperty("data_url")
    public String getDataUrl() {
        return dataUrl;
    }

    @JsonProperty("data_url")
    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }

    @JsonProperty("chart_type")
    public String getChartType() {
        return chartType;
    }

    @JsonProperty("chart_type")
    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("first_entry")
    public Integer getFirstEntry() {
        return firstEntry;
    }

    @JsonProperty("first_entry")
    public void setFirstEntry(Integer firstEntry) {
        this.firstEntry = firstEntry;
    }

    @JsonProperty("last_entry")
    public Integer getLastEntry() {
        return lastEntry;
    }

    @JsonProperty("last_entry")
    public void setLastEntry(Integer lastEntry) {
        this.lastEntry = lastEntry;
    }

    @JsonProperty("update_every")
    public Integer getUpdateEvery() {
        return updateEvery;
    }

    @JsonProperty("update_every")
    public void setUpdateEvery(Integer updateEvery) {
        this.updateEvery = updateEvery;
    }

    @JsonProperty("dimensions")
    public Map<String, Dimension> getDimensions() {
        return dimensions;
    }

    @JsonProperty("dimensions")
    public void setDimensions(Map<String, Dimension> dimensions) {
        this.dimensions = dimensions;
    }

    @JsonProperty("green")
    public Object getGreen() {
        return green;
    }

    @JsonProperty("green")
    public void setGreen(Object green) {
        this.green = green;
    }

    @JsonProperty("red")
    public Object getRed() {
        return red;
    }

    @JsonProperty("red")
    public void setRed(Object red) {
        this.red = red;
    }

    @JsonProperty("alarms")
    public Map<String, Alarm> getAlarms() {
        return alarms;
    }

    @JsonProperty("alarms")
    public void setAlarms(Map<String, Alarm> alarms) {
        this.alarms = alarms;
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "name"
    })
    public static class Dimension {

        @JsonProperty("name")
        private String name;

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "id",
            "status",
            "units",
            "update_every"
    })
    public static class Alarm {

        @JsonProperty("id")
        private Integer id;
        @JsonProperty("status")
        private String status;
        @JsonProperty("units")
        private String units;
        @JsonProperty("update_every")
        private Integer updateEvery;

        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        @JsonProperty("id")
        public void setId(Integer id) {
            this.id = id;
        }

        @JsonProperty("status")
        public String getStatus() {
            return status;
        }

        @JsonProperty("status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty("units")
        public String getUnits() {
            return units;
        }

        @JsonProperty("units")
        public void setUnits(String units) {
            this.units = units;
        }

        @JsonProperty("update_every")
        public Integer getUpdateEvery() {
            return updateEvery;
        }

        @JsonProperty("update_every")
        public void setUpdateEvery(Integer updateEvery) {
            this.updateEvery = updateEvery;
        }

    }

}