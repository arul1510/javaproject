package com.javaclass;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Tree_Map {
public static void main(String[] args) {
	Map<Character, Integer> tm = new TreeMap<>();
	tm.put('A', 20);
	tm.put('B', null);
	tm.put('C', 22);
	tm.put('D', null);
	System.out.println(tm);
	
	int s = tm.size();
	System.out.println(s);
	
	Integer g = tm.get('B');
	System.out.println(g);
	
	Set<Character> ks = tm.keySet();
	System.out.println(ks);
	
	Collection<Integer> v = tm.values();
	System.out.println(v);
	
	boolean ck = tm.containsKey('O');
	System.out.println(ck);
	
	boolean cv = tm.containsValue(78);
	System.out.println(cv);
	
	Set<Entry<Character, Integer>> es = tm.entrySet();
	System.out.println(es);
	
}
}
