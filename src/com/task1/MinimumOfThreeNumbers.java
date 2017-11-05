package com.task1;

public class MinimumOfThreeNumbers {
    
    public static void main(String... args) {
        
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int number3 = Integer.parseInt(args[2]);
        int min = number1;
        
        if (min > number2) {
            min = number2;
        }
        if (min > number3) {
            min = number3;
        }
        System.out.println("Минимальное из (" + number1 + ", " + number2 + ", " + number3 + ") : " + min);
    }
    
}