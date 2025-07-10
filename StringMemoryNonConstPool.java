package com.corejava;

public class StringMemoryNonConstPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2,s3,s4,s5;
		s1= new String("java");
		s2= new String("java");
		s3= new String("python");
		s4= new String("python");
		s5= new String("java");
		
		
		
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
