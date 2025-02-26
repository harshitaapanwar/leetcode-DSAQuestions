package com.h.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter no. of elements in array=");
		int n = scan.nextInt();

		int[] a = new int[n];
		int temp, i, j;
		System.out.println("Enter elements in the array:");
		
		for (i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted array by bubble sort =" + Arrays.toString(a));
		scan.close();
	}
}
