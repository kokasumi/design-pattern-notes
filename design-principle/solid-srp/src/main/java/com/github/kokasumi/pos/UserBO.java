package com.github.kokasumi.pos;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/3 23:05
 * @description 用户实体
 * @since v1.0
 */
public class UserBO {
    /**
     * 用户Id
     */
    private String userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户密码
     */
    private String password;
    /**
     * Email
     */
    private String email;
    /**
     * 电话号码
     */
    private String telephone;
    /**
     * 用户住址所在省
     */
    private String province;
    /**
     * 用户住址所在市
     */
    private String city;
    /**
     * 用户住址所在区
     */
    private String region;
    /**
     * 用户住址详细地址
     */
    private String detailAddress;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setRegion(String region) {
        this.region =
                region;
    }

    public String getRegion() {
        return region;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getDetailAddress() {
        return detailAddress;
    }
}
