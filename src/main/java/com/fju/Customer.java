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

}
