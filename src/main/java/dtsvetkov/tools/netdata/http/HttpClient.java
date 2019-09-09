package dtsvetkov.tools.netdata.http;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class HttpClient {

    public static int TIMEOUT = 5; // seconds

    protected static Logger log = LoggerFactory.getLogger(HttpClient.class);

    protected HttpClientBuilder httpClientBuilder;


    protected HttpClientBuilder getHttpClientBuilder() {
        if (this.httpClientBuilder == null) {

            HttpClientBuilder builder = HttpClientBuilder.create();

            // setup proxy, if set
            // get https_proxy environment variable
            String envVarHttpProxy = System.getenv("https_proxy");
            // in case if https_proxy is not set, try http_proxy
            envVarHttpProxy = envVarHttpProxy != null ? envVarHttpProxy : System.getenv("http_proxy");
            if (envVarHttpProxy != null) {
                String s = envVarHttpProxy.replaceAll("http://", "").replaceAll("https://", "");
                String[] pairHostPort = s.split(":");
                String proxyHost = pairHostPort[0];
                Integer proxyPort = Integer.parseInt(pairHostPort[1]);
                HttpHost proxy = new HttpHost(proxyHost, proxyPort);
                builder.setProxy(proxy);
            }

            this.httpClientBuilder = builder;
        }

        return this.httpClientBuilder;
    }


    public String httpGet(String url) throws Exception {
        return httpGet(url, null);
    }

    private URI getUri(String url, Map<String, String> params) throws URISyntaxException {
        URIBuilder uriBuilder = new URIBuilder(url);

        if (params != null) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                uriBuilder.addParameter(entry.getKey(), entry.getValue());
            }
        }
        return uriBuilder.build();
    }

    public String httpGet(String url, Map<String, String> params) throws Exception {
        try {
            HttpGet httpGet = new HttpGet(getUri(url, params));
            return execute(httpGet);
        } catch (Exception e) {
            String errMsg = String.format("An error occurred during executing HTTP GET: \nURL: %s\nparam: %s", url, params);
            log.error(errMsg, e);
            throw new Exception(errMsg, e);
        }
    }


    public String httpPutJson(String url, String json) throws Exception {
        return httpPutJson(url, null, json);
    }

    public String httpPutJson(String url, Map<String, String> params, String json) throws Exception {
        return httpPut(url, params, json, "application/json");
    }

    public String httpPut(String url, Map<String, String> params, String content, String contentType) throws Exception {
        try {
            HttpPut httpPut = new HttpPut(getUri(url, params));
            if (content != null) {
                httpPut.setEntity(new StringEntity(content));
                httpPut.setHeader("Content-type", contentType);
            }

            return execute(httpPut);
        } catch (Exception e) {
            String errMsg = String.format("An error occurred during executing HTTP PUT: \nURL: %s\nparam: %s", url, params);
            log.error(errMsg, e);
            throw new Exception(errMsg, e);
        }
    }

    protected String execute(HttpRequestBase request) throws IOException {
        RequestConfig.Builder requestConfig = RequestConfig
                .custom()
                .setConnectTimeout(TIMEOUT * 1000)
                .setConnectionRequestTimeout(TIMEOUT * 1000)
                .setSocketTimeout(TIMEOUT * 1000);

        request.setConfig(requestConfig.build());

        CloseableHttpResponse response = getHttpClientBuilder().build().execute(request);
        return IOUtils.toString(response.getEntity().getContent(), "UTF-8");
    }

}
