package com.yuvraj;

import java.util.*;

public class SimpleGraphs {
	static public void main(String[] args) { // public static or static public both are correct
		Map<String, List<String>> graph = new HashMap<>();
		
		graph.put("City A", Arrays.asList("City B", "City C"));
		graph.put("City B", Arrays.asList("City A", "City D"));
		graph.put("City C", Arrays.asList("City A"));
		graph.put("City D", Arrays.asList("City B"));
		
		List<String> cities = new ArrayList<String>(graph.keySet());
		
		for (int i = 0; i< cities.size(); i++) {
			String city = cities.get(i);
			System.out.println(city + "is connected to" + graph.get(city));
			
		}
	}
}
