package com.javaclass;

public class DoWhile_Continue {
public static void main(String[] args) {
	int a = 100;
	do {
		System.out.println(a);
		a-- ;
		if (a==93) {
			continue;
		}
	} while (a>=90);
}
}
