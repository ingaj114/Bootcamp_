package com.company.day3;

import java.util.Arrays;

public class TaskDay3 {
    public static void main(String[] args) {
        //TASK 1.
        //Write a program which creates two dimensional array and stores a multiplication table (from 1 - 10) in it.
        int i, j;
        int[][] multiArray = new int[10][10];
        for (i = 1; i < multiArray.length; i++) {
            for (j = 1; j < multiArray.length - 1; j++) {
                multiArray[i][j] = i * j;
                System.out.println(i + "*" + j + "=" + multiArray[i][j]);
            }
        }

        //TASK 2
        //Declare and initialize an array with four arbitrary whole numbers.
        // Write a Java program to copy this array by iterating it.

        int[] numbers = {5, 9, 2, 1};
        int[] copyNumbers = new int[numbers.length];

        for (int k = 0; k < numbers.length; k++) {
            copyNumbers[k] = numbers[k];
        }
        System.out.println("This is array " + Arrays.toString(numbers));
        System.out.println("This is copied array " + Arrays.toString(numbers));

        //TASK 3 and TASK 4 - java file BankAccount

        //TASK 5 - java file Vehicle, Car, Volvo
    }
}
