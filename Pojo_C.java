package com.javaclass;

public class Pojo_C {

	public static void main(String[] args) {
		Pojo_B b = new Pojo_B();
		
		String st = b.getSt();
		System.out.println(st);
		
		b.setSt("Javaconcept");
		String st2 = b.getSt();
		System.out.println(st2);
	}
}
