package com.example.droolshelloworlddemo.model;

/**
 * @Author: zhangQi
 * @Date: 2020-08-15 14:46
 * @D:bili视频教程demo
 */
public class Order {

    private Double originalPrice;
    private Double realPrice;

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Double realPrice) {
        this.realPrice = realPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "originalPrice=" + originalPrice +
                ", realPrice=" + realPrice +
                '}';
    }
}
