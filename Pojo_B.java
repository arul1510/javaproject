package com.javaclass;

public class Pojo_B {
	
	private String st = "Pojoconcept";

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public static void main(String[] args) {
		
		Pojo_A a = new Pojo_A();
		int id = a.getId();
		System.out.println(id);
		
		a.setId(20);
		int id2 = a.getId();
		System.out.println(id2);
		
		a.setId(100);
		int id3 = a.getId();
		System.out.println(id3);
	}
}
