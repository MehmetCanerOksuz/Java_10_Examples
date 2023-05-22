package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Question30_doWhileDeneme {

	public static void main(String[] args) {

		int buyuk = -1, kucuk = 101, sayac = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Lütfen " + (sayac + 1) + ". değeri giriniz");
			int sayi = scanner.nextInt();
			if (sayi > 100 || sayi < 0) {
				System.out.println("Lütfen 101 den küçük pozitif tam sayı giriniz.");
			} else {
				sayac++;
				if (sayi > buyuk) {
					buyuk = sayi;
					
				}
				if (sayi < kucuk) {
					kucuk = sayi;
				
				}
			}

		} while (sayac < 4);
		System.out.println(buyuk + "  " + kucuk);
	}

}
