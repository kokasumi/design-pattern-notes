package com.github.kokasumi.neg;


import com.github.kokasumi.AlertRule;
import com.github.kokasumi.Notification;
import com.github.kokasumi.NotificationEmergencyLevel;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/16 10:49
 * @description
 * @since v1.0
 */
public class ExpandAlert {
    private AlertRule rule;
    private Notification notification;

    public ExpandAlert(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    /**
     * 改动一：添加参数timeoutCount
     * @param api
     * @param requestCount
     * @param errorCount
     * @param timeoutCount
     * @param durationOfSeconds
     */
    public void check(String api, long requestCount, long errorCount, long timeoutCount, long durationOfSeconds) {
        // 检测接口tps是否超过阈值
        long tps = requestCount / durationOfSeconds;
        if (tps > rule.getMatchedRule(api).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
        // 检测接口出错数是否超过阈值
        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
        // 改动二：添加接口超时处理逻辑
        long timeoutTps = timeoutCount / durationOfSeconds;
        if (timeoutTps > rule.getMatchedRule(api).getMaxTimeoutTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}
