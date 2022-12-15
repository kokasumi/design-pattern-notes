package com.github.kokasumi.future;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/3 23:39
 * @description
 * @since v1.0
 */
public class UserAddress {
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }
}
