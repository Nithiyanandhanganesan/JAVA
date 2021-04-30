package com.anand.FactoryDesign;

public class FactoryMain {
    public static void main(String args[]){
        System.out.println("test");
        OperatingSystemFactory obj = new OperatingSystemFactory();
        OS obj1 = obj.getInstance("open");
        obj1.spec();
    }
}
