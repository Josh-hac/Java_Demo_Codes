package com_Scanner_Demo;

public class Demo_Continue {
    public static void main(String[] args) {

        for (int a=0;a<=20;a++){
            if (a==5||a==10||a==15||a==20){
                continue;
            }
            else {
                System.out.println(a);
            }
        }
    }
}
