package com.cskaoyan.entity;

import java.util.ArrayList;

public class User {

    private String name;

    private String password;

    private Address address;

    private ArrayList<String> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress1() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }
}
