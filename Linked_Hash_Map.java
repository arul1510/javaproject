package com.javaclass;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Linked_Hash_Map {
public static void main(String[] args) {
	Map<String, Integer> hm = new LinkedHashMap<>();
	hm.put("z", 1);
	hm.put("y", 7);
	hm.put("x", 6);
	hm.put("w", 5);
	System.out.println(hm);
	
	int s = hm.size();
	System.out.println(s);
	
	Integer g = hm.get("x");
	System.out.println(g);
	
	Set<String> ks = hm.keySet();
	System.out.println(ks);

	Collection<Integer> v = hm.values();
	System.out.println(v);
	
	boolean ck = hm.containsKey("w");
	System.out.println(ck);

	boolean cv = hm.containsValue(8);
	System.out.println(cv);

	Set<Entry<String, Integer>> es = hm.entrySet();
	System.out.println(es);

}
}
