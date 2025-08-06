package com.corejava;
import java.util.Scanner;

class Task21 implements Runnable{
	public void run() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the username");
		String usn=sc.next();
		System.out.println("Enter the password");
		String pwd =sc.next();
		System.out.println("Login Successfull!!!");
		
	}
}

class Task22 implements Runnable{
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

class Task23 implements Runnable{
	public void run() {
		int a=1000; int b=2000;
		System.out.println("Result="+(a+b));
		
	}
}

public class MultiThreadedDemo {
	public static void main(String args[]) {
		Task21 t1=new Task21();
		Task22 t2=new Task22();
		Task23 t3=new Task23();
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		
		th1.start();
		th2.start();
		th3.start();
	}

}
