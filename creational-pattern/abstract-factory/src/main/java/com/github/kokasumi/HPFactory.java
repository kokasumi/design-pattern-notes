package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/24 11:29
 * @description
 * @since v1.0
 */
public class HPFactory implements IFactory{
    @Override
    public MainFrame createMainFrame() {
        return new HPMainFrame();
    }

    @Override
    public Monitor createMonitor() {
        return new HPMonitor();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HPKeyboard();
    }
}
