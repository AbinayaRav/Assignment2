package com.Assignment2Task3;

import java.util.Scanner;

public class Task3Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number whose multiplication table needs to be printed :");
        int number = scan.nextInt();
        System.out.println("Please enter the value till which the table has to be printed : ");
        int range = scan.nextInt();
        System.out.println("\n***************The multiplication table of "+number+" until "+range+" is as below : **************\n");
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
