package com.javaclass;

public class Bank_Data_B implements Bank_Data {

	@Override
	public void accholdername() {
	System.out.println("Arul Prakash");
		
	}

	@Override
	public void accnumber() {
	System.out.println(501046346L);
		
	}

	@Override
	public void branch() {
	System.out.println("velachery");
		
	}
public static void main(String[] args) {
	Bank_Data_B d=new Bank_Data_B();
	d.accholdername();
	d.accnumber();
	d.branch();
}
}
