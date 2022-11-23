package com.javaclass;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Tree_Hash_Map_Program1 {
public static void main(String[] args) {
	 Map<String, Integer> s = new TreeMap<>();
	 s.put ("!", 10);
	 s.put ("@", 20);
	 s.put ("#", 30);
	 s.put ("$", 40);
	 s.put ("%", 50);
	 s.put ("^", 60);
	 s.put ("&", 10);
	 s.put ("*", 50);
	 s.put ("(", 40);
	 System.out.println(s);

	 int s1 = s.size();
	 System.out.println(s1);
	 
	 Integer g = s.get("$");
	 System.out.println(g);
	 
	 Set<String> ks = s.keySet();
	 System.out.println(ks);
	 
	 Collection<Integer> v = s.values();
	 System.out.println(v);

	 boolean ck = s.containsKey("(");
	 System.out.println(ck);
	 
	 boolean cv = s.containsValue(40);
	 System.out.println(cv);
	 
	 Set<Entry<String, Integer>> es = s.entrySet();
	 System.out.println(es);
	 
}
}
