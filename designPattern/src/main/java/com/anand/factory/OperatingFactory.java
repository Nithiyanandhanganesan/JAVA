package com.anand.factory;

public class OperatingFactory {
   public OS getInstance(String str){
       if(str.equals("Open"))
           return new Android();
       else
           return new IOS();
   }
}
