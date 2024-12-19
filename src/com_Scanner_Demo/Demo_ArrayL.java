package com_Scanner_Demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo_ArrayL {

    public static void main(String[] args) {
        List<Object> m = new ArrayList<>();
        m.add("Hello");
        m.add(23);
        m.add(null);
        m.add("hello");
        m.add(true);
        m.add(null);
        m.add(null);
        System.out.println(m);






//        m.add(1,45);
//        System.out.println(m);
//
//        int size=m.size();
//        System.out.println(size);
//
//       int indexOf= m.indexOf(null);
//        System.out.println(indexOf);
//
//        int lastIndexOf=m.lastIndexOf(null);
//        System.out.println(lastIndexOf);
//
//        boolean contains=m.contains("hello");
//        System.out.println(contains);
//
//        Object j = m.get(0);
//        System.out.println(j);
//
//       m.set(4,"hi");
//        System.out.println(m);
//
//        m.remove(2);
//        System.out.println(m);

        List<Object> n = new ArrayList<>();
        n.add(null);
        n.add("hello");
        n.add(null);
        n.add(56);
        n.add(true);
        n.add(89);
        System.out.println(n);

//       n.removeAll(m);
//       System.out.println(n);

//      n.retainAll(m);
//      System.out.println(n);

//        n.clear();
//        System.out.println(n);
//        n.addAll(m);
//        System.out.println(n);
//       boolean isEmpty= n.isEmpty();
//        System.out.println(isEmpty);

//       boolean equals= n.equals(m);
//        System.out.println(equals);
//        String string = n.toString() ;
//        System.out.println(string);
//
//	int length = string.length();
//	System.out.println(length);

   Object[] toArray = n.toArray();
        for (Object Object3 :toArray) {
            System.out.println(Object3);
            
        }












    }
}
