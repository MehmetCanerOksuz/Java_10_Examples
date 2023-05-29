package com.bilgeadam.lesson019.stack;

import java.util.Random;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		Manager manager = new Manager();
		
		manager.tabakOlustur();
		System.out.println("Kirliler");
		System.out.println(manager.kirliler);
		System.out.println("Temizler");
		System.out.println(manager.temizler);
		
//		manager.temizle();
//		manager.temizle();
//		manager.temizle();
//		manager.temizle();
//		manager.temizle();
//		manager.temizle();
//		manager.temizle();
//		manager.temizle();
//		
//		System.out.println(manager.temizler);
//		System.out.println(manager.kirliler);
		
		for (int i = 0; i < 50; i++) {
			
			Random random = new Random();
			int sayi = random.nextInt(1,3);
			System.out.println((i+1) + "'nci işlem yapılıyor...!!!");
			manager.secimYap(sayi);
			Thread.sleep(1500);   // her for döngüsü arasında 1.5 saniye bekliyor... 
			
		}
		
		
		System.out.println("Kirliler");
		System.out.println(manager.kirliler);
		System.out.println("Temizler");
		System.out.println(manager.temizler);
		
	}
	

}
