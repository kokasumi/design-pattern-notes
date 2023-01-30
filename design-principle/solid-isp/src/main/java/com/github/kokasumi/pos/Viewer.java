package com.github.kokasumi.pos;

import java.util.Map;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/30 16:47
 * @description
 * @since v1.0
 */
public interface Viewer {
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
