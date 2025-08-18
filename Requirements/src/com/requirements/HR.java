package com.requirements;

class Employee{
	String name;
	int age;
	String job;
	double salary;
	

public Employee(String name,int age,String job,double salary) {
	this.name=name;
	this.age=age;
	this.job=job;
	this.salary=salary;
	
	
}

public Employee(String name,String job) {
	this.name=name;
	this.job=job;
	
}
public Employee(String job,double salary) {
	this.job=job;
	this.salary=salary;
}

public void displayEmpInfo() {
	if(name!=null)System.out.println("Name:"+name);
	if(age!=0)System.out.println("Age:"+age);
	if(job!=null)System.out.println("Job"+job);
	if(salary!=0)System.out.println("Salary :"+salary);
	System.out.println("---------------------");
}

public class HR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee e1 = new Employee("Roy", 40, "Manager", 40000);
	        Employee e2 = new Employee("Dhruv", 26, "Developer", 30000);
	        Employee e3 = new Employee("Kiran", "Developer");
	        Employee e4 = new Employee("Tester", 45000);

	        e1.displayEmpInfo();
	        e2.displayEmpInfo();
	        e3.displayEmpInfo();
	        e4.displayEmpInfo();
		

	}
}
}
