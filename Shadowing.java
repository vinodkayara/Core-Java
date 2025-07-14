package com.corejava;

class Student1 {
	String name;
	int age;
	float height;
	
	void setData(String n,int a, float h) {
		name= n;
		age=a;
		height=h;
		
	}
	
}

class Student2{
	String name;
	int age;
	float height;
	 void setData(String name ,int age,float height ){
		 name= name;
		 age=age;
		 height=height;
		 
	 }
}

class Student3{
	String name;
	int age;
	float height;
	
	void setData(String name,int age,float height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
}




public class Shadowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 =new Student1();
		s1.setData("Vin", 22, 5.8f);
		
		Student2 s2 =new Student2();
		s2.setData("Vik", 20, 5.8f);
		
		Student3 s3 =new Student3();
		s3.setData("VinKAy", 21, 5.8f);
		
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
		
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.height);
		
		System.out.println(s3.name);
		System.out.println(s3.age);
		System.out.println(s3.height);
		
		
		
		

	}

}
