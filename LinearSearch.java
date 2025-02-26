package com.h.dsa;

import java.util.Scanner;

class LinearSearch {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter no. of elements in array=");
		int n = s.nextInt();

		int[] a = new int[n];

		System.out.println("Enter elements in the array:");
		int found = -1, i;
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		System.out.print("Enter key element which you have to search=");
		int key = s.nextInt();

		for (i = 0; i < n; i++) {
			if (a[i] == key) {
				found = 1;
				break;
			}

		}

		if (found == 1) {
			System.out.println("Element " + key + " found at index=" + i);
		} else {
			System.out.println("Element not exist in the array");
		}

		s.close();
	}

}
