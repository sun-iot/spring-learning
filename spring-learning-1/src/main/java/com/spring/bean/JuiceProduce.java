package com.spring.bean;

/**
 * @author Mr.Sun
 * @version v.1.0
 * @title JuiceProduce
 * @description 水果汁的制造
 * @date 2020/1/17 14:47
 */
public class JuiceProduce {

    private String water ;
    private String fruit ;
    private String sugar ;

    public void setWater(String water) {
        this.water = water;
        System.out.println(this.water);
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public JuiceProduce() {
        System.out.println("Constructor for JuiceProduce");
    }

    public String juiceProduce(){
        return Blende.juiceMix(this.water , this.fruit , this.sugar) ;
    }
}
