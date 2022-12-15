package com.github.kokasumi.pos;

import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/16 11:16
 * @description
 * @since v1.0
 */
public class Alert {
    private List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addAlertHandler(AlertHandler alertHandler) {
        this.alertHandlers.add(alertHandler);
    }

    /**
     * 1. 使用ApiStatInfo封装check参数
     * 2. 使用handler处理各告警逻辑
     */
    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler handler : alertHandlers) {
            handler.check(apiStatInfo);
        }
    }
}
