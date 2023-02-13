package com.github.kokasumi.pos;

/**
 * @version v1.0
 * @author: lg
 * @date: 2023/2/13 17:04
 * @description
 * @since v1.0
 */
public class Car {
    private Color color;
    private PowerSource powerSource;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPowerSource(PowerSource powerSource) {
        this.powerSource = powerSource;
    }

    public void move() {
        System.out.println("动力源:" + powerSource.getSource()+ "颜色：" + color.getColor() + "汽车移动");
    }
}
