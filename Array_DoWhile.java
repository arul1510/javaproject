package com.javaclass;

public class Array_DoWhile {
public static void main(String[] args) {
	int h[] = new int[4];
	h[0]= 1;
	h[1]= 2;
	h[2]= 3;
	h[3]= 4;
	
	int a = 3;
	do {
		System.out.println(h[a]);
		a-- ;
	} while (a>=0);
}
}
