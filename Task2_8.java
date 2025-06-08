package com.index;

import java.util.Scanner;

public class Task2_8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);   
        
        System.out.println("Enter the start number:");
        int start = input.nextInt();
        
        System.out.println("Enter the end number:");
        int ending = input.nextInt();
        
        int total = 0;  
        
        for (int i = start; i <= ending; i++) {
            total += i;
        }
        
        System.out.println("The sum from " + start + " to " + ending + " = " + total);

        input.close();  
    }
}
