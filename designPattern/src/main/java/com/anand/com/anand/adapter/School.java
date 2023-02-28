package com.anand.com.anand.adapter;

public class School {
    public static void main(String args[]){
         PenAdapter p = new PenAdapter();
         AssignmentWorks aw = new AssignmentWorks();
         aw.setP(p);
         aw.writeAssignment("i m testing adapter");
    }
}

