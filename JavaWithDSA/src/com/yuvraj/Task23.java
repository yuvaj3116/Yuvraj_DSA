package com.yuvraj;

import java.util.ArrayList;
import java.util.Collections;

public class Task23 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Yuvi");
		names.add("Sonu");
		names.add("Shrau");
		names.add("Grace");
		names.add("Aarya");
		
		Collections.sort(names);
		System.out.println(names);

	}
}
