package com.github.kokasumi.pos;

import java.util.Map;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/30 16:47
 * @description
 * @since v1.0
 */
public class RedisConfig implements Updater,Viewer{
    /**其他信息可见{@link com.github.kokasumi.origin.RedisConfig}*/

    /**
     * ① 配置信息热更新
     */
    @Override
    public void update() {

    }

    /**
     * ② 提供字符串配置信息，供Http查看使用
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
