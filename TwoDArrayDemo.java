package com.corejava;
import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of classes: ");
		r=sc.nextInt();
		
		System.out.println("Enter no.of students in each class:");
		c=sc.nextInt();
		
		int a[][]=new int[r][c];
		
		for( i=0;i<=r-1;i++) {
			System.out.println("Enter marks of class"+(i+1)+":");
			for(j=0;j<=c-1;j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Marks of Students are:");
		for(i=0;i<=r-1;i++) {
			for(j=0;j<=c-1;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
