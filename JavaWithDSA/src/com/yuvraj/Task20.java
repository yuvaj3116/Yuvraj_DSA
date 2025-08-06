package com.yuvraj;

import java.util.LinkedList;

public class Task20 {
	public static void main(String[] args) {
		LinkedList<String> colour = new LinkedList<String>();
		
		colour.add("Lavender");
		colour.add("Blue");
		colour.add("Orange");
		colour.add("Red");
		
		System.out.println(colour);
		
		colour.addLast("yellow"); // add at last position.
		
		System.out.println(colour);
				
	}
}
