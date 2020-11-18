package com.Assignment2Task3;

import java.time.Month;
import java.util.Scanner;

public class Task3Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a code from 1 to 12 to obtain the month : ");
        int inputMonthCode = scan.nextInt();
        try {
            Month month = Month.of(inputMonthCode);
            System.out.println("The entered number corresponds to " + Month.of(inputMonthCode));
            if (month.name().equalsIgnoreCase("FEBRUARY")) {
                System.out.println(month.name() + " has " + month.length(true) + " days in a leap year");
                System.out.println(month.name() + " has " + month.length(false) + " days in a non-leap year");
            } else {
                System.out.println(Month.of(inputMonthCode) + " has " + month.length(true) + " days");
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid detail entered. Not a valid month code!!");
        }

    }
}
