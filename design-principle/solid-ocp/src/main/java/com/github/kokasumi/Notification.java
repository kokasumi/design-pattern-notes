package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/16 10:18
 * @description
 * @since v1.0
 */
public class Notification {
    public void notify(NotificationEmergencyLevel level,String msg) {
        switch (level) {
            case SEVERE:
                System.out.println("严重程度，使用手机通知：" + msg);
                break;
            case URGENCY:
                System.out.println("紧急程度，使用微信通知：" + msg);
                break;
            case NORMAL:
                System.out.println("普通程度，使用短信通知：" + msg);
                break;
            default:
                System.out.println("不紧急程度，使用邮件通知：" + msg);
                break;
        }
    }
}
