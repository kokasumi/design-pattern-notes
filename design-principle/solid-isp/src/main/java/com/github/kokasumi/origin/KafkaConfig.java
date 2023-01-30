package com.github.kokasumi.origin;

import org.eclipse.microprofile.config.spi.ConfigSource;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/16 16:40
 * @description
 * @since v1.0
 */
public class KafkaConfig {
    /** 配置中心（比如zookeeper）*/
    private ConfigSource configSource;
    private String address;
    private int timeout;
    private int maxTotal;
    // 其他配置...

    public KafkaConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    public String getAddress() {
        return address;
    }

    public int getTimeout() {
        return timeout;
    }

    public int getMaxTotal() {
        return maxTotal;
    }

    public void init() {
        // 从configSource加载配置到address/timeout/maxTotal
    }
}
