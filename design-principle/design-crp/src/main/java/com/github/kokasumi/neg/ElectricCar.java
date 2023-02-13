package com.github.kokasumi.neg;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/13 16:59
 * @description 电动汽车
 * @since v1.0
 */
public class ElectricCar extends Car{
    @Override
    public void move() {
        System.out.println("电动汽车移动...");
    }
}
