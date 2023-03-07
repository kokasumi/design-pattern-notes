package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/21 23:54
 * @description
 * @since v1.0
 */
public class DellKeyboardFactory implements KeyboardFactory{
    @Override
    public Keyboard getInstance() {
        return new DellKeyboard();
    }
}
