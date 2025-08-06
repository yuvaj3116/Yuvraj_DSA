package com.yuvraj;

import java.util.Stack;

public class Task21 {
	public static void main(String[] args) {
		Stack<Integer> n = new Stack<Integer>();
		
		n.push(1);
		n.push(2);
		n.push(3);
		n.push(4);
		
		System.out.println(n);
		
		n.push(8);
		
		System.out.println(n);
		System.out.println(n.peek());
	}
}
