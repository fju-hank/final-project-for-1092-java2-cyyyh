package com.fju;

public  class Food {
    String id;
    String name;
    int price;

    public Food(String id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void print(){
        System.out.println(id + "\t" + name + "\t" + price);
    }
    public int getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + price;
    }
}
