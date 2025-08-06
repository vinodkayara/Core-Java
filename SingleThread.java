package com.corejava;

import java.util.Scanner;

class Task1{
	void banking() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the username");
		String usn=sc.next();
		System.out.println("Enter the password");
		String pwd =sc.next();
		System.out.println("Login Successfull!!!");
	}
	
}
class Task2{
	void printing() {
		int i;
		try {
			for(i=1;i<=10;i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
class Task3{
	void adding() {
		int a=1000; int b=2000;
		System.out.println("Result="+(a+b));
		
	}
}

public class SingleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task1 t1=new Task1();
		Task2 t2=new Task2();
		Task3 t3=new Task3();
		t1.banking();
		t2.printing();
		t3.adding();
		

	}

}
