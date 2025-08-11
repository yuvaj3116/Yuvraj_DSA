package com.yuvraj;

import java.util.LinkedList;

public class Task25 {
		public static void main(String[] args) {
			LinkedList<String> fruits = new LinkedList<String>();
			
			fruits.add("Apple");
			fruits.add("Banana");
			
			System.out.println(fruits);
			
			fruits.addFirst("Mango");
			fruits.addLast("chikku");
			
			System.out.println(fruits);
		}
}
