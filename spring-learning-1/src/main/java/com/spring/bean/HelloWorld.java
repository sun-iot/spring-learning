package com.spring.bean;

/**
 * @author Mr.Sun
 * @version v.1.0
 * @title HelloWorld
 * @description Spring 版本的 HelloWorld
 * @date 2020/1/17 10:50
 */
public class HelloWorld {
    private String name ;

    public void setName(String name) {
        this.name = name;
        System.out.println("this.name: " + this.name);
    }

    public void sayHello(){
        System.out.println("Hello " + name);
    }

    public HelloWorld() {
        System.out.println("Constructor for HelloWorld");
    }
}
