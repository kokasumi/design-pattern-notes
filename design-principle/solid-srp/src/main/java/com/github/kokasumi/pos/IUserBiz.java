package com.github.kokasumi.pos;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/10/16 14:38
 * @description 用户行为，完成用户信息的维护和变更
 * @since v1.0
 */
public interface IUserBiz {
    /**
     * 修改用户密码
     * @param userBO
     * @param oldPassword
     * @param newPassword
     * @return
     */
    boolean changePassword(UserBO userBO, String oldPassword, String newPassword);

    /**
     * 删除用户
     * @param userBO
     * @return
     */
    boolean deleteUser(UserBO userBO);
}
