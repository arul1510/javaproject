package com.javaclass;

import java.util.ArrayList;
import java.util.List;

public class Array_List_Collection {
public static void main(String[] args) {
	List<Integer> s = new ArrayList <>();
	s.add(1);
	s.add(2);
	s.add(3);
	System.out.println(s);
	
	int s1 = s.size();
	System.out.println(s1);
	
	Integer g = s.get(0);
	System.out.println(g);
	
	int i = s.indexOf(1);
	System.out.println(i);
	
	boolean b = s.contains(1);
	System.out.println(b);
	
	s.set(1, 5);
	System.out.println(s);
	
	//s.remove(2);
	//System.out.println(s);
	
	//s.clear();
	//System.out.println(s);
	
	List<Integer> s2 = new ArrayList <>();
	s2.add(4);
	s2.add(5);
	s2.add(6);
	System.out.println(s2);
	
	s.addAll(s2);	
	System.out.println(s);

	//s2.retainAll(s);
	//System.out.println(s2);
	
	//s2.removeAll(s);
	//System.out.println(s2);
}
}
