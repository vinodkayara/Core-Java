package com.corejava;

class OS{
	OS(){
		System.out.println("OS is created");
	}
	void checkOS() {
		System.out.println("OS is working");
	}
}

class Charger{
	Charger(){
		System.out.println("Charger is created");
	}
	void checkCharger() {
		System.out.println("Charger is working");
	}
}

class  Mobile {
	OS s= new OS();
	Mobile(){
		System.out.println("Mobile is created");
	}
	void checkMobile() {
		System.out.println("Mobile is working");
	}
	void hasA(Charger c) {
		System.out.println("Charger connected to mobile");
	}
}
public class DelegationModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m= new Mobile();
		Charger c = new Charger();
		m.hasA(c);
		m.checkMobile();
		c.checkCharger();
		m.s.checkOS();
		m=null;
//		m.checkMobile();
//		m.s.checkOS();
		c.checkCharger();
		

	}

}
