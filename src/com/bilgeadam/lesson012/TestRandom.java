package com.bilgeadam.lesson012;

import java.util.Random;

public class TestRandom {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int sayi = random.nextInt(3);  // 3 dahil değil 3 e kadar rastgele sayı...
		System.out.println(sayi);
		
		int sayi2 = random.nextInt(5,9);  //5 dahil, 9 dahil değil.. rastgele sayı...
		System.out.println(sayi2);
		
		double sayi3 = random.nextDouble(10);
		System.out.println(sayi3);
		
		boolean kontrol = random.nextBoolean();
		System.out.println(kontrol);
		
	}

}
