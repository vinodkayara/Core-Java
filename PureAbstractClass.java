package com.corejava;

abstract class Plane3{
	abstract void takeOff();
	abstract void land();
}

class Passenger2 extends Plane3{
	void takeOff() {
		System.out.println("Plane takeOff to medium altitude");
	}
	void land() {
		System.out.println("Plane has landed @100kmph");
	}
}

class Cargo2 extends Plane3{
	void takeOff() {
		System.out.println("Plane took off to low altitude");
	}
	
	void land() {
		System.out.println("Plane has landed @60kmph");
	}
}

class Fighter2 extends Plane3{
	void takeOff() {
		System.out.println("Plane took off to high altitude");
	}
	void land() {
		System.out.println("Plane has landed @200kmph");
	}
}

class Airport1{
	void allowPlane2(Plane3 ref) {
		ref.takeOff();
		ref.land();
	}
}
public class PureAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passenger2 p =new Passenger2();
		Cargo2 c =new Cargo2();
		Fighter2 f =new Fighter2();
		Airport1 a =new Airport1();
		a.allowPlane2(c);
		a.allowPlane2(p);
		a.allowPlane2(f);
		
		
		

	}

}
