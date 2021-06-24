package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int price = 0;
        int total = 0;
        int a = 50;
        int b = 30;
        int c = 55;
        int d = 75;
        int e = 40;

        System.out.println("Welcome!");
        while(true){
            System.out.println("Price: " + price + ", Please order, if finished, please enter 'f' ");
            String s = scanner.next();
            if(s.equals("a")){
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
