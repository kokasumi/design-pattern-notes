package com.github.kokasumi.neg;


import com.github.kokasumi.AlertRule;
import com.github.kokasumi.Notification;
import com.github.kokasumi.NotificationEmergencyLevel;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/16 10:40
 * @description
 * @since v1.0
 */
public class Alert {
    private AlertRule rule;
    private Notification notification;

    public Alert(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    /**
     * 检测告警规则
     */
    public void check(String api, long requestCount, long errorCount, long durationOfSeconds) {
        // 检测接口tps是否超过阈值
        long tps = requestCount / durationOfSeconds;
        if (tps > rule.getMatchedRule(api).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
        // 检测接口出错数是否超过阈值
        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
