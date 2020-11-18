package com.Assignment2;

import java.util.Scanner;

public class Task2Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a single character : ");
        char c = scan.next().charAt(0);
        boolean flag = false;
        char[] arr = new char[]{'r', 'a', 'n', 'd', 'o', 'm', 'R', 'A', 'N', 'D', 'O', 'M'};
        for (char d : arr) {
            if (c == d) {
                flag = true;
                System.out.println("FOUND");
                break;
            } else {
                flag = false;
            }
        }
        if (!flag) {
            System.out.println("NOT FOUND");
        }
    }
}

