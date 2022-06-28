package com.company;

import java.util.Scanner;

public class TasksDay2 {
    public static void main(String[] args) {
        //TASK 1
        //Ask user to input two numbers, compare them and output result:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter a value 2: ");
        int b = scanner.nextInt();

        System.out.println("Is " + a + " equal to " + b + "? " + (a == b));
        System.out.println("Is " + a + " less than " + b + "? " + (a < b));
        System.out.println("Is " + a + " less or equal to " + b + "? " + (a <= b));
        System.out.println("Is " + a + " greater than " + b + "? " + (a >= b));
        System.out.println("Is " + a + " greater or equal to " + b + "? " + (a >= b));
        System.out.println();

        //TASK 2
        //Ask user to input two boolean values and compare them.
        System.out.print("Enter one of the true or false values to compare them: "); // some problems with boolean and scanner, doesn't work
        String b1 = scanner.next();
        System.out.print("Enter one of the true or false values to compare them: ");
        String b2 = scanner.next();

        if (b1.equalsIgnoreCase(b2)) System.out.println("Is " + b1 + " and " + b2 + " equal? -" + true);
        else System.out.println("Is " + b1 + " and " + b2 + " equal? -" + false);
        System.out.println();

        //TASK 3 and 4
        //Ask user to input a whole number and output true, if it is even number and false if it is odd number
        System.out.print("Enter a whole number to check whether it is even: ");
        int oddEven = scanner.nextInt();
        if (oddEven % 2 == 0) {
            System.out.println("true");
        } else System.out.println("false");
        System.out.println();

        //TASK 5
        //Write a program which reads boolean value from user and prints out the opposite value:
        System.out.print("Enter boolean value: "); // some problems with boolean and scanner, doesn't work
        String bool = scanner.next();
        if (bool.equalsIgnoreCase("true")) System.out.println("Opposite of " + "\"" + bool + "\"" + " is " + "\"" + false + "\"");
        else System.out.println("Opposite of " + "\"" + bool + "\"" +  " is " + "\"" + true + "\"");
        System.out.println();

        //TASK 6
        //Write a program which asks the user to input two whole numbers a and b. Output "true", if one of this condition is true:
        System.out.print("Enter first whole number: ");
        int a1 = scanner.nextInt();
        System.out.print("Enter second whole number: ");
        int a2 = scanner.nextInt();

        if (a1 == a2) System.out.println(true);
        else if (a1 < 0 && a2 > 0) System.out.println("a is " + a1 + " and b is " + a2 + " -> " + true);
        else if (a1 > 100 && a2 > 100) System.out.println("a is " + a1 + " and b is " + a2 + " -> " + true);
        else System.out.println("a is " + a1 + " and b is " + a2 + " -> " + false);

    }
}
