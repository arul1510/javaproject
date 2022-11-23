package com.javaclass;

public class Task_A1 extends Task_B1{
	public Task_A1() {
		System.out.println();
		}	
	public Task_A1(int x) {
		System.out.println(x);
	}

public static void main(String[] args) throws Throwable {
	Task_A1 aa1=new Task_A1();
	Task_A1 aa2=new Task_A1(12);
	aa1.finalize();
	aa2.finalize();

}
}
