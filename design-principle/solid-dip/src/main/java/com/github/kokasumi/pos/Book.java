package com.github.kokasumi.pos;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/31 1:31
 * @description
 * @since v1.0
 */
public class Book implements IReader{
    @Override
    public String getContent() {
        return "在三个兄弟鼠的院子里，有一口大缸，里面盛满了水...";
    }
}
