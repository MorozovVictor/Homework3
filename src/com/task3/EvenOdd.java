package com.task3;

public class EvenOdd {
    
    public static void main(String... args) {
        
        int number = Integer.parseInt(args[0]);
        
        if (number % 2 == 0) {
            System.out.println("Число " + number + " четное");
        } else {
            System.out.println("Число " + number + " нечетное");
        }
    }
}