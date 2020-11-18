package com.Assignment2Task3;

import java.util.Scanner;

public class Task3Question9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = scan.nextInt();
        System.out.println("\nThe right triangle number pattern for input n is as below : ");
        for(int i = 1; i<=n; i++)
        {
            for(int j =1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }


    }

}

