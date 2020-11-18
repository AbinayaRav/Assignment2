package com.Assignment2Task2;

import java.util.Scanner;

public class Task2Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please select one of the arithmetic operations to be performed :");
            System.out.println("1. Addition\t 2. Subtraction\t 3. Multiplication\t 4. Division\t 5. Average");
            int option = scan.nextInt();
            System.out.println("Please enter the first number :");
            int first = scan.nextInt();
            System.out.println("Please enter the second number :");
            int second = scan.nextInt();
            int result = 0;
            double result1 = 0.0;
            switch (option) {
                case 1:
                    result = first + second;
                    System.out.println("The result of addition is " + (result));
                    break;
                case 2:
                    result = (first - second);
                    System.out.println("The result of subtraction is " + result);
                    break;
                case 3:
                    result = (first * second);
                    System.out.println("The result of multiplication is " + result);
                    break;
                case 4:
                    result1 = (double) first / second;
                    System.out.println("The result of division is " + result1);
                    break;
                case 5:
                    System.out.println("Please enter third number :");
                    int first1 = scan.nextInt();
                    System.out.println("Please enter the fourth number :");
                    int second1 = scan.nextInt();
                    result1 = (double) (first + second + first1 + second1) / 4;
                    System.out.println("The average of the four numbers is : " + result1);
                    break;
            }
            if (result < 0 || result1 < 0) {
                System.out.println("Oops the result is a negative number!!!");
            }
            System.out.println("Do you wish to continue? (Y/N)");
            String select = scan.next();
            if (select.equalsIgnoreCase("Y")) {
                continue;
            } else {
                System.exit(0);
            }

        }
    }
}
