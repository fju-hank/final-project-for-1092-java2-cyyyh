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
            /*
             * sleep   是為了等時間到再印出點餐明細
             */
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

    }
}
