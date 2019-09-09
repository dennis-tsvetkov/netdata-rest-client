package dtsvetkov.tools.netdata.beans.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;

public class AlarmLogResponse extends ArrayList<AlarmLogResponse.AlarmLogEntry> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "hostname",
            "unique_id",
            "alarm_id",
            "alarm_event_id",
            "name",
            "chart",
            "family",
            "processed",
            "updated",
            "exec_run",
            "exec_failed",
            "exec",
            "recipient",
            "exec_code",
            "source",
            "units",
            "when",
            "duration",
            "non_clear_duration",
            "status",
            "old_status",
            "delay",
            "delay_up_to_timestamp",
            "updated_by_id",
            "updates_id",
            "value_string",
            "old_value_string",
            "silenced",
            "info",
            "no_clear_notification",
            "value",
            "old_value"
    })
    public static class AlarmLogEntry {

        @JsonProperty("hostname")
        private String hostname;
        @JsonProperty("unique_id")
        private Integer uniqueId;
        @JsonProperty("alarm_id")
        private Integer alarmId;
        @JsonProperty("alarm_event_id")
        private Integer alarmEventId;
        @JsonProperty("name")
        private String name;
        @JsonProperty("chart")
        private String chart;
        @JsonProperty("family")
        private String family;
        @JsonProperty("processed")
        private Boolean processed;
        @JsonProperty("updated")
        private Boolean updated;
        @JsonProperty("exec_run")
        private Integer execRun;
        @JsonProperty("exec_failed")
        private Boolean execFailed;
        @JsonProperty("exec")
        private String exec;
        @JsonProperty("recipient")
        private String recipient;
        @JsonProperty("exec_code")
        private Integer execCode;
        @JsonProperty("source")
        private String source;
        @JsonProperty("units")
        private String units;
        @JsonProperty("when")
        private Integer when;
        @JsonProperty("duration")
        private Integer duration;
        @JsonProperty("non_clear_duration")
        private Integer nonClearDuration;
        @JsonProperty("status")
        private String status;
        @JsonProperty("old_status")
        private String oldStatus;
        @JsonProperty("delay")
        private Integer delay;
        @JsonProperty("delay_up_to_timestamp")
        private Integer delayUpToTimestamp;
        @JsonProperty("updated_by_id")
        private Integer updatedById;
        @JsonProperty("updates_id")
        private Integer updatesId;
        @JsonProperty("value_string")
        private String valueString;
        @JsonProperty("old_value_string")
        private String oldValueString;
        @JsonProperty("silenced")
        private String silenced;
        @JsonProperty("info")
        private String info;
        @JsonProperty("no_clear_notification")
        private Boolean noClearNotification;
        @JsonProperty("value")
        private Double value;
        @JsonProperty("old_value")
        private Double oldValue;

        @JsonProperty("hostname")
        public String getHostname() {
            return hostname;
        }

        @JsonProperty("hostname")
        public void setHostname(String hostname) {
            this.hostname = hostname;
        }

        @JsonProperty("unique_id")
        public Integer getUniqueId() {
            return uniqueId;
        }

        @JsonProperty("unique_id")
        public void setUniqueId(Integer uniqueId) {
            this.uniqueId = uniqueId;
        }

        @JsonProperty("alarm_id")
        public Integer getAlarmId() {
            return alarmId;
        }

        @JsonProperty("alarm_id")
        public void setAlarmId(Integer alarmId) {
            this.alarmId = alarmId;
        }

        @JsonProperty("alarm_event_id")
        public Integer getAlarmEventId() {
            return alarmEventId;
        }

        @JsonProperty("alarm_event_id")
        public void setAlarmEventId(Integer alarmEventId) {
            this.alarmEventId = alarmEventId;
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

        @JsonProperty("processed")
        public Boolean getProcessed() {
            return processed;
        }

        @JsonProperty("processed")
        public void setProcessed(Boolean processed) {
            this.processed = processed;
        }

        @JsonProperty("updated")
        public Boolean getUpdated() {
            return updated;
        }

        @JsonProperty("updated")
        public void setUpdated(Boolean updated) {
            this.updated = updated;
        }

        @JsonProperty("exec_run")
        public Integer getExecRun() {
            return execRun;
        }

        @JsonProperty("exec_run")
        public void setExecRun(Integer execRun) {
            this.execRun = execRun;
        }

        @JsonProperty("exec_failed")
        public Boolean getExecFailed() {
            return execFailed;
        }

        @JsonProperty("exec_failed")
        public void setExecFailed(Boolean execFailed) {
            this.execFailed = execFailed;
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

        @JsonProperty("exec_code")
        public Integer getExecCode() {
            return execCode;
        }

        @JsonProperty("exec_code")
        public void setExecCode(Integer execCode) {
            this.execCode = execCode;
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

        @JsonProperty("when")
        public Integer getWhen() {
            return when;
        }

        @JsonProperty("when")
        public void setWhen(Integer when) {
            this.when = when;
        }

        @JsonProperty("duration")
        public Integer getDuration() {
            return duration;
        }

        @JsonProperty("duration")
        public void setDuration(Integer duration) {
            this.duration = duration;
        }

        @JsonProperty("non_clear_duration")
        public Integer getNonClearDuration() {
            return nonClearDuration;
        }

        @JsonProperty("non_clear_duration")
        public void setNonClearDuration(Integer nonClearDuration) {
            this.nonClearDuration = nonClearDuration;
        }

        @JsonProperty("status")
        public String getStatus() {
            return status;
        }

        @JsonProperty("status")
        public void setStatus(String status) {
            this.status = status;
        }

        @JsonProperty("old_status")
        public String getOldStatus() {
            return oldStatus;
        }

        @JsonProperty("old_status")
        public void setOldStatus(String oldStatus) {
            this.oldStatus = oldStatus;
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

        @JsonProperty("updated_by_id")
        public Integer getUpdatedById() {
            return updatedById;
        }

        @JsonProperty("updated_by_id")
        public void setUpdatedById(Integer updatedById) {
            this.updatedById = updatedById;
        }

        @JsonProperty("updates_id")
        public Integer getUpdatesId() {
            return updatesId;
        }

        @JsonProperty("updates_id")
        public void setUpdatesId(Integer updatesId) {
            this.updatesId = updatesId;
        }

        @JsonProperty("value_string")
        public String getValueString() {
            return valueString;
        }

        @JsonProperty("value_string")
        public void setValueString(String valueString) {
            this.valueString = valueString;
        }

        @JsonProperty("old_value_string")
        public String getOldValueString() {
            return oldValueString;
        }

        @JsonProperty("old_value_string")
        public void setOldValueString(String oldValueString) {
            this.oldValueString = oldValueString;
        }

        @JsonProperty("silenced")
        public String getSilenced() {
            return silenced;
        }

        @JsonProperty("silenced")
        public void setSilenced(String silenced) {
            this.silenced = silenced;
        }

        @JsonProperty("info")
        public String getInfo() {
            return info;
        }

        @JsonProperty("info")
        public void setInfo(String info) {
            this.info = info;
        }

        @JsonProperty("no_clear_notification")
        public Boolean getNoClearNotification() {
            return noClearNotification;
        }

        @JsonProperty("no_clear_notification")
        public void setNoClearNotification(Boolean noClearNotification) {
            this.noClearNotification = noClearNotification;
        }

        @JsonProperty("value")
        public Double getValue() {
            return value;
        }

        @JsonProperty("value")
        public void setValue(Double value) {
            this.value = value;
        }

        @JsonProperty("old_value")
        public Double getOldValue() {
            return oldValue;
        }

        @JsonProperty("old_value")
        public void setOldValue(Double oldValue) {
            this.oldValue = oldValue;
        }

    }
}