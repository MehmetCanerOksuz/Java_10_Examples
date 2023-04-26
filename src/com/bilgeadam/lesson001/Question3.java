package com.bilgeadam.lesson001;

/*
 * Bir ürün fiyatında %18 kdv % 15 kar payı olduğunu biliyoruz.
 * 
 * bu ürünün fiyatı elimizde olsun
 * daha sonra bu fiyat üzerinden ürünün
 * ham fiyatı ve kdvsiz fiyatını bulalımç
 * 
 * 
 */

public class Question3 {
	
	public static void main(String[] args) {
		
		
		float fiyat = 100f;
		float kdvsizFiyat = fiyat/1.18f;
		float hamFiyat =kdvsizFiyat/1.15f;
		
		System.out.println("kdvsiz Fiyatı : " + kdvsizFiyat);
		System.out.println("ham fiyatı : " + hamFiyat);
		
	}

}
