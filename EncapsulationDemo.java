package com.corejava;



class Book{
	private int pages;
	public void setData(int x) {
		if(x>0) {
			pages=x;
		}
	}
	
	public int getData() {
		return pages;
	}
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b= new Book();
		b.setData(100);
		System.out.println(b.getData());
		b.setData(-100);
		System.out.println(b.getData());
		
		

	}

}
