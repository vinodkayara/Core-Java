package com.corejava;


class Demo{
	int a,b;
}
public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		
		d1.a=10;
		d1.b=20;
		d2.a=30;
		d2.b=40;
		d3.a=50;
		d3.b=60;
		
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d2.a);
		System.out.println(d2.b);
		System.out.println(d3.a);
		System.out.println(d3.b);
		
	}

}
