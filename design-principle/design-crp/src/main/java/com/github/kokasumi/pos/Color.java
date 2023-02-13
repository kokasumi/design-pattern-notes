package com.github.kokasumi.pos;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/13 17:04
 * @description 颜色枚举类
 * @since v1.0
 */
public enum Color {
    White("白色"),Black("黑色"),Red("红色");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
