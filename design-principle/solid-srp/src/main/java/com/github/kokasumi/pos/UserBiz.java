package com.github.kokasumi.pos;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/3 23:06
 * @description
 * @since v1.0
 */
public class UserBiz implements IUserBiz {
    @Override
    public boolean changePassword(UserBO userBO, String oldPassword, String newPassword) {
        if(!oldPassword.equals(userBO.getPassword())) {
            System.out.println("旧密码不正确");
            return false;
        }
        userBO.setPassword(newPassword);
        return true;
    }

    @Override
    public boolean deleteUser(UserBO userBO) {
        System.out.println("成功删除用户");
        return true;
    }
}
