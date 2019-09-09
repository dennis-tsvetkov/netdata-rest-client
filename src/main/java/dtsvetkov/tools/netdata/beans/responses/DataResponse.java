package dtsvetkov.tools.netdata.beans.responses;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "api",
        "id",
        "name",
        "view_update_every",
        "update_every",
        "first_entry",
        "last_entry",
        "before",
        "after",
        "dimension_names",
        "dimension_ids",
        "latest_values",
        "view_latest_values",
        "dimensions",
        "points",
        "format",
        "result",
        "min",
        "max",
        "labels",
        "data"
})
public class DataResponse {

    @JsonProperty("api")
    private Integer api;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("view_update_every")
    private Integer viewUpdateEvery;
    @JsonProperty("update_every")
    private Integer updateEvery;
    @JsonProperty("first_entry")
    private Integer firstEntry;
    @JsonProperty("last_entry")
    private Integer lastEntry;
    @JsonProperty("before")
    private Integer before;
    @JsonProperty("after")
    private Integer after;
    @JsonProperty("dimension_names")
    private List<String> dimensionNames = null;
    @JsonProperty("dimension_ids")
    private List<String> dimensionIds = null;
    @JsonProperty("latest_values")
    private List<Integer> latestValues = null;
    @JsonProperty("view_latest_values")
    private List<Integer> viewLatestValues = null;
    @JsonProperty("dimensions")
    private Integer dimensions;
    @JsonProperty("points")
    private Integer points;
    @JsonProperty("format")
    private String format;
    @JsonProperty("result")
    private Result result;
    @JsonProperty("min")
    private Integer min;
    @JsonProperty("max")
    private Double max;
    @JsonProperty("labels")
    private List<String> labels = null;
    @JsonProperty("data")
    private List<List<Double>> data = null;

    @JsonProperty("api")
    public Integer getApi() {
        return api;
    }

    @JsonProperty("api")
    public void setApi(Integer api) {
        this.api = api;
    }

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

    @JsonProperty("view_update_every")
    public Integer getViewUpdateEvery() {
        return viewUpdateEvery;
    }

    @JsonProperty("view_update_every")
    public void setViewUpdateEvery(Integer viewUpdateEvery) {
        this.viewUpdateEvery = viewUpdateEvery;
    }

    @JsonProperty("update_every")
    public Integer getUpdateEvery() {
        return updateEvery;
    }

    @JsonProperty("update_every")
    public void setUpdateEvery(Integer updateEvery) {
        this.updateEvery = updateEvery;
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

    @JsonProperty("before")
    public Integer getBefore() {
        return before;
    }

    @JsonProperty("before")
    public void setBefore(Integer before) {
        this.before = before;
    }

    @JsonProperty("after")
    public Integer getAfter() {
        return after;
    }

    @JsonProperty("after")
    public void setAfter(Integer after) {
        this.after = after;
    }

    @JsonProperty("dimension_names")
    public List<String> getDimensionNames() {
        return dimensionNames;
    }

    @JsonProperty("dimension_names")
    public void setDimensionNames(List<String> dimensionNames) {
        this.dimensionNames = dimensionNames;
    }

    @JsonProperty("dimension_ids")
    public List<String> getDimensionIds() {
        return dimensionIds;
    }

    @JsonProperty("dimension_ids")
    public void setDimensionIds(List<String> dimensionIds) {
        this.dimensionIds = dimensionIds;
    }

    @JsonProperty("latest_values")
    public List<Integer> getLatestValues() {
        return latestValues;
    }

    @JsonProperty("latest_values")
    public void setLatestValues(List<Integer> latestValues) {
        this.latestValues = latestValues;
    }

    @JsonProperty("view_latest_values")
    public List<Integer> getViewLatestValues() {
        return viewLatestValues;
    }

    @JsonProperty("view_latest_values")
    public void setViewLatestValues(List<Integer> viewLatestValues) {
        this.viewLatestValues = viewLatestValues;
    }

    @JsonProperty("dimensions")
    public Integer getDimensions() {
        return dimensions;
    }

    @JsonProperty("dimensions")
    public void setDimensions(Integer dimensions) {
        this.dimensions = dimensions;
    }

    @JsonProperty("points")
    public Integer getPoints() {
        return points;
    }

    @JsonProperty("points")
    public void setPoints(Integer points) {
        this.points = points;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    @JsonProperty("result")
    public Result getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Result result) {
        this.result = result;
    }

    @JsonProperty("min")
    public Integer getMin() {
        return min;
    }

    @JsonProperty("min")
    public void setMin(Integer min) {
        this.min = min;
    }

    @JsonProperty("max")
    public Double getMax() {
        return max;
    }

    @JsonProperty("max")
    public void setMax(Double max) {
        this.max = max;
    }

    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    @JsonProperty("data")
    public List<List<Double>> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<List<Double>> data) {
        this.data = data;
    }



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "labels",
            "data"
    })
    public static class Result {

        @JsonProperty("labels")
        private List<String> labels = null;
        @JsonProperty("data")
        private List<List<Double>> data = null;

        @JsonProperty("labels")
        public List<String> getLabels() {
            return labels;
        }

        @JsonProperty("labels")
        public void setLabels(List<String> labels) {
            this.labels = labels;
        }

        @JsonProperty("data")
        public List<List<Double>> getData() {
            return data;
        }

        @JsonProperty("data")
        public void setData(List<List<Double>> data) {
            this.data = data;
        }

    }


}