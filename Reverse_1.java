package com.javaclass;

public class Reverse_1 {
	public static void main(String[] args) {
		String s = "I am Arul prakash";
		for (int i = s.length() -1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
