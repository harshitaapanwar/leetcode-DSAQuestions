package com.h.dsa;

import java.util.Arrays;
import java.util.Scanner;

class BinarySearch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of elements in array=");
		int n = s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter elements in the array:");
		int i;
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		int length = a.length;
		int value = 0;
		for (i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (a[i] > a[j]) {
					value = a[i];
					a[i] = a[j];
					a[j] = value;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.print("Enter key element which you have to search=");
		int key = s.nextInt();

		int left = 0, result = 0;
		int right = length - 1, found = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (a[mid] == key) {
				result = mid;
				found = 1;
				break;

			}

			if (a[mid] < key) {
				left = mid + 1;
			}

			else {
				right = mid - 1;
			}
		}
		if (found == 1) {
			System.out.println("Element " + key + " found at index = " + result);
		} else {
			System.out.println("Element not found");
		}
		s.close();
	}

}