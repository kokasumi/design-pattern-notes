package com.github.kokasumi.neg;

import java.util.Map;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/30 16:01
 * @description
 * @since v1.0
 */
public class MySqlConfig implements Config{
    /**其他信息可见{@link com.github.kokasumi.origin.MySQLConfig}*/

    /**
     * 多余方法，Mysql配置信息无需热更新
     */
    @Override
    public void update() {

    }

    /**
     * 提供字符串配置信息
     * @return
     */
    @Override
    public String outputInPlainText() {
        return null;
    }

    /**
     * 提供map配置信息，供Http查看使用
     * @return
     */
    @Override
    public Map<String, String> output() {
        return null;
    }
}
