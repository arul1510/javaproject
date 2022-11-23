package com.javaclass;

public class Reverse {
	public static void main(String[] args) {
		String name = " I AM ARUL PRAKSASH";
		 String empty = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			empty = empty + name.charAt(i);
		}
		 System.out.println("Reverse Name : " +empty);
	}
}
