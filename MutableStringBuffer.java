package com.javaclass;

public class MutableStringBuffer {
public static void main(String[] args) throws InterruptedException {
	
	StringBuffer s = new StringBuffer("Prakash");
	System.out.println(System.identityHashCode(s));
	Thread.sleep(2000);
	
	StringBuffer s1 = new StringBuffer("Prakash");
	System.out.println(System.identityHashCode(s1));
	Thread.sleep(2000);

	System.out.println(System.identityHashCode(s1.append(s)));
	
}
}
