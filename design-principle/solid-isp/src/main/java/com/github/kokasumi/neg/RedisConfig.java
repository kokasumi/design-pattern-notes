package com.github.kokasumi.neg;

import java.util.Map;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/16 16:56
 * @description
 * @since v1.0
 */
public class RedisConfig implements Config{
    /**其他信息可见{@link com.github.kokasumi.origin.RedisConfig}*/

    /**
     * ① 配置信息热更新
     */
    @Override
    public void update() {
        // 从configSource加载新的配置到address/timeout/maxTotal
    }

    /**
     * ② 提供字符串配置信息，供Http查看使用
     * @return
     */
    @Override
    public String outputInPlainText() {
        // 以字符串形式返回配置信息展示
        return null;
    }

    /**
     * 提供map配置信息，供Http查看使用
     * @return
     */
    @Override
    public Map<String, String> output() {
        // 以map形式返回配置信息展示
        return null;
    }
}
