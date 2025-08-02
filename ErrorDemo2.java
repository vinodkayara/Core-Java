package com.corejava;

class Demo{
	void fun11() {
		fun11();
	}
	void fun12(){
		fun12();
	}
}
public class ErrorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d =new Demo();
		
		try {
			d.fun11();
		}
		catch(Exception e){
			System.out.println("Catch block executed");
			
		}
		System.out.println("program terminated normally");

	}

}
