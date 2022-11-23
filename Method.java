package com.javaclass;

public class Method {
public void studentdetails(String name) {
System.out.println("student name:" +name);
}
public void studentdetails(String dep,long number, char sec ) {
System.out.println("student dep:" +dep);
System.out.println("student number:" +number);
System.out.println("student sec:" +sec);
}
public static void main(String[] args) {
	Method s= new Method();
			s.studentdetails("Prakash");
			s.studentdetails("Mech", 82365225L, 'B');
}
}
