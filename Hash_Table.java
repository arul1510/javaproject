package com.javaclass;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Table {
public static void main(String[] args) {
	Hashtable<Character, Integer> ht = new Hashtable<>();
	ht.put('y', 1);
	ht.put('x', 2);
	ht.put('z', 3);
	System.out.println(ht);
	
	int s = ht.size();
	System.out.println(s);
	
	Integer g = ht.get('z');
	System.out.println(g);
	
	Set<Character> ks = ht.keySet();
	System.out.println(ks);
	
	Collection<Integer> v = ht.values();
	System.out.println(v);
	
	boolean ck = ht.containsKey('y');
	System.out.println(ck);
	
	boolean cv = ht.containsValue(4);
	System.out.println(cv);
	
	Set<Entry<Character, Integer>> es = ht.entrySet();
	System.out.println(es);
}
}
