package com.anand.builder;

public class Shop {
    public static void main(String args[]){
        Phone obj = new PhoneBuilder().setOs("test").setRam("two").getPhone();
        System.out.println(obj) ;

    }
}
