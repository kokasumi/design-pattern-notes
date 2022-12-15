package com.github.kokasumi.pos;


import com.github.kokasumi.AlertRule;
import com.github.kokasumi.Notification;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/16 11:04
 * @description handler处理告警逻辑
 * @since v1.0
 */
public abstract class AlertHandler {
    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    /**
     * 告紧逻辑处理
     * @param apiStatInfo
     */
    public abstract void check(ApiStatInfo apiStatInfo);
}
