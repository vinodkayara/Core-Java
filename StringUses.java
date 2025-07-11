package com.corejava;

public class StringUses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="RajaRamMohanRoy";
		
		System.out.println(s.charAt(7));
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.indexOf('R'));
		System.out.println(s.lastIndexOf('R'));
		System.out.println(s.substring(9));
		System.out.println(s.substring(4,11));
		
		
		for(int i=0;i<=s.length()-1;i++) {
			System.out.println(s.charAt(i));
			
		}
		
		for(char x : s.toCharArray()) {
			System.out.println(x);
		}
	}

}
