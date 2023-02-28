package com.anand.builder;

public class Shop {
    public static void main(String args[]){
        Phone p = new PhoneBuilder().setBattery(1).setOs("bat").getPhone();
        System.out.println(p);
    }
}
