package com.corejava;

public class StringMemoryConstPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2,s3,s4,s5;
		s1="java";
		s2="java";
		s3="python";
		s4="python";
		s5="java";
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s2==s5);
		System.out.println(s3==s4);
		System.out.println(s3==s5);
		System.out.println(s4==s5);

	}

}
