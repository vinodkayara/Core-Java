package com.corejava;
import java.util.Scanner;

public class OneDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter the no of Students:");
		n=sc.nextInt();
		System.out.println("Enter marks of the students");
		int a[]=new int [n];
		for(int i=0;i<=n-1;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=n-1;i++) {
			System.out.println("Marks of student"+" "+(i+1)+" "+"="+" "+a[i]);
		}
			
		sc.close();	
		

	}

}
