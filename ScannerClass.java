package com.javaclass;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
	Scanner o=new Scanner(System.in);
	
	System.out.println("FIRST NAME");
	String a = o.next();
	System.out.println(a);
	
	System.out.println("LAST NAME");
	String b = o.nextLine();
	System.out.println(b);
	
	System.out.println("NUMBER");
	int c = o.nextInt();
	System.out.println(c);
	
	System.out.println("SALARY");
	float d = o.nextFloat();
	System.out.println(d);
	
	System.out.println("SECTION");
	char e = o.next().charAt(0);
	System.out.println(e);
	
	System.out.println("DATE");
	byte f = o.nextByte();
	System.out.println(f);
	
	System.out.println("MONTH");
	short g = o.nextShort();
	System.out.println(g);
	
	System.out.println("PHONE NUMBER");
	long h = o.nextLong();
	System.out.println(h);
	
	System.out.println("TIME");
	double i = o.nextDouble();
	System.out.println(i);
	
	System.out.println("DEPARTMENT");
	String j = o.next().toString();
	System.out.println(j);
	
	System.out.println("TRUE or FALSE");
	boolean k = o.nextBoolean();
	System.out.println(k);
	
}
}
