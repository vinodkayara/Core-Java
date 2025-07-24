package com.corejava;
class Parent1{
	void disp1() {
		System.out.println("Parent disp1");
	}
	void disp2() {
		System.out.println("Parent disp2");
	}
	
}
class child1 extends Parent1{
	void disp() {
		System.out.println("child disp2");
		
	}
	void disp3() {
		System.out.println("child disp3");
	}
}
public class InheritnceCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 c=new child1();
		c.disp();
		c.disp1();
		c.disp3();
		Parent1 p;
		p=c;
		p.disp1();
		p.disp2();
		((child1)p).disp3();

	}

}
