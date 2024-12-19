package com_Scanner_Demo;

public class Demo_String {
    public static void main(String[] args) {
        String a="how are 54677@#$$ayou";
        String b="How are You java";

       int c =a.length();
        System.out.println(c);

       int length= b.length();
        System.out.println(length);

      boolean equal= a.equals(b);
        System.out.println(equal);

       boolean equalsIgnoreCase=a.equalsIgnoreCase(b);
        System.out.println(equalsIgnoreCase);

       String toUpperCase =a.toUpperCase();
        System.out.println(toUpperCase);

      String toLowerCase =a.toLowerCase();
        System.out.println(toLowerCase);

        char charAt =a.charAt(4);
        System.out.println(charAt);

        int indexOf=a.indexOf('a');
        System.out.println(indexOf);

       int  lastIndexOf = a.lastIndexOf('a');
        System.out.println(lastIndexOf);

       boolean contains= b.contains("java");
        System.out.println(contains);

       boolean endsWith=b.endsWith("java");
        System.out.println(endsWith);


       boolean startsWith=a.startsWith ("hello");
        System.out.println(startsWith);


        String trim=a.trim();
        System.out.println(trim);

        String replace = a.replace('a','z');
        System.out.println(replace);

        String concat= a.concat("hy");
        System.out.println(concat);

       String substring=a.substring(7);
        System.out.println(substring);

        String substring1=a.substring(2,7);
        System.out.println(substring1);

       String join =a.join(" " ,"how","are","you");
        System.out.println(join);

        boolean isEmpty =b.isEmpty();
        System.out.println(isEmpty);

        String[] split=a.split(" ");
        for (String w:split){
            System.out.println(w);
        }

        String[] split1 = a.split("  ");
        for (String t:split1){
            System.out.println(t);
        }

       int indexOf1 = a.indexOf('e',6);
        System.out.println(indexOf1);

       String replaceAll=a.replaceAll("[^A-Za-z]","");
        System.out.println(replaceAll);










    }
}
