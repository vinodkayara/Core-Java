package com.corejava;

import java.util.*;

public class CursorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Integer> v= new Vector();
		v.add(10);
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(15);
		System.out.println(v);
		Enumeration<Integer> en = v.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
		
		

	}

}
