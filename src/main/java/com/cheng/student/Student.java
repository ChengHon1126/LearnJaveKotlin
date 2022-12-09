package com.cheng.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public int hignter(){
        //  int max =(english > math) ? english:math;
//        if (english > math){
//            max = english;
//        }else {
//            max = math;
//        }
        return (english > math) ? english:math;
    }
    public void print(){
        int average = getAverage();
        System.out.print(name + "\t"+ english + "\t" + math
                +"\t"+getAverage()+"\t"+
                ((getAverage()>=60) ? "PASS":"FAILED"));
        char garding = 'F';
        switch (average/10){
            case 10:
            case 9:
                garding = 'A';
                break;
            case 8:
                garding = 'B';
                break;
            case 7:
                garding = 'C';
                break;
            case 6:
                garding = 'D';
                break;
            default:
                garding = 'F';
        }
        System.out.println("\t"+"garding:"+garding);

//        if (getAverage() >= 60){
//            System.out.println("\tPASS");
//        }else {
//            System.out.println("\tFAILED");
//        }
    }

    public int getAverage(){
        return  (english+math)/2;
    }
}

