package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * Soru1-) Dışarıdan taban değeri birde üs değeri alacağız.
 * (2 üzeri 5 gibi) bu işlemin sonucunu bulan algoritma (döngü ile)
 * 
 */

public class Question16 {
	
	public static void main(String[] args) {
		
		int sayi,üssü,sonuc=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen önce bir sayı sonra üssünü giriniz.");
		sayi=scanner.nextInt();
		üssü=scanner.nextInt();
		
		for(int i =0; i<üssü; i++) {
			sonuc*=sayi;
		}
		System.out.println(sayi+"^"+üssü+" = "+ sonuc );
		
		
		
	}

}
