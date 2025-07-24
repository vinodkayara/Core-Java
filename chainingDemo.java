package com.corejava;

class Parent{
	Parent(){
		System.out.println("parent cons exec");
		
	}
	
}

class child extends Parent{
	child(){
		this(10);
		System.out.println("child 0 para exec");
	}


	child(int a){
		this(10,20);
		System.out.println("child para 1 cons exec");
	}
	
	child(int a ,int b){
		super();
		System.out.println("child 2 para cons exec");
	}
}
public class chainingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c = new child();

	}

}
