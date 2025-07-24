package com.corejava;


class Plane {
	public Plane() {
}
	// TODO Auto-generated constructor stub
	void takeoff() {
	System.out.println("Plane took off");
	}
	void fly() {
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plane has landed");
	}
}

class Cargo extends Plane{
	void fly() {
		System.out.println("Plane is flying with goods");
	}
}

class Passenger extends Plane{
	void fly() {
		System.out.println("Plane is flying with people");
	}
}

class Fighter extends Plane{
	void fly() {
		System.out.println("Plane is flying with wepons");
	}
	void shoot() {
		System.out.println("Fighter is fightng with bullets");
	}
}

public class InherinaceTypeMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cargo c =new Cargo();
		Passenger  p = new Passenger();
		Fighter f=new Fighter();
		c.takeoff();
		c.fly();
		c.land();
		p.takeoff();
		p.fly();
		p.land();
		f.takeoff();
		f.fly();
		f.land();
		f.shoot();
		
	}

}
