package com.fju;

import java.util.ArrayList;

public class Customer {
    int time = 90;  //用餐時間90分鐘
    int people;

    ArrayList<Food> menu;
    public Customer(int p){
        this.people = p;
        this.menu = new ArrayList<Food>();
    }
    public void addFood(Food f){
        this.menu.add(f);
    //    System.out.println(f.toString());
    }
    public int getTotal(){
        int temp = 0;
        for (int i = 0; i < this.menu.size(); i++) {
            temp = temp + this.menu.get(i).getPrice();
        }
        return temp;
    }
    public String getMenu(){
        String s = "";
        for (int i = 0; i < this.menu.size(); i++) {
            s = s + this.menu.get(i).toString() + "\n";

        }
        return s;
    }

}
