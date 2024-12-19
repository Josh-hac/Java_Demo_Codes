package com_Scanner_Demo;

import java.util.Scanner;

public class Demo_Scanner {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("what is your name:");
       String u = s.nextLine();
        System.out.println("My name is "+u);
        System.out.println("what is your age:");
       int n= s.nextInt();
        System.out.println("my age is:"+n);
        System.out.println("what is your height:");
       Float f =s.nextFloat();
        System.out.println("My height is"+f);
        System.out.println("your phone number");
       Long l = s.nextLong();
        System.out.println("ph no is"+l);
        System.out.println("what is your empno:");
        short e=s.nextShort();
        System.out.println("empno is "+e);

    }
}
