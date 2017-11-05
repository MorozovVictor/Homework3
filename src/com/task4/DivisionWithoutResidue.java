package com.task4;

public class DivisionWithoutResidue {
    
    public static void main(String... args) {
        
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        
        if (number2 == 0) {
            System.out.println("На ноль делить нельзя");
        } else {
            if (number1 % number2 == 0) {
                System.out.println("Число " + number1 + " делится на " + number2 + " без остатка");
            } else {
                System.out.println("Число " + number1 + " делится на " + number2 + " с остатком " + number1 % number2);
            }
        }
    }
}