package com_Scanner_Demo;

public class Demo_Constructor {
    static  String  m="capgeminy";
    String s;
    int i;
    long l;
    int b;



    String f;
    public  Demo_Constructor(String s,int i,long l,String f,int b){
        System.out.println("hello");
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(b);
        System.out.println(b);
        System.out.println("welcome");

    }

    public static void main(String[] args) {
        Demo_Constructor d= new Demo_Constructor("how are you",24,78654336l,"hyyyy",67);

    }
}
