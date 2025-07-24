package com.corejava;


class Plane2{
	void takeOff() {
		System.out.println("Plane took off");
	}
	void fly() {
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plane has landed");
	}
}

class Cargo1 extends Plane2{
	void takeOff() {
		System.out.println("Cargo took off to low altitude");
	}
	
}

class Passenger1 extends Plane2{
	void takeOff() {
		System.out.println("Passenger took off to mid altitude");
	}
	void fly() {
		System.out.println("Passenger flying with people");
	}
}

class Fighter1 extends Plane2{
	void takeOff() {
		System.out.println("Fighter took off to high altitude");
	}
	void fly() {
		System.out.println("Fighter is flying with wepons");
	}
	void land() {
		System.out.println("Fighter landed @200kmph");
	}
	
}

class Airport{
	void allowPlane(Plane2  ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class RunTimePolymorphismPlaneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cargo1 c = new Cargo1();
		Passenger1 p= new Passenger1();
		Fighter1 f = new Fighter1();
		Airport a =new Airport();
		
		a.allowPlane(c);
		a.allowPlane(p);
		a.allowPlane(f);
		

	}

}
