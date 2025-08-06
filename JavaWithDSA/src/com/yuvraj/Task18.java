package com.yuvraj;

import java.util.ArrayList;

public class Task18 {
	public static void main(String[] args) {
		ArrayList<String> city = new ArrayList<String>();
		
		city.add("Mumbai");
		city.add("Pune");
		city.add("Banglore");
		city.add("Hyderabad");
		
		System.out.println(city);
		city.add(2, "Kolkata"); // insertion on index 2 
		System.out.println(city);
	}
}
