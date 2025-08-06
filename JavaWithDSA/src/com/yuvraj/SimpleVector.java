package com.yuvraj;

import java.util.Collections;
import java.util.Vector;

public class SimpleVector {
	public static void main(String[] args) {
		Vector<String> fruits = new Vector<String>();  // syntax
		fruits.add("Apple"); //insertion.
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Blueberry");
		
		Collections.sort(fruits);  // to sort alphabetically.
		
		System.out.println(fruits);
		
		// Deletion
		fruits.remove(2);  // if you want to delete by name just write it like a string. Example - "Apple".
		
		System.out.println(fruits.get(1));  // to print specific fruit.
		System.out.println(fruits.size());  // to get the size.
		
	}
}
