package com.javaclass;

public class While_Break {
public static void main(String[] args) {
	int i = 20;
	while (i>=10) {
		if (i == 13){
			break;
		}
		System.out.println(i);
		i-- ;
	}
}
}
