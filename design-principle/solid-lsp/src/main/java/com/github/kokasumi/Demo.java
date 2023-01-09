package com.github.kokasumi;

import com.github.kokasumi.pos.SecurityTransporter;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/3 18:18
 * @description
 * @since v1.0
 */
public class Demo {
    public static void main(String[] args) {
        Transporter transporter = new SecurityTransporter(HttpClients.createDefault(),"111","111");
        HttpUriRequest request = RequestBuilder.get().build();
        HttpResponse response = transporter.sendRequest(request);
    }
}
