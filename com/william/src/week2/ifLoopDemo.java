package com.william.src.week2;

// public class Example1{
//    public static void main(String args[]){
//        int score=55;
//
//        if (score >= 80){
//            System.out.println("A");
//        }else if (score >= 60){
//            System.out.println("B");
//        }else if (score >= 40){
//            System.out.println("C");
//        }else{
//            System.out.println("F");
//        }
//
//        System.out.println("End");
//    }
//}

// Refactor the above codes
public class ifLoopDemo {
    public static void main(String[] args) {
        int score = 55;

        if (score <= 39){
            System.out.println("F");
        } else if (score <= 59) {
            System.out.println("C");
        } else if (score <= 79) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }

        System.out.println("End");
    }
}
