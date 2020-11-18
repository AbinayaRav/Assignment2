package com.Assignment2Task3;

import java.util.Scanner;

public class Task3Question10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n to get the pascal's triangle : ");
        int n = scan.nextInt();
        System.out.println("\nThe pascal's triangle for n is : \t");
        for(int i = 1; i<=n;i++)
        {
            int k = 1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k = k*(i-j)/j;
            }
            System.out.println();
        }
    }
}
