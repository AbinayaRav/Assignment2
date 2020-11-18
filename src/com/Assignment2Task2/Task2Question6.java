package com.Assignment2Task2;

import java.util.Scanner;

public class Task2Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int number = scan.nextInt();
        if(number%2!=0) {
            System.out.println("NEW");
        }
        else if(number%2==0)
        {
            if(number>=2 && number<=5)
            {
                System.out.println("OLD");
            }
            else if(number>=6 && number<=30) {
                System.out.println("NEW");
            }
            else if(number > 30)
            {
                System.out.println("OLD");
            }

        }

    }
}
