package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/24 11:20
 * @description
 * @since v1.0
 */
public class HPMonitor implements Monitor{
    @Override
    public void play() {
        System.out.println("惠普显示器正在播放画面...");
    }
}
