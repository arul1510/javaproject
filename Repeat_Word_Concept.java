package com.javaclass;
 
import java.util.HashMap;
import java.util.Map;

public class Repeat_Word_Concept {
	public static void main(String[] args) {
		String s = "by the people for the people of the people";
		String[] sp = s.split(" ");
		Map<String, Integer> m = new HashMap<String, Integer>();
		//System.out.println(m);
		for (String str : sp) {
			if (m.containsKey(str)) {
				Integer i = m.get(str);
				m.put(str, i + 1);
			} else {
				m.put(str, 1);
			}
		}
		System.out.println(m);
	}
}
