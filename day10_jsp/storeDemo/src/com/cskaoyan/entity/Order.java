package com.cskaoyan.entity;

public class Order {
    //订单的编号
    private String ordernum;
    //订单的金额
    private double price;
    //订单的状态，state ，0表示未付款，1表示待发货，2表示待签收，3表示待评价
    private int state;

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
