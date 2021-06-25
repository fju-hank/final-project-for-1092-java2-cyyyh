package com.fju;

public class Coupon extends Thread{
    @Override
    public void run() {
        int coupon = 0;
        for (int i = 0; i < 3; i++) {
            coupon++;
            System.out.println(getName() + ":" + coupon);
        }
    }
}
