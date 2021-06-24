package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Food food1 = new Food("a", "cake", 75);
        Food food2 = new Food("b", "bread", 55);
        Food food3 = new Food("c", "cookies", 45);
        Drink drink1 = new Drink("d", "coffee", 40, "ice");
        Drink drink2 = new Drink("e", "coffee", 40, "hot");

        food1.print();
        food2.print();
        food3.print();
        drink1.print();
        drink2.print();

        Scanner scanner = new Scanner(System.in);
        int price = 0;
        int total;
        int a = 75;
        int b = 55;
        int c = 45;
        int d = 40;
        int e = 40;

        System.out.println("Welcome!");
        while(true){
            System.out.println("Price: " + price + ", Please order, if finished, please enter 'f' ");
            String s = scanner.next();
            if (s.equals("a")){
                price = price + a;
            }else if(s.equals("b")){
                price = price + b;
            }else if(s.equals("c")){
                price = price + c;
            }else if(s.equals("d")){
                price = price + d;
            }else if(s.equals("e")){
                price = price + c;
            }else if(s.equals("f")){
                total = price;
                System.out.println("_____________________________________________________");
                System.out.println("Total: " + total + ", thank you!!!");
                if (total > 200){
                    System.out.println("You can join a lucky draw!!!!!");
                } else {
                    break;
                }
                break;
            }
        }

    }
}
