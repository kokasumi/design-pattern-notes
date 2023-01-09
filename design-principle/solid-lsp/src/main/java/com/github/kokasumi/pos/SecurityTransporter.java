package com.github.kokasumi.pos;

import com.github.kokasumi.Transporter;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/3 18:12
 * @description 符合里氏替换原则设计
 * @since v1.0
 */
public class SecurityTransporter extends Transporter {
    private String appId;
    private String appToken;

    public SecurityTransporter(HttpClient httpClient, String appId,String appToken) {
        super(httpClient);
        this.appId = appId;
        this.appToken = appToken;
    }

    @Override
    public HttpResponse sendRequest(HttpUriRequest request) {
        if(StringUtils.isNoneEmpty(appId,appToken)) {
            request.addHeader("app-id", appId);
            request.addHeader("app-token", appToken);
        }
        return super.sendRequest(request);
    }
}
