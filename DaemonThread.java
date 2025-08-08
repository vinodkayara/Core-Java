package com.corejava;

class MSWord1 implements Runnable{
	public void run(){
		if(Thread.currentThread().getName().equals("T-Thread")) {
			typing();
		}
		else if(Thread.currentThread().getName().equals("C-Thread")) {
			checking();
		}
		else {
			saving();
		}
		
	}
	void typing() {
		int i;
		try {
			for(i=0;i<=10;i++) {
				System.out.println("Typing...");
				Thread.sleep(2000);
				
			}
		}
		catch(InterruptedException e) {
			
		
		
			
		}
		
	}
	void checking() {
		int i;
		try {
			for(i=0;i<=10;i++) {
				System.out.println("checking...");
				Thread.sleep(2000);
				
			}
		}
		catch(InterruptedException e) {
			
		
		
			
		}

		
	}
	void saving() {
		int i;
		try {
			for(i=0;i<=10;i++) {
				System.out.println("saving...");
				Thread.sleep(2000);
				
			}
		}
		catch(InterruptedException e) {
			
		
		
			
		}

		
	}
}

public class DaemonThread {

	public static void main(String[] args) {
		MSWord1 m =new MSWord1();
		Thread t1 =new Thread(m);
		Thread t2=new Thread(m);
		Thread t3 = new Thread(m);
		t1.setName("T-Thread");
		t2.setName("C-Thread");
		t3.setName("S-Thread");
		t2.setDaemon(true);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
