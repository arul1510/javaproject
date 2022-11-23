package com.javaclass;

public class MutableStringBuilder {
public static void main(String[] args) {
	StringBuilder s = new StringBuilder("Marcus");
	System.out.println(System.identityHashCode(s));
	
	StringBuilder s1 = new StringBuilder("Marcus");
	System.out.println(System.identityHashCode(s1));
	
	System.out.println(System.identityHashCode(s.append(s1)));
}
}
