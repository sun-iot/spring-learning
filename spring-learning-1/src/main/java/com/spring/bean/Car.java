package com.spring.bean;

/**
 * @author Mr.Sun
 * @version v.1.0
 * @title Car
 * @description
 * @date 2020/1/17 17:55
 */
public class Car {

    private String company ;
    private String brand ;

    private int maxSpeed ;
    private float price ;

    public Car(String company, String brand, int maxSpeed) {
        this.company = company;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public Car(String company, String brand, float price) {
        this.company = company;
        this.brand = brand;
        this.price = price;
    }

    public Car(String company, String brand, int maxSpeed, float price) {
        this.company = company;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
