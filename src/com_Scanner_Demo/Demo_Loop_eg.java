package com_Scanner_Demo;

public class Demo_Loop_eg {
    public static void main(String[] args) {
        for (int a=5;a>=1;a--){
            for (int b=1;b<=5-a;b++){
                System.out.print(" ");
            }
            for (int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
