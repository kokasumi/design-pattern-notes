package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/24 11:27
 * @description 工厂接口
 * @since v1.0
 */
public interface IFactory {
    /**
     * 创建主机实体
     * @return
     */
    MainFrame createMainFrame();

    /**
     * 创建显示器实体
     * @return
     */
    Monitor createMonitor();

    /**
     * 创建键盘实体
     * @return
     */
    Keyboard createKeyboard();
}
