package com.majortom.kmcloud.ai.demo.utils;


import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * <p>
 * Http请求工具类
 * </p>
 *
 * @author Major Tom
 * @date 2024/3/28 13:46
 **/
public class HttpUtils {

    public static String doGet(String url) {
        String result = "success!";
        CloseableHttpClient client = HttpClients.createDefault();
        try {
            HttpGet httpGet = new HttpGet(url);
            HttpResponse response = client.execute(httpGet);
            HttpEntity entity = response.getEntity();
            if (null != entity) {
                InputStream content = entity.getContent();
                result = IOUtils.toString(content, "UTF-8");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (null != client) {
                HttpClientUtils.closeQuietly(client);
            }
        }
        return result;
    }

    public static String doPost(String url, String paramJson) {
        String result;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        CloseableHttpResponse response = null;
        RequestConfig.Builder configBuilder = RequestConfig.custom();
        RequestConfig requestConfig = configBuilder.build();

        try {
            httpPost.setConfig(requestConfig);
            StringEntity stringEntity = new StringEntity(paramJson, "UTF-8");
            stringEntity.setContentEncoding("UTF-8");
            stringEntity.setContentType("application/json");
            httpPost.setEntity(stringEntity);
            response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString(entity, "UTF-8");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (response != null) {
                try {
                    EntityUtils.consume(response.getEntity());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return result;
    }

}
