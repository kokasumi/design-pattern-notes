package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/16 10:09
 * @description
 * @since v1.0
 */
public class Rule {
    private String api;
    private Long maxTps;
    private Long maxErrorCount;
    private Long maxTimeoutTps;

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public Long getMaxTps() {
        return maxTps;
    }

    public void setMaxTps(Long maxTps) {
        this.maxTps = maxTps;
    }

    public Long getMaxErrorCount() {
        return maxErrorCount;
    }

    public void setMaxErrorCount(Long maxErrorCount) {
        this.maxErrorCount = maxErrorCount;
    }

    public Long getMaxTimeoutTps() {
        return maxTimeoutTps;
    }

    public void setMaxTimeoutTps(Long maxTimeoutTps) {
        this.maxTimeoutTps = maxTimeoutTps;
    }
}
