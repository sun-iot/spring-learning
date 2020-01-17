package com.spring;

import com.spring.bean.HelloWorld;
import com.spring.bean.JuiceProduce;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.Sun
 * @version v.1.0
 * @title Main
 * @description
 * @date 2020/1/17 10:52
 */
public class Main {
    public static void main(String[] args) {
        // 传统做法( 这不是Spring 的做法)
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setName("Spring");
//        helloWorld.sayHello();

        // Spring 方式

        //1 创建 Spring 的 IOC 容器对象
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2 从IOC 容器中获取 Bean 实例
//        HelloWorld hello = (HelloWorld)applicationContext.getBean("helloWorld");
////        //3 调用 sayHello()
//        hello.sayHello();

        JuiceProduce juiceProduce = (JuiceProduce) applicationContext.getBean("juiceProduce");
        String produce = juiceProduce.juiceProduce();
        System.out.println(produce);
    }
}
