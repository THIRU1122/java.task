package com.index;

import java.util.Scanner;

//a program to print and seprate numbers between 1-100(even or odd)

public class Task2_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 100:");
        int num = input.nextInt();

        if ((num >= 1) && (num <= 100) && (num % 2 == 0)) {
            System.out.println(num + " is EVEN");
        }
        else if ((num >= 1) && (num <= 100) && (num % 2 != 0)) {
            System.out.println(num + " is ODD");
        }
        else {
            System.out.println("Not a valid number (must be between 1 and 100)");
        }

        input.close();
    }
}
