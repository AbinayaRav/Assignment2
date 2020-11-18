package com.Assignment2Task3;

import java.util.Scanner;

public class Task3Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 numbers whose sum and average need to be determined :");
        int[] arr = new int[10];
        for(int i = 0; i<10; i++) {
            arr[i]=scan.nextInt();
        }
        int sum = 0;
        double avg = 0.0;
        for(int a : arr)
        {
         sum = sum + a;
        }
        System.out.println("The sum of the 10 input numbers is "+sum);
        avg = (double)sum/10;
        System.out.println("The average of the 10 input numbers is "+avg);


    }
}
