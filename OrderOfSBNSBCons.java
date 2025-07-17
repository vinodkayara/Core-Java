package com.corejava;

class Demo1{
	static {
		System.out.println("SB Exec");
	}
	{
		System.out.println("NSB Exec");
	}
	Demo1() {
		System.out.println("Conc Exec");
	}
}

public class OrderOfSBNSBCons {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		Demo1 d3 = new Demo1();
	}
}

