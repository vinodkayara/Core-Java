package com.corejava;

import java.util.Scanner;
public class ThreeDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b,r,c,k,i,j;
		System.out.println("Enter number of school:");
		Scanner sc = new Scanner(System.in);
		b=sc.nextInt();
		
		System.out.println("Enter number of classes in each school :");
		r=sc.nextInt();
		
		System.out.println("Enter number of students in each class :");
		c=sc.nextInt();
		
		int a[][][]=new int[b][r][c];
		
		for(k=0;k<=b-1;k++) {
			for(i=0;i<=r-1;i++) {
				System.out.println("Enter marks of school "+(k+1)+" class "+(i+1) +" -"
						+ "3.x:");
				for(j=0;j<=c-1;j++) {
					
					a[k][i][j]=sc.nextInt();
					
					
				}
		
			}
		}
		
		System.out.println("Enter marks of students are :");
		for(k=0;k<=b-1;k++) {
			for(i=0;i<=r-1;i++) {
				
				for(j=0;j<=c-1;j++) {
					
					System.out.print(a[k][i][j]+" ");
					
					
				}
				System.out.println();
		
			}
			System.out.println("----------------");
		}
		
		
		
		

	}

}
