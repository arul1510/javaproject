package com.javaclass;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
public static void main(String[] args) {
	Set<Object> a = new TreeSet <> ();
	a.add("arul");
	a.add("raju");
	a.add("ram");
	a.add("max");
	System.out.println(a);
	
	int s = a.size();
	System.out.println(s);
	
	boolean c = a.contains("arul");
	System.out.println(c);
	
	//a.clear();
	//System.out.println(a);
	
	Set<Object> a1 = new TreeSet <> ();
	a1.add("chennai");
	a1.add("tuty");
	a1.add("banglore");
	a1.add("rio");
	System.out.println(a1);
	
	a1.addAll(a);
	System.out.println(a1);
	
	//a1.retainAll(a);
	//System.out.println(a1);
	
	a1.removeAll(a);
	System.out.println(a1);
	
}
}
