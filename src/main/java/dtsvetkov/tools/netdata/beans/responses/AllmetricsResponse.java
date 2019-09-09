package dtsvetkov.tools.netdata.beans.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

public class AllmetricsResponse extends HashMap<String, AllmetricsResponse.Metric> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "name",
            "context",
            "units",
            "last_updated",
            "dimensions"
    })
    public static class Metric {

        @JsonProperty("name")
        private String name;
        @JsonProperty("context")
        private String context;
        @JsonProperty("units")
        private String units;
        @JsonProperty("last_updated")
        private Integer lastUpdated;
        @JsonProperty("dimensions")
        private Map<String, Dimension> dimensions;

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("context")
        public String getContext() {
            return context;
        }

        @JsonProperty("context")
        public void setContext(String context) {
            this.context = context;
        }

        @JsonProperty("units")
        public String getUnits() {
            return units;
        }

        @JsonProperty("units")
        public void setUnits(String units) {
            this.units = units;
        }

        @JsonProperty("last_updated")
        public Integer getLastUpdated() {
            return lastUpdated;
        }

        @JsonProperty("last_updated")
        public void setLastUpdated(Integer lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        @JsonProperty("dimensions")
        public Map<String, Dimension> getDimensions() {
            return dimensions;
        }

        @JsonProperty("dimensions")
        public void setDimensions(Map<String, Dimension> dimensions) {
            this.dimensions = dimensions;
        }

    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "name",
            "value"
    })
    public static class Dimension {

        @JsonProperty("name")
        private String name;
        @JsonProperty("value")
        private Double value;

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
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