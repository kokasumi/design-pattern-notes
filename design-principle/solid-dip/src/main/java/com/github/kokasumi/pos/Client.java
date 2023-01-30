package com.github.kokasumi.pos;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/31 1:33
 * @description
 * @since v1.0
 */
public class Client {
    public static void main(String[] args) {
        Mother mother = new Mother();
        mother.narrate(new Book());
        mother.narrate(new NewsPaper());
    }
}
