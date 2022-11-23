package com.javaclass;

public class immutable {
public static void main(String[] args) {
	String s = "Prakash";
	System.out.println(System.identityHashCode(s));
	
	String s1 = "Prakash";
	System.out.println(System.identityHashCode(s1));
	
	System.out.println(System.identityHashCode(s+s1));
}
}
