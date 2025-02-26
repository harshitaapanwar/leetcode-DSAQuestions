package com.h.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = s.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}

		System.out.println("Sorted array is:"+Arrays.toString(arr));
		s.close();
	}
}
