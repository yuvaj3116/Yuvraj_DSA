package com.yuvraj;

import java.util.ArrayList;

public class Task22 {
	public static void main(String[] args) {
		ArrayList<String> Brand = new ArrayList<String>();
		Brand.add("Apple");
		Brand.add("Samsung");
		Brand.add("Vivo");
		Brand.add("Oppo");
		
		System.out.println(Brand);
		
		Brand.add(2, "IQOO");
		
		System.out.println(Brand);
		
	}
}
