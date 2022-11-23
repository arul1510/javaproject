package com.javaclass;

import java.util.List;
import java.util.Vector;

public class Vector_List_Collection {
public static void main(String[] args) {
	List <Integer> a = new Vector <> ();
	a.add(90);
	a.add(91);
	a.add(92);
	System.out.println(a);

	int i = a.size();
	System.out.println(i);
	
	Integer g = a.get(0);
	System.out.println(g);
	
	int in = a.indexOf(90);
	System.out.println(in);
	
	boolean b = a.contains(92);
	System.out.println(b);
	
	a.set(2, 100);
	System.out.println(a);
	
	//a.remove(1);
	//System.out.println(a);
	
	//a.clear();
	//System.out.println(a);
	
	List <Integer> a1 = new Vector <> ();
	a1.add(100);
	a1.add(101);
	a1.add(102);
	System.out.println(a1);
	
	//a1.addAll(a);
	//System.out.println(a1);
	
	//a1.removeAll(a1);
	//System.out.println(a1);
	
	a1.retainAll(a);
	System.out.println(a1);

	
}
}
