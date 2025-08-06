package com.corejava;
import java.util.Scanner;

class Task11 extends Thread{
	public void run() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the username");
		String usn=sc.next();
		System.out.println("Enter the password");
		String pwd =sc.next();
		System.out.println("Login Successfull!!!");
	}
	
}
class Task12 extends Thread{
	public void run() {
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
class Task13 extends Thread{
	public void run() {
		int a=1000; int b=2000;
		System.out.println("Result="+(a+b));
		
	}
}

public class MultiThreadingDEmo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task11 t1=new Task11();
		Task12 t2=new Task12();
		Task13 t3=new Task13();
		t1.start();
		t2.start();
		t3.start();
		

	}

}




