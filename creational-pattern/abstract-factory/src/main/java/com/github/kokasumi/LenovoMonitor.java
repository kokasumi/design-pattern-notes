package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/24 11:21
 * @description
 * @since v1.0
 */
public class LenovoMonitor implements Monitor{
    @Override
    public void play() {
        System.out.println("联想显示器正在播放画面...");
    }
}
