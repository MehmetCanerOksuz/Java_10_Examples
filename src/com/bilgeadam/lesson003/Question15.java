package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * Girilen sayının basamakları toplamını ekrana yazdıralım ve
 * kaç basamaklı olsuğunu yazdıralım
 * 
 */

public class Question15 {

	public static void main(String[] args) {

		int sayi, basamakDegeri, toplam=0, sayac=0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz.");

		sayi = scanner.nextInt();
		
		int i = 1;
		do {
			basamakDegeri = sayi % 10;
			toplam+=basamakDegeri;
			System.out.println(i + "'ler basamağı değeri = " + basamakDegeri);
			i *= 10;
			sayi /= 10;
			sayac++;
		} while (sayi > 0);
		System.out.println("toplam = " + toplam);
		System.out.println("basamak sayısı = " + sayac);
		
		toplam=0;
		sayac=0;
		System.out.println("Lütfen bir sayı giriniz.");
		sayi = scanner.nextInt();
		
		for(int j=1; sayi>0 ; j*=10) {
			basamakDegeri = sayi%10;
			toplam+=basamakDegeri;
			System.out.println(j + "'ler basamağı değeri = " + basamakDegeri);
			j*=10;
			sayi/=10;
			sayac++;
			
		}
		System.out.println("toplam = " + toplam);
		System.out.println("basamak sayısı = " + sayac);
	}

}
