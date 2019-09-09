package dtsvetkov.tools.netdata.beans.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "hostname",
        "latest_alarm_log_unique_id",
        "status",
        "now",
        "alarms"
})
public class AlarmsResponse {

    @JsonProperty("hostname")
    private String hostname;
    @JsonProperty("latest_alarm_log_unique_id")
    private Integer latestAlarmLogUniqueId;
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("now")
    private Integer now;
    @JsonProperty("alarms")
    private Map<String, Alarm> alarms;

    @JsonProperty("hostname")
    public String getHostname() {
        return hostname;
    }

    @JsonProperty("hostname")
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @JsonProperty("latest_alarm_log_unique_id")
    public Integer getLatestAlarmLogUniqueId() {
        return latestAlarmLogUniqueId;
    }

    @JsonProperty("latest_alarm_log_unique_id")
    public void setLatestAlarmLogUniqueId(Integer latestAlarmLogUniqueId) {
        this.latestAlarmLogUniqueId = latestAlarmLogUniqueId;
    }

    @JsonProperty("status")
    public Boolean getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Boolean status) {
        this.status = status;
    }

    @JsonProperty("now")
    public Integer getNow() {
        return now;
    }

    @JsonProperty("now")
    public void setNow(Integer now) {
        this.now = now;
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
            "id",
            "name",
            "chart",
            "family",
            "active",
            "disabled",
            "silenced",
            "exec",
            "recipient",
            "source",
            "units",
            "info",
            "status",
            "last_status_change",
            "last_updated",
            "next_update",
            "update_every",
            "delay_up_duration",
            "delay_down_duration",
            "delay_max_duration",
            "delay_multiplier",
            "delay",
            "delay_up_to_timestamp",
            "value_string",
            "no_clear_notification",
            "lookup_dimensions",
            "db_after",
            "db_before",
            "lookup_method",
            "lookup_after",
            "lookup_before",
            "lookup_options",
            "calc",
            "calc_parsed",
            "warn",
            "warn_parsed",
            "crit",
            "crit_parsed",
            "green",
            "red",
            "value"
    })
    public static class Alarm {

        @JsonProperty("id")
        private Integer id;
        @JsonProperty("name")
        private String name;
        @JsonProperty("chart")
        private String chart;
        @JsonProperty("family")
        private String family;
        @JsonProperty("active")
        private Boolean active;
        @JsonProperty("disabled")
        private Boolean disabled;
        @JsonProperty("silenced")
        private Boolean silenced;
        @JsonProperty("exec")
        private String exec;
        @JsonProperty("recipient")
        private String recipient;
        @JsonProperty("source")
        private String source;
        @JsonProperty("units")
        private String units;
        @JsonProperty("info")
        private String info;
        @JsonProperty("status")
        private String status;
        @JsonProperty("last_status_change")
        private Integer lastStatusChange;
        @JsonProperty("last_updated")
        private Integer lastUpdated;
        @JsonProperty("next_update")
        private Integer nextUpdate;
        @JsonProperty("update_every")
        private Integer updateEvery;
        @JsonProperty("delay_up_duration")
        private Integer delayUpDuration;
        @JsonProperty("delay_down_duration")
        private Integer delayDownDuration;
        @JsonProperty("delay_max_duration")
        private Integer delayMaxDuration;
        @JsonProperty("delay_multiplier")
        private Double delayMultiplier;
        @JsonProperty("delay")
        private Integer delay;
        @JsonProperty("delay_up_to_timestamp")
        private Integer delayUpToTimestamp;
        @JsonProperty("value_string")
        private String valueString;
        @JsonProperty("no_clear_notification")
        private Boolean noClearNotification;
        @JsonProperty("lookup_dimensions")
        private String lookupDimensions;
        @JsonProperty("db_after")
        private Integer dbAfter;
        @JsonProperty("db_before")
        private Integer dbBefore;
        @JsonProperty("lookup_method")
        private String lookupMethod;
        @JsonProperty("lookup_after")
        private Integer lookupAfter;
        @JsonProperty("lookup_before")
        private Integer lookupBefore;
        @JsonProperty("lookup_options")
        private String lookupOptions;
        @JsonProperty("calc")
        private String calc;
        @JsonProperty("calc_parsed")
        private String calcParsed;
        @JsonProperty("warn")
        private String warn;
        @JsonProperty("warn_parsed")
        private String warnParsed;
        @JsonProperty("crit")
        private String crit;
        @JsonProperty("crit_parsed")
        private String critParsed;
        @JsonProperty("green")
        private Object green;
        @JsonProperty("red")
        private Object red;
        @JsonProperty("value")
        private Double value;

        @JsonProperty("id")
        public Integer getId() {
            return id;
        }

        @JsonProperty("id")
        public void setId(Integer id) {
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

        @JsonProperty("chart")
        public String getChart() {
            return chart;
        }

        @JsonProperty("chart")
        public void setChart(String chart) {
            this.chart = chart;
        }

        @JsonProperty("family")
        public String getFamily() {
            return family;
        }

        @JsonProperty("family")
        public void setFamily(String family) {
            this.family = family;
        }

        @JsonProperty("active")
        public Boolean getActive() {
            return active;
        }

        @JsonProperty("active")
        public void setActive(Boolean active) {
            this.active = active;
        }

        @JsonProperty("disabled")
        public Boolean getDisabled() {
            return disabled;
        }

        @JsonProperty("disabled")
        public void setDisabled(Boolean disabled) {
            this.disabled = disabled;
        }

        @JsonProperty("silenced")
        public Boolean getSilenced() {
            return silenced;
        }

        @JsonProperty("silenced")
        public void setSilenced(Boolean silenced) {
            this.silenced = silenced;
        }

        @JsonProperty("exec")
        public String getExec() {
            return exec;
        }

        @JsonProperty("exec")
        public void setExec(String exec) {
            this.exec = exec;
        }

        @JsonProperty("recipient")
        public String getRecipient() {
            return recipient;
        }

        @JsonProperty("recipient")
        public void setRecipient(String recipient) {
            this.recipient = recipient;
        }

        @JsonProperty("source")
        public String getSource() {
            return source;
        }

        @JsonProperty("source")
        public void setSource(String source) {
            this.source = source;
        }

        @JsonProperty("units")
        public String getUnits() {
            return units;
        }

        @JsonProperty("units")
        public void setUnits(String units) {
            this.units = units;
        }

        @JsonProperty("info")
        public String getInfo() {
            return info;
        }

        @JsonProperty("info")
        public void setInfo(String info) {
            this.info = info;
        }

        @JsonProperty("status")
        public String getStatus() {
            return status;
        }

        @JsonProperty("status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty("last_status_change")
        public Integer getLastStatusChange() {
            return lastStatusChange;
        }

        @JsonProperty("last_status_change")
        public void setLastStatusChange(Integer lastStatusChange) {
            this.lastStatusChange = lastStatusChange;
        }

        @JsonProperty("last_updated")
        public Integer getLastUpdated() {
            return lastUpdated;
        }

        @JsonProperty("last_updated")
        public void setLastUpdated(Integer lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        @JsonProperty("next_update")
        public Integer getNextUpdate() {
            return nextUpdate;
        }

        @JsonProperty("next_update")
        public void setNextUpdate(Integer nextUpdate) {
            this.nextUpdate = nextUpdate;
        }

        @JsonProperty("update_every")
        public Integer getUpdateEvery() {
            return updateEvery;
        }

        @JsonProperty("update_every")
        public void setUpdateEvery(Integer updateEvery) {
            this.updateEvery = updateEvery;
        }

        @JsonProperty("delay_up_duration")
        public Integer getDelayUpDuration() {
            return delayUpDuration;
        }

        @JsonProperty("delay_up_duration")
        public void setDelayUpDuration(Integer delayUpDuration) {
            this.delayUpDuration = delayUpDuration;
        }

        @JsonProperty("delay_down_duration")
        public Integer getDelayDownDuration() {
            return delayDownDuration;
        }

        @JsonProperty("delay_down_duration")
        public void setDelayDownDuration(Integer delayDownDuration) {
            this.delayDownDuration = delayDownDuration;
        }

        @JsonProperty("delay_max_duration")
        public Integer getDelayMaxDuration() {
            return delayMaxDuration;
        }

        @JsonProperty("delay_max_duration")
        public void setDelayMaxDuration(Integer delayMaxDuration) {
            this.delayMaxDuration = delayMaxDuration;
        }

        @JsonProperty("delay_multiplier")
        public Double getDelayMultiplier() {
            return delayMultiplier;
        }

        @JsonProperty("delay_multiplier")
        public void setDelayMultiplier(Double delayMultiplier) {
            this.delayMultiplier = delayMultiplier;
        }

        @JsonProperty("delay")
        public Integer getDelay() {
            return delay;
        }

        @JsonProperty("delay")
        public void setDelay(Integer delay) {
            this.delay = delay;
        }

        @JsonProperty("delay_up_to_timestamp")
        public Integer getDelayUpToTimestamp() {
            return delayUpToTimestamp;
        }

        @JsonProperty("delay_up_to_timestamp")
        public void setDelayUpToTimestamp(Integer delayUpToTimestamp) {
            this.delayUpToTimestamp = delayUpToTimestamp;
        }

        @JsonProperty("value_string")
        public String getValueString() {
            return valueString;
        }

        @JsonProperty("value_string")
        public void setValueString(String valueString) {
            this.valueString = valueString;
        }

        @JsonProperty("no_clear_notification")
        public Boolean getNoClearNotification() {
            return noClearNotification;
        }

        @JsonProperty("no_clear_notification")
        public void setNoClearNotification(Boolean noClearNotification) {
            this.noClearNotification = noClearNotification;
        }

        @JsonProperty("lookup_dimensions")
        public String getLookupDimensions() {
            return lookupDimensions;
        }

        @JsonProperty("lookup_dimensions")
        public void setLookupDimensions(String lookupDimensions) {
            this.lookupDimensions = lookupDimensions;
        }

        @JsonProperty("db_after")
        public Integer getDbAfter() {
            return dbAfter;
        }

        @JsonProperty("db_after")
        public void setDbAfter(Integer dbAfter) {
            this.dbAfter = dbAfter;
        }

        @JsonProperty("db_before")
        public Integer getDbBefore() {
            return dbBefore;
        }

        @JsonProperty("db_before")
        public void setDbBefore(Integer dbBefore) {
            this.dbBefore = dbBefore;
        }

        @JsonProperty("lookup_method")
        public String getLookupMethod() {
            return lookupMethod;
        }

        @JsonProperty("lookup_method")
        public void setLookupMethod(String lookupMethod) {
            this.lookupMethod = lookupMethod;
        }

        @JsonProperty("lookup_after")
        public Integer getLookupAfter() {
            return lookupAfter;
        }

        @JsonProperty("lookup_after")
        public void setLookupAfter(Integer lookupAfter) {
            this.lookupAfter = lookupAfter;
        }

        @JsonProperty("lookup_before")
        public Integer getLookupBefore() {
            return lookupBefore;
        }

        @JsonProperty("lookup_before")
        public void setLookupBefore(Integer lookupBefore) {
            this.lookupBefore = lookupBefore;
        }

        @JsonProperty("lookup_options")
        public String getLookupOptions() {
            return lookupOptions;
        }

        @JsonProperty("lookup_options")
        public void setLookupOptions(String lookupOptions) {
            this.lookupOptions = lookupOptions;
        }

        @JsonProperty("calc")
        public String getCalc() {
            return calc;
        }

        @JsonProperty("calc")
        public void setCalc(String calc) {
            this.calc = calc;
        }

        @JsonProperty("calc_parsed")
        public String getCalcParsed() {
            return calcParsed;
        }

        @JsonProperty("calc_parsed")
        public void setCalcParsed(String calcParsed) {
            this.calcParsed = calcParsed;
        }

        @JsonProperty("warn")
        public String getWarn() {
            return warn;
        }

        @JsonProperty("warn")
        public void setWarn(String warn) {
            this.warn = warn;
        }

        @JsonProperty("warn_parsed")
        public String getWarnParsed() {
            return warnParsed;
        }

        @JsonProperty("warn_parsed")
        public void setWarnParsed(String warnParsed) {
            this.warnParsed = warnParsed;
        }

        @JsonProperty("crit")
        public String getCrit() {
            return crit;
        }

        @JsonProperty("crit")
        public void setCrit(String crit) {
            this.crit = crit;
        }

        @JsonProperty("crit_parsed")
        public String getCritParsed() {
            return critParsed;
        }

        @JsonProperty("crit_parsed")
        public void setCritParsed(String critParsed) {
            this.critParsed = critParsed;
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

        @JsonProperty("value")
        public Double getValue() {
            return value;
        }

        @JsonProperty("value")
        public void setValue(Double value) {
            this.value = value;
        }

    }
}