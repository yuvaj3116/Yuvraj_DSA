package com.yuvraj;
//average
public class Task10 {
	

public static void main(String[] args) {
		
	int [] arr = {10,20,30,40,50,60};
	int sum = 0;

    for (int i=0;i<arr.length;i++) {
    	sum = sum + arr[i];
	}
    double average = (double) sum / arr.length;
    System.out.println("Average"+ average);
		}
	}

