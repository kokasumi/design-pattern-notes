package com.github.kokasumi.neg;

import org.eclipse.microprofile.config.spi.ConfigSource;

import java.util.Map;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/16 16:57
 * @description
 * @since v1.0
 */
public class KafkaConfig implements Config{
    /**其他信息可见{@link com.github.kokasumi.origin.KafkaConfig}*/

    /**
     * ① 配置信息热更新
     */
    @Override
    public void update() {
    }

    /**
     * 多余方法，Kafka配置信息无需在Http页面查看
     * @return
     */
    @Override
    public String outputInPlainText() {
        return null;
    }

    /**
     * 多余方法，Kafka配置信息无需在Http页面查看
     * @return
     */
    @Override
    public Map<String, String> output() {
        return null;
    }
}
