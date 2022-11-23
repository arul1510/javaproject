package com.javaclass;

public class StringClass {
public static void main(String[] args) {
	String st= "Hello java";
	String st1="Hello javaa";
	
	int l = st.length();
	System.out.println(l );
	
	boolean bo = st.equals(st1);
	System.out.println(bo);
	
	boolean bo1 = st1.equalsIgnoreCase(st1);
	System.out.println(bo1);
	
	String u = st.toUpperCase();
	System.out.println(u);
	
	String lo = st1.toLowerCase();
	System.out.println(lo);
	
	boolean sw = st.startsWith("java");
	System.out.println(sw);
	
	boolean ew = st1.endsWith("s");
	System.out.println(ew);
	
	boolean co = st.contains("o");
	System.out.println(co);
	
	int io = st1.indexOf("l");
	System.out.println(io);
	
	int li = st1.lastIndexOf("l");
	System.out.println(li);
	
	char ca = st.charAt(1);
	System.out.println(ca);
	
	String re = st.replace("Hello", "Hai");
	System.out.println(re);
	
	String ss = st.substring(5);
	System.out.println(ss);
	
	boolean iem = st.isEmpty();
	System.out.println(iem);
	
	String tr = st1.trim();
	System.out.println(tr);
	
	
	
}
}
