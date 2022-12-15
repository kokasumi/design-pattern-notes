package com.github.kokasumi.pos;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/16 11:18
 * @description
 * @since v1.0
 */
public class Demo {
    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        // ...省略设置apiStatInfo数据值的代码
        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}
