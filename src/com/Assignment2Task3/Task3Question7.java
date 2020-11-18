package com.Assignment2Task3;

import java.time.Month;
import java.util.Scanner;

public class Task3Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a code from 1 to 12 to obtain the month : ");
        int inputMonthCode = scan.nextInt();
        System.out.println("Enter the year : ");
        int year = scan.nextInt();
        try {
            boolean flag = false;
            if (year % 4 == 0) {
                flag = true;
            }
            System.out.println(Month.of(inputMonthCode) + " " + year + " has " + Month.of(inputMonthCode).length(flag) + " days.");
        } catch (Exception e) {
            System.out.println("The entered month is invalid!!");
        }
    }
}
