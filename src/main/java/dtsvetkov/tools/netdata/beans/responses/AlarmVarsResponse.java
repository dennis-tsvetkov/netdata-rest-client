package dtsvetkov.tools.netdata.beans.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "chart",
        "chart_name",
        "chart_context",
        "chart_variables",
        "family",
        "family_variables",
        "host",
        "host_variables"
})
public class AlarmVarsResponse {

    @JsonProperty("chart")
    private String chart;
    @JsonProperty("chart_name")
    private String chartName;
    @JsonProperty("chart_context")
    private String chartContext;
    @JsonProperty("chart_variables")
    private Map<String, Object> chartVariables;
    @JsonProperty("family")
    private String family;
    @JsonProperty("family_variables")
    private Map<String, Object> familyVariables;
    @JsonProperty("host")
    private String host;
    @JsonProperty("host_variables")
    private Map<String, Object> hostVariables;

    @JsonProperty("chart")
    public String getChart() {
        return chart;
    }

    @JsonProperty("chart")
    public void setChart(String chart) {
        this.chart = chart;
    }

    @JsonProperty("chart_name")
    public String getChartName() {
        return chartName;
    }

    @JsonProperty("chart_name")
    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    @JsonProperty("chart_context")
    public String getChartContext() {
        return chartContext;
    }

    @JsonProperty("chart_context")
    public void setChartContext(String chartContext) {
        this.chartContext = chartContext;
    }

    @JsonProperty("chart_variables")
    public Map<String, Object> getChartVariables() {
        return chartVariables;
    }

    @JsonProperty("chart_variables")
    public void setChartVariables(Map<String, Object> chartVariables) {
        this.chartVariables = chartVariables;
    }

    @JsonProperty("family")
    public String getFamily() {
        return family;
    }

    @JsonProperty("family")
    public void setFamily(String family) {
        this.family = family;
    }

    @JsonProperty("family_variables")
    public Map<String, Object> getFamilyVariables() {
        return familyVariables;
    }

    @JsonProperty("family_variables")
    public void setFamilyVariables(Map<String, Object> familyVariables) {
        this.familyVariables = familyVariables;
    }

    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    @JsonProperty("host_variables")
    public Map<String, Object> getHostVariables() {
        return hostVariables;
    }

    @JsonProperty("host_variables")
    public void setHostVariables(Map<String, Object> hostVariables) {
        this.hostVariables = hostVariables;
    }

}