package com.github.kokasumi.pos;


import com.github.kokasumi.AlertRule;
import com.github.kokasumi.Notification;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/16 11:16
 * @description
 * @since v1.0
 */
public class ApplicationContext {
    private static final ApplicationContext instance = new ApplicationContext();
    private AlertRule alertRule;
    private Notification notification;
    private Alert alert;

    public void initializeBeans() {
        //省略一些初始化代码
        alertRule = new AlertRule();
        //省略一些初始化代码
        notification = new Notification();
        alert = new Alert();
        // 添加tps超过阈值handler
        alert.addAlertHandler(new TpsAlertHandler(alertRule, notification));
        // 添加接口出错数超过阈值handler
        alert.addAlertHandler(new ErrorAlertHandler(alertRule, notification));
        // 添加接口超时tps超过阈值handler
        alert.addAlertHandler(new TimeoutAlertHandler(alertRule, notification));
    }

    public Alert getAlert() {
        return alert;
    }

    private ApplicationContext() {
        initializeBeans();
    }

    public static ApplicationContext getInstance() {
        return instance;
    }
}
