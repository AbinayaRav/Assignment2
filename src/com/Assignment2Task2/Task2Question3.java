package com.Assignment2Task2;

public class Task2Question3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        double average;
        average = (double)(a+b+c)/3;
        System.out.println("Average of a, b and c is "+average);
        if(average>a&&average>b&&average>c)
        {
            System.out.println("The average is greater than a, b and c");
        }
        else {
            if (average > a && average > b) {
                System.out.println("The average is greater than a and b");
            } else if (average > b && average > c) {
                System.out.println("The average is greater than b and c");
            } else if (average > a && average > c) {
                System.out.println("The average is greater than a and c");
            }
            else {
                if (average > a) {
                    System.out.println("The average is greater than just a");
                } else if (average > b) {
                    System.out.println("The average is greater than just b");
                } else if (average > c) {
                    System.out.println("The averag is greater than just c");
                }
            }
        }
    }
}
