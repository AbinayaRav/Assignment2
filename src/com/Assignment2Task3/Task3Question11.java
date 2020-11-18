package com.Assignment2Task3;

import java.util.Scanner;

public class Task3Question11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first floating point number : ");
        float n = scan.nextFloat();
        System.out.println("Enter the second floating point number : ");
        float m = scan.nextFloat();
        String str1 = String.valueOf(n);
        String str2 = String.valueOf(m);
        Task3Question11 task = new Task3Question11();
        if (task.getNumberUptoTwoDecimalPoints(str1).equals(task.getNumberUptoTwoDecimalPoints(str2))) {
            System.out.println("The two decimal numbers are same upto two decimal places.");
        } else {
            System.out.println("The two decimal numbers are not same.");
        }
    }

    public String getNumberUptoTwoDecimalPoints(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                if (str.substring(i).length() > 2) {
                    str = str.substring(i + 1, i + 3);
                    break;
                }
            }
        }
        return str;
    }
}
