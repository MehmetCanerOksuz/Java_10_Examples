package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
 * Mükemmel sayi, dışardıdan girilen sayı mükkemel sayı mı?
 * 
 * kendisi hariç tam bölenlerinin toplamı kendisine eşit olan..
 * 
 */

public class Question29 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz.");
		int sayi = scanner.nextInt();
		int toplam=0;
		
		for(int i=1 ; i<=(sayi/2) ; i++) {
			if(sayi%i==0) {
				toplam+=i;
			}
		}
		if(toplam == sayi) {
			System.out.println(sayi + " Mükemmel sayıdır.");
		}else {
			System.out.println(sayi + " Mükemmel sayı değildir!!");
		}
		
		
		
	}

}
