package com.corejava;
import java.util.*;

public class StringMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder();
		System.out.println(s.capacity());
		System.out.println(s.length());
		s.append("sachin");
		System.out.println(s.capacity());
		System.out.println(s.length());
		s.append(" is a great batsman");
		System.out.println(s.capacity());
		System.out.println(s.length());
		
		
		
		s.insert(14 ,"  Human and ");
		System.out.println(s);
		
		s.delete(11, 12);
		System.out.println(s);
		
		s.replace(11, 13, " goat");
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
		
		

	}

}
