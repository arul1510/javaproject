package com.javaclass;

public class StudentDetails {
public StudentDetails() {
System.out.println("Student");
}
public StudentDetails(String name) {
System.out.println(name);
}
public StudentDetails(int no) {
System.out.println("no");
}
public static void main(String[] args) throws Throwable {
	StudentDetails s1=new StudentDetails();
	StudentDetails s2=new StudentDetails("ARUL");
	StudentDetails s3=new StudentDetails(06);
	s1.finalize();
	s2.finalize();
	s3.finalize();
}
}
