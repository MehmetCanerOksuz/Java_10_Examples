package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * Soru3-) Klavyeden 0 girilinceye kadar sayı okumaya devam edeceğiz
 * 0 girildiğinde sayıların toplamını ve ortalamasını ekrana yazdıralım.
 * 
 */

public class Question18 {

	public static void main(String[] args) {

		int sayi = 1, toplam = 0, i = 0;
		double ortalama=0;

		Scanner scanner = new Scanner(System.in);

		for (i = 0; sayi != 0; i++) {
			sayi = scanner.nextInt();
			toplam += sayi;
		}
		ortalama =(double) toplam/(i-1);
		System.out.println("Toplam = " + toplam + "\tOrtalama = " + ortalama);
	}

}
