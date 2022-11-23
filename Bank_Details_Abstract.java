package com.javaclass;

public class Bank_Details_Abstract extends Bank_Details {

	@Override
	public void atmpin() {
		System.out.println(0000);		
	}
	public static void main(String[] args) {
		Bank_Details_Abstract b=new Bank_Details_Abstract();
		b.accholdername();
		b.accnumber();
		b.atmpin();
	}

}
