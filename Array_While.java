package com.javaclass;

public class Array_While {
	public static void main(String[] args) {
		int i[] = new int [4];
		i[0]= 4;
		i[1]= 3;
		i[2]= 2;
		i[3]= 1;
		int j=0;
		while (j<=3) {
			System.out.println(i[j]);
			j++;
		}
}
}