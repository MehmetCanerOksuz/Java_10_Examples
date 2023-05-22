package com.bilgeadam.lesson006;
/*
 * 
 * Dizideki en büyük ve en kücük elemanı bulan algoritma
 */

public class Question38 {
	
	public static void main(String[] args) {
		
		int[] sayilar = {0, 12, 5, 85, -89, 1258, 87, 14};
		
		int enBuyuk = sayilar[0];    //Integer.MIN_VALUE;
		int enKucuk = sayilar[0];    //Integer.MAX_VALUE;
		
		for (int i = 0; i < sayilar.length; i++) {
			int sayi= sayilar[i];
			if(sayi>enBuyuk) {
				enBuyuk=sayi;
			}
			if(sayi<enKucuk) {
				enKucuk=sayi;
			}
			
		}
		System.out.println("En Küçük = "+enKucuk +"\nEn Büyük = "+enBuyuk);
		
	}

}
