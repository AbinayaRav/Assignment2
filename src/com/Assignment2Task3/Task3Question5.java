package com.Assignment2Task3;

import java.util.Scanner;

public class Task3Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a long number : ");
        long num = scan.nextLong();
        System.out.println("The number of digits in the number is :");
        String s = String.valueOf(num);
        System.out.println(s.length());
        int[] arr = new int[s.length()];
        char[] c = s.toCharArray();
        for (int k = 0; k < arr.length; k++) {
            arr[k] = Integer.parseInt(String.valueOf(c[k]));
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of all the digits in the number is " + sum);
    }
}
