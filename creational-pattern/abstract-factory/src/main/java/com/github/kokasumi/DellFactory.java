package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/24 11:28
 * @description
 * @since v1.0
 */
public class DellFactory implements IFactory{
    @Override
    public MainFrame createMainFrame() {
        return new DellMainFrame();
    }

    @Override
    public Monitor createMonitor() {
        return new DellMonitor();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
