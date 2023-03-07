package com.github.kokasumi;

import com.github.kokasumi.*;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/20 22:35
 * @description 键盘工厂类
 * @since v1.0
 */
public class KeyboardFactory {
    /**
     * 根据类型选择创建键盘
     * @param brand
     * @return
     */
    public static Keyboard getInstance(int brand) {
        if(BrandEnum.HP.getCode() == brand) {
            return new HPKeyboard();
        }else if(BrandEnum.DELL.getCode() == brand) {
            return new DellKeyboard();
        }else if(BrandEnum.LENOVO.getCode() == brand) {
            return new LenovoKeyboard();
        }
        return null;
    }
}
