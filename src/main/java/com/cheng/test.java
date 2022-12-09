package com.cheng;

public class test {
    {
        // System.out.println("kotlin");
        // new Person().hello();
        String s ="abcde";
        System.out.println(s.charAt(2));
        System.out.println(s.length());
        System.out.println(s.substring(0,3));

        Person p = new Person(65f,1.75f);
        p.hello();
//        p.weight=66.5f;
//        p.height=1.7f;
        System.out.println(p.bmi());
        int sorce = 61;
        System.out.println(sorce>60);
        System.out.println(sorce<60);
        char c ='A';
        System.out.println(c >60);
        System.out.println(c >'a');


    }
}
