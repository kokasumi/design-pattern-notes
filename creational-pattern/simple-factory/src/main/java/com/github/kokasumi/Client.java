package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/21 0:41
 * @description
 * @since v1.0
 */
public class Client {
    public static void main(String[] args) {
        Keyboard keyboard = KeyboardFactory.getInstance(BrandEnum.DELL.getCode());
        keyboard.print();
    }
}
