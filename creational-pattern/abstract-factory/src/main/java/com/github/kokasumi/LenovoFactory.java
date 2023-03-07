package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/24 11:30
 * @description
 * @since v1.0
 */
public class LenovoFactory implements IFactory{
    @Override
    public MainFrame createMainFrame() {
        return new LenovoMainFrame();
    }

    @Override
    public Monitor createMonitor() {
        return new LenovoMonitor();
    }

    @Override
    public Keyboard createKeyboard() {
        return new LenovoKeyboard();
    }
}
