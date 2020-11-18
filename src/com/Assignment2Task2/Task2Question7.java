package com.Assignment2Task2;

import java.util.Scanner;

public class Task2Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a floating point number : ");
        float number = scan.nextFloat();
        if(number==0) {
            System.out.print("ZERO ");
        }
        else if(number>0)
        {
            System.out.print("Positive ");
        }
        else if (number<0)
        {
            System.out.print("Negative ");
        }
        if(Math.abs(number)<1)
        {
            System.out.println("Small");
        }
        else if(Math.abs(number)>1000000)
        {
            System.out.println("Large");
        }
    }
}
