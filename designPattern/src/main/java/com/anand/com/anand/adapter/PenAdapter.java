package com.anand.com.anand.adapter;

public class PenAdapter implements Pen{

    PilotPen pp = new PilotPen();

    public void write(String str){
        pp.mark(str);
    }
}
