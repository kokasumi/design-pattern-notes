package com.github.kokasumi.neg;

import java.util.Map;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/16 16:50
 * @description
 * @since v1.0
 */
public interface Config {
    /**
     * 更新配置信息
     */
    void update();

    /**
     * 以字符串形式返回配置信息
     * @return
     */
    String outputInPlainText();

    /**
     * 以map形式返回配置信息
     * @return
     */
    Map<String,String> output();
}
