package com.javaclass;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hashset {
public static void main(String[] args) {
	Set <Object> s = new LinkedHashSet<> ();
	 s.add('a');
	 s.add(06);
	 s.add(null);
	 s.add("XYZ");
	 System.out.println(s);
	 
	 int si = s.size();
	 System.out.println(si);
	 
	 boolean c = s.contains(s);
	 System.out.println(c);
	 
	 //s.clear();
	 //System.out.println(s);
	 
	 Set <Object> s1 = new LinkedHashSet <> ();
	 s1.add('r');
	 s1.add(null);
	 s1.add(80);
	 s1.add("Z00");
	 System.out.println(s1);
	
	 s1.addAll(s);
	 System.out.println(s1);
	 
	 //s1.retainAll(s);
	 //System.out.println(s1);

	 //s1.removeAll(s);
	 //System.out.println(s1);
}
}
