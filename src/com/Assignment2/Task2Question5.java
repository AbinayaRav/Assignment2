package com.Assignment2;

import java.util.ArrayList;

public class Task2Question5 {
    public static void main(String[] args) {
        int[] inputArray = new int[]{0,1,2,3,4,5,6};
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0 ; i<inputArray.length; i++)
        {
            if(!(inputArray[i]==3)&&!(inputArray[i]==6))
            {
                a.add(inputArray[i]);
            }
        }
        System.out.print("Input Array is :");
        for(int a1 : inputArray) {
            System.out.print("\t"+a1);
        }
        System.out.println();
        System.out.println("The result number list is : " +a);

    }
}
