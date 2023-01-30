package com.github.kokasumi.pos;

import com.github.kokasumi.neg.Book;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/31 1:32
 * @description
 * @since v1.0
 */
public class Mother {
    /**
     * 讲故事
     * @param reader
     */
    public void narrate(IReader reader) {
        System.out.println("妈妈开始讲故事");
        System.out.println(reader.getContent());
    }
}
