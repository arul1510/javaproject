package com.javaclass;

public class Task_A {
public Task_A() {
	System.out.println("TASK NAME");
}
public Task_A(int ID) {
	System.out.println(ID);
}
public Task_A(String NAME) {
	System.out.println(NAME);
}
public Task_A(Float SAL) {
	System.out.println(SAL);
}
public static void main(String[] args) throws Throwable {
	Task_A a1=new Task_A();
	Task_A a2=new Task_A(06);
	Task_A a3=new Task_A("Constructor");
	Task_A a4=new Task_A(46.98F);
	a1.finalize();
	a2.finalize();
	a3.finalize();
	a4.finalize();
}
}
