package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/20 22:19
 * @description 键盘接口
 * @since v1.0
 */
public interface Keyboard {
    /**
     * 键盘打印
     */
    void print();

    /**
     * 键盘输入
     * @param context
     */
    void input(Context context);
}
