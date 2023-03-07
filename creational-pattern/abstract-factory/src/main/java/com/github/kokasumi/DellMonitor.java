package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/24 11:19
 * @description
 * @since v1.0
 */
public class DellMonitor implements Monitor{
    @Override
    public void play() {
        System.out.println("戴尔显示器正在播放画面...");
    }
}
