package com.bilgeadam.lesson023.trycatch;

import java.util.Scanner;

/*
 * 
 * bolme islemi için metot yazalım , dışarıdan 1. ve 2. sayıyı alalım
 * 
 * bolme islemi sonucu bulmaya çalışalım  eğer hata var ise 2. sayıyı tekrar alalım..
 * 
 * 
 */

public class Test {
	
	
	
	public static void main(String[] args) {
		
		int sayi1 = 0;
		int sayi2 = 20;
		int sonuc = 0;
		
		try {
			System.out.println("deneme");
			sonuc = sayi2/sayi1;
			System.out.println("Başarılı kod");
		}catch (ArithmeticException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Hata yakalandı bir sayı 0 a bölünemez..");
		}catch(NullPointerException ex) {
			System.out.println("Null Pointer...");
			ex.printStackTrace();
		}catch(Exception e) {
			System.out.println("başka bir hata");
			e.printStackTrace();
		}

		System.out.println("sonuc : " + sonuc);
		
		
		bolme();
	}
	
	public static void bolme() {
		Scanner scanner = new Scanner(System.in);
		int sayac;
		do {
			sayac =0;
			System.out.println("Lütfen bölmek istediğiniz sayıyı giriniz.");
			int sayi1 = scanner.nextInt();
			System.out.println("Lütfen bölen i giriniz..");
			int sayi2 = scanner.nextInt();
			double sonuc =0;
			try {
				sonuc =sayi1/sayi2;
				System.out.println("Sonuc ==>>" + sonuc);
			}catch(Exception e){
				sayac =1;
				e.printStackTrace();
				System.out.println("Hata aldınız.. Lütfen geçerli bir işlem giriniz..");
			}
		}while(sayac==1);
	
	}

}
