package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * 
 * Soru1-) Dışarıdan taban değeri birde üs değeri alacağız.
 * (2 üzeri 5 gibi) bu işlemin sonucunu bulan algoritma (döngü ile)
 * 
 * Soru2-) a dan z ye kadar alfabeyi yazdıralım ; ( dongu kullanarak)
 * 
 * Soru3-) Klavyeden 0 girilinceye kadar sayı okumaya devam edeceğiz
 * 0 girildiğinde sayıların toplamını ve ortalamasını ekrana yazdıralım.
 * 
 * Soru4-)  1 den 100 e kadar çift sayıların toplamının tek sayıların toplamına oranı..
 * 
 * Wrapper class nedir
 * heap bellek ve stack bellek arasındaki fark
 * referans tur nedir?
 * 
 */

public class Odev1 {

	public static void main(String[] args) {
		
		System.out.println("------------ÖDEV1-----------------");
		int sayi,üssü,sonuc=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen önce bir sayı sonra üssünü giriniz.");
		sayi=scanner.nextInt();
		üssü=scanner.nextInt();
		
		for(int i =0; i<üssü; i++) {
			sonuc*=sayi;
		}
		System.out.println(sayi+"^"+üssü+" = "+ sonuc );
		
		System.out.println("------------ÖDEV2-----------------");

		for(char i = 'A'; i<='Z';i++) {
			System.out.print(i);
		}
		
		System.out.println("\n------------ÖDEV3-----------------");
		
		int sayi2 = 1, toplam = 0, i = 0;
		
		for (i = 0; sayi2 != 0; i++) {
			sayi2 = scanner.nextInt();
			toplam += sayi2;
		}
		System.out.println("Toplam = " + toplam + "\tOrtalama = " + (toplam / (i-1)));
		
		System.out.println("\n------------ÖDEV4-----------------");
		
		double toplamTek=0,toplamCift=0;
		for(i=1; i<=100; i++) {
			
			if(i%2==0) {
				toplamCift+=i;
			}else {
				toplamTek+=i;
			}
		}
		System.out.println("toplamCift/toplamTek = " +(toplamCift/toplamTek));
		


	}

}
