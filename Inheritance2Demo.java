package com.corejava;

class A {
	int i;

}

class B extends A {
	int i;

	B(int x, int y) {
		i = x;
		i = y;
	}

	void disp() {
		System.out.println("A 's i=" + i);
		System.out.println("B 's i=" + i);

	}
}

class C extends A {
	int i;

	C(int x, int y) {
		super.i = x;
		i = y;
	}

	void disp() {
		System.out.println("A 's i=" + super.i);
		System.out.println("C 's i=" + i);

	}
}

public class Inheritance2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(10, 20);
		b.disp();
		C c = new C(10, 20);
		c.disp();
	}

}
