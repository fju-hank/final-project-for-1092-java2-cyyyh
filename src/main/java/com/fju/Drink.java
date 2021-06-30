package com.fju;

public class Drink extends Food{
    boolean ice;
    public Drink(boolean ice){
        super("d","coffee", 40);
        this.ice = ice;
    }
    public void print(){
        System.out.println(id + "\t" + name + "\t" + price + "\t" + (ice ? "(ice)": "(hot)"));
    }

    @Override
    public String toString() {
        String str=super.toString();
        return str + (ice ? "(ice)": "(hot)");
    }
}
