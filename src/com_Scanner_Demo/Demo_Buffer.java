package com_Scanner_Demo;

public class Demo_Buffer {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("hello");
        System.out.println(s);
       int hashCode =s.hashCode();
        System.out.println(hashCode);

        StringBuffer d=new StringBuffer("hello");
        System.out.println(s);
        int hashCode1 =d.hashCode();
        System.out.println(hashCode1);

        StringBuffer append = s.append(d);
        System.out.println(append);
        int hashCode2 =d.hashCode();
        System.out.println(hashCode2);


    }
}
