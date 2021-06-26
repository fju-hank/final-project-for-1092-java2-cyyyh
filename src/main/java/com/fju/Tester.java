package com.fju;

import java.util.Scanner;
import javax.swing.*;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        //印出菜單
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
            System.out.println("您好，請問幾位？ 請輸入數字（1, 2, 3, 4...");
            int p = scan.nextInt();
            Customer c1 = new Customer(p, ++number);
            while (true){
                System.out.println("請問要點什麼？ 請輸入餐點代碼（a, b, c, d...)");
                String menu = scan.next();
                c1.addFood(menu);
                System.out.println("請問還要繼續點餐嗎？ 請輸入y或n");
                String isOrder = scan.next();
                if(!isOrder.equals("y")){  //如果不繼續點餐
                    break;
                }
            }
            //點完餐後，直接列出點餐資訊
            System.out.println("Ordered:\n"+ c1.getMenu());
            System.out.println("Total: \t" + c1.getTotal());
            c1.start();

            //用餐時間到了時，會跳出用餐明細的視窗介面，提醒客人前往櫃檯結帳
            JTextArea l1 = new JTextArea("\n用餐時間到了，請儘速前往櫃檯結帳，謝謝～ \n\n"+
                    c1.getMenu() +
                    "\n=========================\nTotal:\t\t" +
                    c1.getTotal() + "\n\n謝謝惠顧！！！"
            );

            JFrame jf = new JFrame("用餐明細");
            jf.setBounds(500, 50, 275, 600);
            //關掉前一組客人的用餐明細的視窗後，下一組客人還可以繼續點餐
            jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            jf.add(l1);
            jf.setVisible(true);

            //下一組客人點餐
            System.out.println("下一組客人嗎？  請輸入y");
            String y = scan.next();
            if(!y.equals("y")){
                bln = false;
            }else {
                bln = true;
                //下一組客人點餐時，再次印出菜單
                System.out.println("Welcome!");
                System.out.println("========= Menu =========");
                System.out.println(new Cake().toString());
                System.out.println(new Bread().toString());
                System.out.println(new Cookies().toString());
                System.out.println(new Drink(true).toString());
                System.out.println(new Drink(false).toString());
                System.out.println("========================");
            }
        }while (bln);

    }
}
