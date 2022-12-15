package com.github.kokasumi.pos;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/16 14:46
 * @description
 * @since v1.0
 */
public class Main {
    public static void main(String[] args) {
        // 作为用户属性业务对象维护
        UserBO userBO = new UserBO();
        userBO.setPassword("123232");
        // 执行业务逻辑
        IUserBiz userBiz = new UserBiz();
        userBiz.deleteUser(userBO);
    }
}
