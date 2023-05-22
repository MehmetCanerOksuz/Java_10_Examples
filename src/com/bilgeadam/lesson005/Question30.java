package com.bilgeadam.lesson005;

import java.util.Scanner;

/*
 * 
 * klavyeden 0 ile 100 arası 
 * 5 adet sayıdan en büyük ve en küçük olanı bulup ekrana yazdıralım.
 */

public class Question30 {
	
	public static void main(String[] args) {
		
		int buyuk=Integer.MIN_VALUE , kucuk=Integer.MAX_VALUE, sayi;
		Scanner scanner = new Scanner(System.in);
		
		
		for (int i =0 ; i<5 ; i++) {
			System.out.println("Lütfen" + (i+1) + ". sayıyı giriniz");
			sayi = scanner.nextInt();
			if (sayi <= 100 && sayi>=0) {
				
				if( sayi> buyuk) {
					buyuk = sayi;
				}
				if( sayi< kucuk) {
					kucuk = sayi;
				}
				
			}else {
				i--;
				System.out.println("Lütfen");
			}
		}
		System.out.println("Büyük = " + buyuk);
		System.out.println("Küçük = " + kucuk);
		
		
	}

}
