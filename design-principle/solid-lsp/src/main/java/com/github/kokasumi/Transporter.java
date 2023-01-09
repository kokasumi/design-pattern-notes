package com.github.kokasumi;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;

import java.io.IOException;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/12/25 16:00
 * @description
 * @since v1.0
 */
public class Transporter {
    private HttpClient httpClient;

    public Transporter(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public HttpResponse sendRequest(HttpUriRequest request) {
        // 使用HttpClient发送请求
        try {
            return httpClient.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
