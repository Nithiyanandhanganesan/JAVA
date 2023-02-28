package com.anand.com.anand.adapter;

public class AssignmentWorks {
    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void writeAssignment(String str){
      p.write(str);
    }
}
