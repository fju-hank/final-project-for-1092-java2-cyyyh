package com.fju;

import java.util.ArrayList;

public class Customer extends Thread{
    int time = 90;  //用餐時間90分鐘
    int people;

    ArrayList<Food> menu;
    public Customer(int p){
        this.people = p;
        this.menu = new ArrayList<Food>();
        this.runTime();
    }
    //public void addFood(Food f){
        //this.menu.add(f);
    public void addFood(String id){
        if (id.equals("a")){
            this.menu.add(new Cake());
        } else if (id.equals("b")){
            this.menu.add(new Bread());
        } else if (id.equals("c")){
            this.menu.add(new Cookies());
        } else if (id.equals("d")){
            java.util.Scanner sin = new java.util.Scanner(System.in);
            System.out.println("請問要冰咖啡或熱咖啡？  輸入 I or H");
            String isIh = sin.next();
            if(!isIh.equals("H") || !isIh.equals("h")) {  //沒有選擇熱咖啡，就算沒選，也給冰咖啡
                this.menu.add(new Drink(true));
            }else{
                this.menu.add(new Drink(false));
            }
        }
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

    public void runTime(){
        if(this.time>0){
            this.start();
        }
    }

    public void hasTime(){
        if(this.time <= 0 ){
        }
    }

    @Override
    public void run() {
        while (this.time > 0) {
            this.time = this.time - 1;
             System.out.println("還剩" + this.time + "分鐘");
        }
    }
}
