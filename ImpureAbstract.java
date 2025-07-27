package com.corejava;

import java.util.Scanner;

abstract class Shape{
	float area;
	abstract void input();
	abstract void calcArea();
	void disp() {
		System.out.println("Area "+area);
	}
}

class Rectangle extends Shape{
	float l,b;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length :");
		l=sc.nextFloat();
		System.out.println("enter the breadth :");
		b= sc.nextFloat();
	}
	void calcArea() {
		area=l*b;
	}
}

class Square extends Shape{
	float l;
	void input() {
	Scanner sc= new Scanner(System.in);
    System.out.println("Enter the length :");
    l=sc.nextFloat();
    
	}
	void calcArea() {
		area=l*l;
	}
    
}

class Circle extends Shape{
	float r;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the radius");
		r=sc.nextFloat();
		
	}
	void calcArea() {
		area=3.14f*r*r;
	}
	
}
class Geometry{
	void allowShape(Shape ref) {
		ref.input();
		ref.calcArea();
		ref.disp();
	}
}
public class ImpureAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r =new Rectangle();
		Square s =new Square();
		Circle c =new Circle();
		Geometry g =new Geometry();
		g.allowShape(r);
		g.allowShape(s);
		g.allowShape(c);
		
		
		

	}

}
