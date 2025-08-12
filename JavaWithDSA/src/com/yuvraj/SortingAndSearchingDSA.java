package com.yuvraj;

import java.util.Scanner;

public class SortingAndSearchingDSA {
		
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) break; // No swaps => already sorted
		}
	}
	
	static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == key)
				return mid;
			else if (arr[mid] < key)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}
	
	static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Original Array:");
		printArray(arr);
		
		bubbleSort(arr);
		System.out.println("Sorted Array:");
		printArray(arr);
		
		System.out.print("Enter element to search: ");
		int key = sc.nextInt();
		
		System.out.println("\nLinear Search:");
		int linearIndex = linearSearch(arr, key);
		if (linearIndex != -1) {
			System.out.println("Found at index " + linearIndex);
		} else {
			System.out.println("Not Found");
		}
		
		System.out.println("\nBinary Search:");
		int binaryIndex = binarySearch(arr, key);
		if (binaryIndex != -1) {
			System.out.println("Found at index " + binaryIndex);
		} else {
			System.out.println("Not Found");
		}
		
		sc.close();
	}
}
