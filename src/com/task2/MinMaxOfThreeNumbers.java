package com.task2;

public class MinMaxOfThreeNumbers {
    
    public static void main(String... args) {
        
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int number3 = Integer.parseInt(args[2]);
        
        int min = number1, max = number1;
        if (number1 > number2) {
            min = number2;
        } else {
            max = number2;
        }
        if (min > number3) {
            min = number3;
        }
        if (max < number3) {
            max = number3;
        }
        
        System.out.println("Минимум из (" + number1 + ", " + number2 + ", " +number3+ ") : " + min);
        System.out.println("Максимум из (" + number1 + ", " + number2 + ", " +number3+ ") : " + max);
    }
}