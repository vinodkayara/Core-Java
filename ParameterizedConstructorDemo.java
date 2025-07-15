
package com.corejava;


class Student{
	String name;
	int age;
	float height;

Student(String name,int age,float height){
	this.name=name;
	this.age=age;
	this.height=height;
	
}

Student(){
	String name=null;
	int age=0;
	float height=0.0f;
}
}
public class ParameterizedConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Student s1=new Student("Raj",24,6.6f);
		Student s2=new Student();
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.height);
		
		

	}

}

