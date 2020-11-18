package com.Assignment2;

import java.util.Scanner;

public class Task2Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number to check for divisibility of 3 or 5 or both :");
        int num = scan.nextInt();
        if((num%3==0)&&(num%5==0))
        {
            System.out.println("ConsultAdd Java Training");
        }
        else if(num%5==0)
        {
            System.out.println("Java Training");
        }
        else if(num%3==0)
        {
            System.out.println("ConsultAdd");
        }
        else
        {
            System.out.println("The entered number by the user is neither divisible by 3 nor 5.");
        }
    }
}
