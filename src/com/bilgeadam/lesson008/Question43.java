package com.bilgeadam.lesson008;

import java.util.Scanner;

/*
 * 1 metot yazalım menu diye
 * String işlemleri
 * 
 * 1- Harf saydırma  ==> dışarıdan string bir ifade ve hangi harfi
 * saydıracağımız sonucunda bize kaç kere geçtiğini dönsün eğer yoksa ifade de bulunamadı çıktısı..
 * 
 * 2- Harf değiştirme  ==>
 * 
 * 3- Palindrom
 * 4- Çıkış
 * 
 */

public class Question43 {

	public static void main(String[] args) {

		islem();

	}

	public static void menu() {
		System.out.println("=====STRİNG İŞLEMLERİ=====");
		System.out.println("1-Harf saydırma");
		System.out.println("2-Harf değiştirme");
		System.out.println("3-Palindrom");
		System.out.println("4-Çıkış");
		System.out.println("Lütfen menüden bir seçim yapınız.");

	}

	public static void islem() {
		Scanner scanner = new Scanner(System.in);
		int islem;
		do {
			menu();
			islem = scanner.nextInt();
			switch (islem) {
			case 1:
				System.out.println("1. işlem");
				harfSaydirma();
				break;
			case 2:
				System.out.println("2. işlem");
				harfDegistirme();
				break;
			case 3:
				System.out.println("3. işlem");
				palindrom();
				break;
			case 4:
				System.out.println("Çıkış yapılıyor...!!");
				break;

			default:
				break;
			}

		} while (islem != 4);

	}

	public static void harfSaydirma() {

		String ifade = stringDegerAl("Lütfen ifadeyi giriniz.");
		String harf = stringDegerAl("Lütfen sayılmasını istediğiniz harfi giriniz");
		char harfKarakter = harf.charAt(0);
		int sayac = 0;
		if (!ifade.contains(harf.substring(0, 1))) {
			System.out.println("Kelime harfi içermiyor.");
			return;
		}

		for (int i = 0; i < ifade.length(); i++) {
			char karakter = ifade.charAt(i);
			if (karakter == harfKarakter) {
				sayac++;
			}

		}

		System.out.println(ifade + "'de " + sayac + " kadar " + harf.substring(0, 1) + " harfi geçiyor");

	}

	public static void harfDegistirme() {

		String ifade = stringDegerAl("Lütfen ifadeyi giriniz.");
		String harf = stringDegerAl("Lütfen değiştireceğiniz harfi giriniz.");
		String harf2 = stringDegerAl("Lütfen yeni harfi giriniz.");

		ifade = ifade.replace(harf, harf2);
		System.out.println(ifade);

	}

	public static void palindrom() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("İfade giriniz");
		String ifade = scanner.nextLine();
		char kontrol1 = ' ';
		char kontrol2 = ' ';
		boolean a = true;
		for (int i = 0; i < ifade.length()/2; i++) {
			kontrol1 = ifade.charAt(i);
			kontrol2 = ifade.charAt(ifade.length() - 1 - i);
			if (kontrol1 != kontrol2) {
				System.out.println("Palindrom değildir");
				a = false;
				break;
			}
		}
		if (a == true) {
			System.out.println("Palindromdur");
		}

	}

	public static void cikis() {

	}

	public static String stringDegerAl(String sorgu) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(sorgu);
		String ifade = scanner.nextLine();
		return ifade;
	}

}
