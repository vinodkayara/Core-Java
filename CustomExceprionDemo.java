package com.corejava;

import java.util.Scanner;

class ALessThanBException extends Exception{
		public String getMessage() {
			return "a-b is negative.Sucstraction is not possible";
		}
	}
	public class CustomExceprionDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a=sc.nextInt();
		System.out.println("enter value of b");
		int b=sc.nextInt();
		try {
			if(a<b) {
				ALessThanBException e= new ALessThanBException();
				throw e;
			}
		}
		catch (ALessThanBException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Program Terminated normally");
		
		

	}

}
