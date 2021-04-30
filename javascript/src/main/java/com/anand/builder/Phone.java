package com.anand.builder;

public class Phone {
    private String os;
    private String ram;
    private String processor;
    public Phone(String os,String ram,String processor){
        super();
        this.os=os;
        this.ram=ram;
        this.processor=processor;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
