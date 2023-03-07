package com.github.kokasumi;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/20 22:36
 * @description
 * @since v1.0
 */
public enum BrandEnum {
    HP(1),DELL(2),LENOVO(3);
    private int code;

    private BrandEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
