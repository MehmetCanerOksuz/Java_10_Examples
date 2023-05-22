package com.bilgeadam.lesson004;
/*
 * 
 * Dışarıdan girilen bir sayının asal olup olmadıgını bulalım.
 * 
 */

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen bir sayı giriniz.");
		int sayi = scanner.nextInt();
		
//		int i;
//		for (i = 1; i <= (sayi / 2); i++) {
//			if (sayi % i == 0) {
//				break;
//			}
//
//		}
		
//		if ( i > sayi/2) {
//			System.out.println("Asal sayıdır.");
//		}else {
//			System.out.println("asal sayı değildir.");
		
		int sayac=0;
		
		for(int i = 2; i <=(sayi/2) ; i++) {
			
			if (sayi % i ==0) {
				sayac++;
				break;
			}
		}
		
		if (sayac ==0 && sayi >=2) {
			System.out.println("Sayı asaldır.");
		}else {
			System.out.println("Sayı asal değildir.");
		}

	}

}
