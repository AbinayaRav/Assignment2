package com.Assignment2Task3;

import java.util.Scanner;

public class Task3Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = scan.nextInt();
        System.out.println("Enter the second number : ");
        int b = scan.nextInt();
        System.out.println("Enter the third number : ");
        int c = scan.nextInt();
        if((a<b)&&(b<c)&&(a<c))
        {
            System.out.println("INCREASING");
        }
        else if((a>b)&&(a>c)&&(b>c))
        {
            System.out.println("DECREASING");
        }
        else
        {
            System.out.println("The numbers are neither increasing nor decreasing!!");
        }


    }
}
