package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println("========= Menu =========");
        System.out.println(new Cake().toString());
        System.out.println(new Bread().toString());
        System.out.println(new Cookies().toString());
        System.out.println(new Drink(true).toString());
        System.out.println(new Drink(false).toString());
        System.out.println("========================");

        int number = 0;  //沒有人時為第0組客人

        Scanner scan = new Scanner(System.in);
        boolean bln = true; // 有無人
        do {
            System.out.println("您好，請問幾位？");
            int p = scan.nextInt();
            Customer c1 = new Customer(p, ++number);
            while (true){
                System.out.println("請問要點什麼？ 請輸入餐點代碼（a, b, c, d......)");
                String menu = scan.next();
                c1.addFood(menu);
                System.out.println("請問還要加點嗎？ 請輸入y或n");
                String isOrder = scan.next();
                if(!isOrder.equals("y")){
                    break;
                }
            }
            c1.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Ordered:\n"+ c1.getMenu());
            System.out.println("Total: " + c1.getTotal());
            System.out.println("謝謝惠顧！！！");
            System.out.println("還有下一組客人嗎？  請輸入y/n");
            String yn = scan.next();
            if(!yn.equals("y")){
                bln = false;
            }else {
                bln = true;
            }
        }while (bln);
        /*
        System.out.println("Welcome!" + "\n" + "Menu:");
        Food food1 = new Food("a", "cake", 75);
        Food food2 = new Food("b", "bread", 55);
        Food food3 = new Food("c", "cookies", 45);
        Drink drink1 = new Drink("d", "coffee", 40, true);
        Drink drink2 = new Drink("e", "coffee", 40, false);

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

        while(true){
            System.out.println("Please order, if finished, please enter 'f' , Price: " + price);
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
                price = price + e;
            }else if(s.equals("f")){
                total = price;
                System.out.println("________________________________________________________");
                System.out.println("Total: " + total + ", thank you!!!");
                if (total >= 200){
                    System.out.println("You can join a lucky draw!!!!!");
                    System.out.println("________________________________________________________");
                    Coupon c1 = new Coupon();
                    Coupon c2 = new Coupon();
                    c1.setName("Food Coupon");
                    c2.setName("Drink Coupon");
                    c1.start();
                    c2.start();
                } else {
                    break;
                }
                break;
            }
        }
*/
    }
}
