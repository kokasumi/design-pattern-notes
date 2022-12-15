package com.github.kokasumi.future;

/**
 * @version v1.0
 * @author: lg
 * @date: 2022/11/3 23:40
 * @description 物流信息
 * @since v1.0
 */
public class LogisticsInfo {
    /**订单编码*/
    private String orderCode;
    /**发件人地址*/
    private UserAddress senderAddress;
    /**收件人地址*/
    private UserAddress recipientAddress;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public UserAddress getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(UserAddress senderAddress) {
        this.senderAddress = senderAddress;
    }

    public UserAddress getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(UserAddress recipientAddress) {
        this.recipientAddress = recipientAddress;
    }
}
