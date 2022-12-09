package com.cheng.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String args[]) {
        //extracted();
        Student stu = new Student("Cheng", 78, 99);
        stu.print();
        System.out.println("hightest:" + stu.hignter());
    }

    private static void extracted() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter student's name:");
        String name = scanner.next();
        System.out.print("please enter student's english:");
        int english = scanner.nextInt();
        System.out.print("please enter student's math:");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
    }
}