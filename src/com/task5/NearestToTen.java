package com.task5;

public class NearestToTen {
    
    public static void main(String... args) {
        
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        
        int near1 = 0, near2 = 0, nearest = 0;
        
        near1 = calculateAbs(number1);
        near2 = calculateAbs(number2);
        
        if (near1 == near2) {
           System.out.println("Ближайшее к 10 из " + number1 + " и " + number2 + ": " + number1 + " и " + number2); 
        } else {
            if (near1 < near2) {
                nearest = number1; 
            } else {
                nearest = number2;
            }
            System.out.println("Ближайшее к 10 из " + number1 + " и " + number2 + ": " + nearest);
        }
    }
            
    public static int calculateAbs(int number) {
        if ((number - 10) < 0) {
            number = 10 - number;
        } else {
            number = number - 10;
        }
        return number;
    }
}