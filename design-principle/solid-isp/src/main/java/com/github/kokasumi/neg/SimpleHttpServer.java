package com.github.kokasumi.neg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/30 16:40
 * @description
 * @since v1.0
 */
public class SimpleHttpServer {
    private String host;
    private int port;
    private Map<String, List<Config>> viewers = new HashMap<>();

    public SimpleHttpServer(String host,int port) {
        this.host = host;
        this.port = port;
    }

    public void addViewer(String urlDirectory, Config config) {
        if (!viewers.containsKey(urlDirectory)) {
            viewers.put(urlDirectory, new ArrayList<>());
        }
        viewers.get(urlDirectory).add(config);
    }

    public void run() {}
}
