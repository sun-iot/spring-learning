package com.spring.bean;

import java.util.List;

/**
 * @author Mr.Sun
 * @version v.1.0
 * @title User
 * @description
 * @date 2020/1/17 17:57
 */
public class User {

    private String name;
    private List<Car> cars;

    private String wifeName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifeName) {
        this.wifeName = wifeName;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", cars=" + cars +
                ", wifeName='" + wifeName + '\'' +
                '}';
    }

    public void init() {
        System.out.println("init ...... ");
    }

    public void destroy() {
        System.out.println("destroy ......");
    }
}
