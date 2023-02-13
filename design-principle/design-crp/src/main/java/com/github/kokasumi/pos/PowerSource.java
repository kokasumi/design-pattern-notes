package com.github.kokasumi.pos;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/13 17:27
 * @description
 * @since v1.0
 */
public enum PowerSource {
    Gasoline("汽笛"), Electric("电动");
    private String source;

    PowerSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }
}
