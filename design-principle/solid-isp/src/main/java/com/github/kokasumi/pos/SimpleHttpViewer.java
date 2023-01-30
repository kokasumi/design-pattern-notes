package com.github.kokasumi.pos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/30 17:04
 * @description
 * @since v1.0
 */
public class SimpleHttpViewer {
    private String host;
    private int port;
    private Map<String, List<Viewer>> viewers = new HashMap<>();

    public SimpleHttpViewer(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void addViewers(String urlDirectory, Viewer viewer) {
        if(!viewers.containsKey(urlDirectory)) {
            viewers.put(urlDirectory,new ArrayList<>());
        }
        this.viewers.get(urlDirectory).add(viewer);
    }

    public void run() {}
}
