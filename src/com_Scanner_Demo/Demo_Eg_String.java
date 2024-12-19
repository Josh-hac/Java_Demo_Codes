package com_Scanner_Demo;

public class Demo_Eg_String {
    public static void main(String[] args) {
        String a="hey";
        System.out.println(a);
        int hashCode =a.hashCode();
        System.out.println(hashCode);

        String b= "hey";
        System.out.println(b);
        int hashCode1 =b.hashCode();
        System.out.println(hashCode1);

       String concat= b.concat(a);
        System.out.println(concat);
        int hashCode2=concat.hashCode();
        System.out.println(hashCode2);


    }
}
