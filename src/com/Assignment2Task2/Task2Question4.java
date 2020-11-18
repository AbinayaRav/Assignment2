package com.Assignment2Task2;

import java.util.Scanner;

public class Task2Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter a number : ");
            int number = scan.nextInt();
            if (number >= 0) {
                System.out.println("******* Good Going *********");
                continue;
            } else {
                System.out.println(" ******* It's over!!!! *******");
                break;
            }
        }
    }
}
