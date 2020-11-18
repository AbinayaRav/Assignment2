package com.Assignment2Task3;

import java.util.Scanner;

public class Task3Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year to determine if it is leap year or not : ");
        int year = scan.nextInt();
        if(year%4==0)
        {
            System.out.println("The year entered is a leap year.");
        }
        else
        {
            System.out.println("The year entered is a non leap year");
        }
    }
}
