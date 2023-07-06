package com.bilgeadam.lesson031;

public class Hesap {
	
	int bakiye = 10000;
	
	public synchronized void paraYatir(int para) {
		
		bakiye = bakiye + para;
		System.out.println(Thread.currentThread().getName()+ "==>> para yatırdı");
		System.out.println(bakiye);
	}
	
	public synchronized void paraCek(int para) {
		
		if (bakiye >= para) {
			bakiye = bakiye - para;
			System.out.println(Thread.currentThread().getName()+ "==>> para çekti");
			System.out.println(bakiye);
		}else {
			System.out.println(Thread.currentThread().getName() + "==>> yetersiz bakiye");
		}
	
	}

}
