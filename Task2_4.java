package com.index;

import java.util.Scanner;

//prime numbers

public class Task2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == 13 || 
            num == 17 || num == 19 || num == 23 || num == 29) {
            System.out.println(num + " is a prime number");
        }

        if (num == 1 || num == 4 || num == 6 || num == 8 || num == 9 || num == 10 ||
            num == 12 || num == 14 || num == 15 || num == 16 || num == 18 || num == 20 ||
            num == 21 || num == 22 || num == 24 || num == 25 || num == 26 || num == 27 ||
            num == 28) {
            System.out.println(num + " is not a prime number");
        }

        if (num <= 0 || num > 29) {
            System.out.println("Number out of supported range for 'if only' prime check.");
        }

        sc.close();
    }
}