package com.javaclass;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map_Program1 {
public static void main(String[] args) {
	Map<Integer, String> s = new HashMap<>();
	s.put(10, "java");
	s.put(20, "sql");
	s.put(30, "oops");
	s.put(40, "Sql");
	s.put(50, "oracle");
	s.put(60, "DB");
	s.put(10, "selenium");
	s.put(50, "psql");
	s.put(40, "Hadoop");
	System.out.println(s);
	
	int s1 = s.size();
	System.out.println(s1);
	
	String g = s.get(50);
	System.out.println(g);
	
	Set<Integer> ks = s.keySet();
	System.out.println(ks);
	
	Collection<String> v = s.values();
	System.out.println(v);
	
	boolean ck = s.containsKey(30);
	System.out.println(ck);
	
	boolean cv = s.containsValue("DB");
	System.out.println(cv);
	
	Set<Entry<Integer, String>> es = s.entrySet();
	System.out.println(es);
}
}
