package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/20 22:33
 * @description
 * @since v1.0
 */
public class DellKeyboard implements Keyboard{
    @Override
    public void print() {
        System.out.println("戴尔键盘打印文字...");
    }

    @Override
    public void input(Context context) {
        System.out.println("戴尔键盘输入...");
    }
}
