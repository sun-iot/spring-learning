package com.spring.bean;

/**
 * @author Mr.Sun
 * @version v.1.0
 * @title Blende
 * @description
 * @date 2020/1/17 14:44
 */
public class Blende {

    /**
     * 我们要喝的水果汁
     * @param water 果汁加的水
     * @param fruit 水果类型
     * @param sugar 糖
     * @return
     */
    public static String juiceMix(String water , String fruit ,String sugar){
        String juice = String.format("我要喝 %s 的 , %s 的 %s" , water ,sugar ,fruit ) ;
        return juice ;
    }
}
