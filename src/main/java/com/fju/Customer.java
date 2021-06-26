package com.fju;

import java.util.ArrayList;

public class Customer extends Thread{
    int time = 90;  //用餐時間90分鐘
    int people;
    int num;  //組別編號
    ArrayList<Food> menu;

    public Customer(int p, int n){
        this.num = n;
        this.people = p;
        this.menu = new ArrayList<Food>();
    }
    public void addFood(String id){
        if (id.equals("a")  || id.equals("A")){
            this.menu.add(new Cake());
        } else if (id.equals("b") || id.equals("B")){
            this.menu.add(new Bread());
        } else if (id.equals("c") || id.equals("C")){
            this.menu.add(new Cookies());
        } else if (id.equals("d") || id.equals("D")){
            java.util.Scanner sin = new java.util.Scanner(System.in);
            System.out.println("請問要冰咖啡或熱咖啡？  輸入 I or H");
            String isIh = sin.next();
            if(!isIh.equals("H") || !isIh.equals("h")) {  //沒有選擇熱咖啡，就算沒選，也給冰咖啡
                this.menu.add(new Drink(true));
            }else{
                this.menu.add(new Drink(false));
            }
        } else{
            System.out.println("無此餐點");
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

    @Override
    public void run() {
        while (this.time > 0) {
            this.time = this.time - 1;
            if (this.time == 30) {  //還剩下30分鐘，會跳出提醒
                System.out.println("第" + this.num + "組還剩" + this.time + "分鐘");
            }
        }
        if(this.time<=0){
            System.out.println("第" +this.num+ "組時間到");  //用餐時間到了
            System.out.println("========================" + "\n");
        }
    }
}
