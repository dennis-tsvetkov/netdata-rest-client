package dtsvetkov.tools.netdata;

import com.fasterxml.jackson.databind.ObjectMapper;
import dtsvetkov.tools.netdata.beans.responses.*;
import dtsvetkov.tools.netdata.enums.*;
import dtsvetkov.tools.netdata.http.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class NetdataRestClient {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public final String API_PATH = "/api/v1/";

    protected String base_url;


    protected final HttpClient httpClient = new HttpClient();

    public NetdataRestClient(String base_url) {
        this.base_url = base_url;
    }

    protected String getFullUrl(String method) {
        return String.format("%s%s%s", base_url, API_PATH, method);
    }

    protected <T> T parseResponse(String json, Class<T> clazz) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json, clazz);
        } catch (IOException e) {
            String sample = json.substring(0, Math.min(json.length(), 128));
            String errMsg = String.format("Failed to parse json as %s\nsample: %s", clazz.getName(), sample);
            log.error(errMsg, e);
            return null;
        }
    }

    public InfoResponse getInfo() throws Exception {
        String response = httpClient.httpGet(getFullUrl("info"));
        InfoResponse result = parseResponse(response, InfoResponse.class);
        return result;
    }

    public ChartsResponse getCharts() throws Exception {
        String response = httpClient.httpGet(getFullUrl("charts"));
        ChartsResponse result = parseResponse(response, ChartsResponse.class);
        return result;
    }

    public ChartResponse getChart(String chart) throws Exception {
        Map<String, String> params = Collections.singletonMap("chart", chart);
        String response = httpClient.httpGet(getFullUrl("chart"), params);
        ChartResponse result = parseResponse(response, ChartResponse.class);
        return result;
    }

    public AlarmVarsResponse getAlarmVariables(String chart) throws Exception {
        Map<String, String> params = Collections.singletonMap("chart", chart);
        String response = httpClient.httpGet(getFullUrl("alarm_variables"), params);
        AlarmVarsResponse result = parseResponse(response, AlarmVarsResponse.class);
        return result;
    }

    public DataResponse getData(String chart, String[] dimension, int after, int before, int points,
                                GroupingMethod group, int gtime, GetDataFormat format, GetDataOptions[] options) throws Exception {
        Map<String, String> params = new HashMap<String, String>();
        params.put("chart", chart);

        if (dimension != null) {
            params.put("dimension", String.join(",", dimension));
        }

        params.put("after", Integer.toString(after));
        params.put("before", Integer.toString(before));
        params.put("points", Integer.toString(points));
        if (group != null) {
            params.put("group", group.getName());
        }

        params.put("gtime", Integer.toString(gtime));
        if (format != null) {
            params.put("format", format.getName());
        }

        if (options != null) {
            List<String> optionsNames = Arrays.stream(options).map(option -> option.getName()).collect(Collectors.toList());
            params.put("options", String.join(",", optionsNames));
        }

        String response = httpClient.httpGet(getFullUrl("data"), params);
        DataResponse result = parseResponse(response, DataResponse.class);
        return result;
    }

    public DataResponse getData(String chart, int after) throws Exception {
        return getData(chart, null, after, 0, 20, GroupingMethod.AVERAGE, 0,
                GetDataFormat.JSON, new GetDataOptions[]{GetDataOptions.SECONDS, GetDataOptions.JSON_WRAP});
    }


    public String getBadgeSvg(String chart, String alarm, String[] dimension, int after, int before,
                              GroupingMethod group, GetBadgeOptions[] options, String label, String units,
                              String labelColor, String valueColor, Integer multiply, Integer divide, Integer scale) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("chart", chart);
        if (alarm != null) {
            params.put("alarm", alarm);
        }
        if (dimension != null) {
            params.put("dimension", String.join(",", dimension));
        }
        params.put("after", Integer.toString(after));
        params.put("before", Integer.toString(before));
        if (group != null) {
            params.put("group", group.getName());
        }
        if (options != null) {
            List<String> optionsNames = Arrays.stream(options).map(option -> option.getName()).collect(Collectors.toList());
            params.put("options", String.join(",", optionsNames));
        }
        if (label != null) {
            params.put("label", label);
        }
        if (units != null) {
            params.put("units", units);
        }
        if (labelColor != null) {
            params.put("labelColor", labelColor);
        }
        if (valueColor != null) {
            params.put("valueColor", valueColor);
        }
        if (multiply != null) {
            params.put("multiply", multiply.toString());
        }
        if (dimension != null) {
            params.put("divide", divide.toString());
        }
        if (scale != null) {
            params.put("scale", scale.toString());
        }

        String response = httpClient.httpGet(getFullUrl("badge.svg"), params);
        return response;
    }

    public String getBadgeSvg(String chart, int after) throws Exception {
        return getBadgeSvg(chart, null, null, after, 0, GroupingMethod.AVERAGE, new GetBadgeOptions[]{GetBadgeOptions.ABSOLUTE},
                null, null, null, null, null, null, null);
    }


    public String getAllmetrics(GetAllmetricsFormat format, boolean help, boolean types, boolean timestamps,
                                boolean names, boolean oldUnits, boolean hideUnits, String server, String prefix,
                                GetAllmetricsDatasource data) throws Exception {
        Map<String, String> params = new HashMap<>();
        if (format != null) {
            params.put("format", format.getName());
        }
        params.put("help", help ? "yse" : "no");
        params.put("types", types ? "yse" : "no");
        params.put("timestamps", timestamps ? "yse" : "no");
        params.put("names", names ? "yse" : "no");
        params.put("oldUnits", oldUnits ? "yse" : "no");
        params.put("hideUnits", hideUnits ? "yse" : "no");
        if (server != null) {
            params.put("server", server);
        }
        if (prefix != null) {
            params.put("prefix", prefix);
        }
        if (data != null) {
            params.put("data", data.getName());
        }

        String response = httpClient.httpGet(getFullUrl("allmetrics"), params);

        return response;
    }

    public AllmetricsResponse getAllmetrics(boolean help, boolean types, boolean timestamps, boolean names,
                                            boolean oldUnits, boolean hideUnits, String server, String prefix,
                                            GetAllmetricsDatasource data) throws Exception {
        String response = getAllmetrics(GetAllmetricsFormat.JSON, help, types, timestamps, names, oldUnits, hideUnits,
                server, prefix, data);
        AllmetricsResponse result = parseResponse(response, AllmetricsResponse.class);
        return result;
    }

    public AllmetricsResponse getAllmetrics() throws Exception {
        return getAllmetrics(false, false, true, true, true, true,
                null, null, GetAllmetricsDatasource.AVERAGE);
    }

    public AlarmsResponse getAlarms(Boolean all) throws Exception {
        Map<String, String> params = null;
        if (all != null && all) {
            params = Collections.singletonMap("all", null);
        }
        String response = httpClient.httpGet(getFullUrl("alarms"), params);
        AlarmsResponse result = parseResponse(response, AlarmsResponse.class);
        return result;
    }

    public AlarmsResponse getAlarms() throws Exception {
        return getAlarms(null);
    }

    public AlarmLogResponse getAlarmLog(Integer after) throws Exception {
        Map<String, String> params = null;
        if (after != null) {
            params = Collections.singletonMap("after", after.toString());
        }
        String response = httpClient.httpGet(getFullUrl("alarm_log"), params);
        AlarmLogResponse result = parseResponse(response, AlarmLogResponse.class);
        return result;
    }

    public AlarmLogResponse getAlarmLog() throws Exception {
        return getAlarmLog(null);
    }

}
