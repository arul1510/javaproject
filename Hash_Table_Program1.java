package com.javaclass;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Table_Program1 {
public static void main(String[] args) {
	Hashtable<String, String> s = new Hashtable<>();
	s.put("vel", "Selenium");
	s.put("Ganesh", "framework");
	s.put("Dinesh", "oracle");
	s.put("Vengat", "corejava");
	s.put("subash", "jira");
	System.out.println(s);
	
	int s1 = s.size();
	System.out.println(s1);
	
	String g = s.get("Ganesh");
	System.out.println(g);
	
	Set<String> ks = s.keySet();
	System.out.println(ks);
	
	Collection<String> v = s.values();
	System.out.println(v);
	
	boolean ck = s.containsKey("arul");
	System.out.println(ck);
	
	boolean cv = s.containsValue("CAD");
	System.out.println(cv);
	
	Set<Entry<String, String>> es = s.entrySet();
	System.out.println(es);
	
}
}
