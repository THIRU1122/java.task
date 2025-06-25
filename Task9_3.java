package com.index;

public class Task9_3 {

    public static void main(String[] args) {
        
        int[] arr1 = {2, 3, 45, 67, 89, 99, 56};
        int[] arr2 = {5, 6, 74, 89, 45, 34, 67};
        
        System.out.println("The common integers are:");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
