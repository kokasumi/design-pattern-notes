package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/20 22:31
 * @description 惠普键盘
 * @since v1.0
 */
public class HPKeyboard implements Keyboard{
    @Override
    public void print() {
        System.out.println("惠普键盘打印文字...");
    }

    @Override
    public void input(Context context) {
        System.out.println("惠普键盘输入...");
    }
}
