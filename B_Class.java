package com.javaclass;

public class B_Class extends A_Class{
@Override
public void studentname(String name) {
	super.studentname(name);
}
@Override
	public void studentnumber(long number) {
		super.studentnumber(number);
}
@Override
	public void studentdep(String dep) {
		super.studentdep(dep);
}
public static void main(String[] args) {
	B_Class m=new B_Class();
	m.studentname("Prakash");
	m.studentnumber(9994195026L);
	m.studentdep("Mech");
}
}
