package com.Assignment2Task3;

import java.util.Scanner;

public class Task3Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int num = scan.nextInt();
        int sum = 0;
        System.out.println("The first "+num+" natural numbers are :");
        for (int i = 1; i <= num; i++) {
            System.out.print(i + "\t");
            sum = sum + i;
        }
        System.out.println("\n");
        System.out.println("The sum of first "+num+" natural numbers is : " + sum);
    }

}
