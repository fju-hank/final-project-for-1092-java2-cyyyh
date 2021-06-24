package com.fju;

public class Drink extends Food{
    String ice;
    public Drink(String id, String name, int price, String ice){
        super(id, name, price);
        this.ice = ice;
    }
    public void print(){
        System.out.println(id + "\t" + name + "\t" + price + "\t" +  ice);
    }
}