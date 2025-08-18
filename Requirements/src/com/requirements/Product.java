package com.requirements;

 class Product {
	
	String pname;
	int quantity;
	int price;
	
	
	public Product(String pname) {
		this.pname=pname;
		this.quantity=1;
		this.price=0;
		
		
	}
	public Product(String pname, int quantity, int price) {
        this.pname = pname;
        this.quantity = quantity;
        this.price = price;
    }
	
	public int getTotal() {
		return quantity*price;
		
	}
	public void displayItems() {
		System.out.println("Product :"+pname);
		System.out.println("Quantity:"+quantity);
		System.out.println("Price:"+price);
		System.out.println("Total:"+getTotal());
		System.out.println("-----------------");
	}
	
	
public class ShoppingCart{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product("Lays",4,10);
		Product p2=new Product("Oreo",2,30);
		Product p3=new Product("Biscuit",3,20);
		
		p1.displayItems();
		p2.displayItems();
		p3.displayItems();

	}

}
 }
