package com.corejava;



class Demo2{
	static{
		System.out.println("SB1 Exec");
		
	}
	static {
			System.out.println("SB2 Exec");
	}
static {
	System.out.println("SB3 Exec");
}

{
	System.out.println("NSB1 Exec");
}
{
	System.out.println("NSB2 Exec");
}
{
	System.out.println("NSB3 Exec");
}
  Demo2(){
	System.out.println("Cons Exec");
}
}
public class OrderOfSBNSBCons2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d1= new Demo2();
		Demo2 d2= new Demo2();
		Demo2 d3= new Demo2();
	

	}

}
