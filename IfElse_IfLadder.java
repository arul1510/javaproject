package com.javaclass;

public class IfElse_IfLadder {
public static void main(String[] args) {
	int i1 = 10 ;
	if (i1>=35) {
		System.out.println("PASS");
	} else if (i1>=60 && i1<=70) {
		System.out.println("d grade");
	} else if (i1>=71 && i1<=80) {
		System.out.println("c grade");
	} else if (i1>=81 && i1<=90) {
		System.out.println("b grade");
	} else if (i1>=91 && i1<=100) {
		System.out.println("a grade");
	} else {
		System.out.println(" fail ");
	}
}
}
