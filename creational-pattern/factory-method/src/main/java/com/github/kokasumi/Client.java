package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/21 23:55
 * @description
 * @since v1.0
 */
public class Client {
    public static void main(String[] args) {
        Keyboard keyboard = new HPKeyboardFactory().getInstance();
        keyboard.print();
    }
}
