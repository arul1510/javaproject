package com.javaclass;

import java.util.LinkedList;
import java.util.List;

public class Linked_List_Collection {
public static void main(String[] args) {
	List<Integer> s = new LinkedList<> ();
	s.add(11);
	s.add(12);
	s.add(13);
	s.add(14);
	System.out.println(s);
	
	int si = s.size();
	System.out.println(si);
	
	Integer g = s.get(2);
	System.out.println(g);
	
	int in = s.indexOf(11);
	System.out.println(in);
	
	boolean co = s.contains(55);
	System.out.println(co);

	s.set(2, 31);
	System.out.println(s);
	
	//s.remove(2);
	//System.out.println(s);
	
	//s.clear();
	//System.out.println(s);
	
	List<Integer> s1 = new LinkedList<> ();
	s1.add(15);
	s1.add(16);
	s1.add(31);
	s1.add(41);
	System.out.println(s1);
	
	//s1.addAll(s);
	//System.out.println(s1);
	
	//s1.retainAll(s);
	//System.out.println(s1);

	s1.removeAll(s);
	System.out.println(s1);
}
}
