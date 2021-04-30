package com.anand.FactoryDesign;

public class OperatingSystemFactory {
    public OS getInstance(String str){
        if (str.equals("open"))
            return new Android();
        else
            return new IOS();
    }
}
