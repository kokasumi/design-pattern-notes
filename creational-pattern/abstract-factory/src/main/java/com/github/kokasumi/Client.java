package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/24 11:30
 * @description
 * @since v1.0
 */
public class Client {
    public static void main(String[] args) {
        IFactory dellFactory = new DellFactory();
        dellFactory.createMainFrame().run();
        dellFactory.createMonitor().play();
        dellFactory.createKeyboard().print();
    }
}
