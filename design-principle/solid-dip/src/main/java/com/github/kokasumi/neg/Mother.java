package com.github.kokasumi.neg;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/1/31 1:27
 * @description
 * @since v1.0
 */
public class Mother {
    /**
     * 讲故事
     * @param book
     */
    public void narrate(Book book) {
        System.out.println("妈妈开始讲故事");
        System.out.println(book.getContent());
    }
}
