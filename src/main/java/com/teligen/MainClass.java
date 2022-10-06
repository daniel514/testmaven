package com.teligen;

public class MainClass {

    private String name;
    private int b;


    public void setName(String name, int b){
        this.name = name;
        this.b = b;
    }

    public void printString(){
        System.out.print("名字:" + this.name + ", 年龄:" + this.b);
    }


    public static void main(String[] args){
        MainClass mc = new MainClass();
        mc.setName("ddddd", 1);
    }

}
