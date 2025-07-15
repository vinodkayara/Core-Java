package com.corejava;



class Student{
	String name;
	int age;
	float height;
	
}

//class Student{
//	String name;
//	int age;
//	float height;
//	
//}

public class Constructor1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 =new Student();
		
		s1.name="Suhas";
		s1.age=23;
		s1.height=6.8f;
		
	Student s2 =new Student();
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.height);
		
		
		

	}

}
