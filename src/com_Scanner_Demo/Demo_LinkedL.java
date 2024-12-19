package com_Scanner_Demo;

import java.util.LinkedList;
import java.util.List;

public class Demo_LinkedL {
    public static void main(String[] args) {
        List<Object> n = new LinkedList<>();
        n.add("hi");
        n.add(34);
        n.add(true);
        n.add(546577878889l);
        n.add('h');
        n.add(34);
        System.out.println(n);
        

//
//        n.add(2,"hello");
//        System.out.println(n);
//
//        int size =n.size();
//        System.out.println(size);
//
//       int indexOf= n.indexOf(34);
//        System.out.println(indexOf);
//
//        int lastIndexOf=n.lastIndexOf(34);
//        System.out.println(lastIndexOf);
//
//       boolean contains= n.contains("welcome");
//        System.out.println(contains);
//
//       Object get =n.get(4);
//        System.out.println(get);
//
//        n.set(2,"icecream");
//        System.out.println(n);
//
//       Object remove= n.remove(2);
//        System.out.println(remove);
//        System.out.println(n);

        List<Object>m=new LinkedList<>();
        m.add(34);
        m.add("hello");
        m.add(468854432l);
        m.add(true);
        m.add(56);
        m.add(false);
        System.out.println(n);
        System.out.println(m);

//       n.removeAll(m);
//        System.out.println(n);

//        n.retainAll(m);
//        System.out.println(n);
//        n.clear();
//        System.out.println(n);
//        n.addAll(m);
//        System.out.println(n);

        boolean isEmpty=n.isEmpty();
        System.out.println(isEmpty);

        boolean equals= n.equals(m);
        System.out.println(equals);

       Object[] toArray =n.toArray();
        for ( Object g :toArray) {
            System.out.println(g);

        }
       String toString =n.toString();
        System.out.println(toString);
        int t=toString.length();
        System.out.println( t);



        System.out.println(n);






    }
}
