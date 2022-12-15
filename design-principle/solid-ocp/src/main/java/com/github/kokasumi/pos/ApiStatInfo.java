package com.github.kokasumi.pos;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/16 11:00
 * @description Api监控参数封装实体
 * @since v1.0
 */
public class ApiStatInfo {
    private String api;
    private long requestCount;
    private long errorCount;
    private long durationOfSeconds;
    private long timeoutCount;

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public long getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(long requestCount) {
        this.requestCount = requestCount;
    }

    public long getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(long errorCount) {
        this.errorCount = errorCount;
    }

    public long getDurationOfSeconds() {
        return durationOfSeconds;
    }

    public void setDurationOfSeconds(long durationOfSeconds) {
        this.durationOfSeconds = durationOfSeconds;
    }

    public long getTimeoutCount() {
        return timeoutCount;
    }

    public void setTimeoutCount(long timeoutCount) {
        this.timeoutCount = timeoutCount;
    }
}
