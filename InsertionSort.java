package com.h.dsa;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {  
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {  
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        s.close();  
    }
}
