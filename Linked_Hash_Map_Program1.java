package com.javaclass;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Linked_Hash_Map_Program1 {
public static void main(String[] args) {
	Map<Integer, Integer> s = new LinkedHashMap<>();
	s.put(10, 10);
	s.put(20, 20);
	s.put(30, 30);
	s.put(40, 40);
	s.put(50, 50);
	s.put(60, 60);
	s.put(10, 10);
	s.put(50, 50);
	s.put(40, 40);
	System.out.println(s);
	
	int s1 = s.size();
	System.out.println(s1);
	
	Integer g = s.get(40);
	System.out.println(g);
	
	Set<Integer> ks = s.keySet();
	System.out.println(ks);

	Collection<Integer> v = s.values();
	System.out.println(v);
	
	boolean ck = s.containsKey(30);
	System.out.println(ck);

	boolean cv = s.containsValue(10);
	System.out.println(cv);

	Set<Entry<Integer, Integer>> es = s.entrySet();
	System.out.println(es);
}
}
