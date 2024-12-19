package com_Scanner_Demo;

public class Demo_Builder {
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder("how r u");
        System.out.println(s);
       int hashCode= s.hashCode();
        System.out.println(hashCode);

        StringBuilder d= new StringBuilder("how r u");
        System.out.println(d);
        int hashCode1= d.hashCode();
        System.out.println(hashCode1);

      StringBuilder append = d.append(s);
        System.out.println(append);
        int hashCode2= d.hashCode();
        System.out.println(hashCode2);





    }
}
