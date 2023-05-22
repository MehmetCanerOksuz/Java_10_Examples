package com.bilgeadam.lesson007;
/*
 * 
 * 1 metot yazalım dışarıdan bir ülke ismi alalım
 * bu ülke dizimizde geçiyorsa onu kontrol edelim
 * ve geçiyorsa console a girdiğiniz ülke bulundu yazalım.
 */

import java.util.Scanner;

public class Question41 {
	
	public static void main(String[] args) {
		
		String[] dizi = { "Türkiye", "Moğolistan", "Japonya", "Fransa", "Danimarka"};
		
		
		ulkeArama2(dizi);
	}
	
	public static void ulkeArama(String[] dizi) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen ülke ismi giriniz");
		String ulke = scanner.nextLine();
		boolean kontrol = false;
		for (int i = 0; i < dizi.length; i++) {
			if(ulke.equals(dizi[i])) {
				kontrol = true;
				break;
			}
			
		}
		if (kontrol) {
			System.out.println(ulke + " Ülke bulundu.");
		}else {
			System.out.println(ulke + " Ülke bulunmadı!!");
		}
		
	}
	
	public static void ulkeArama2(String[] dizi) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen ülke ismi giriniz");
		String ulke = scanner.nextLine();
		String result = ulke + " Ülke Bulunamadı!!!!!";
		boolean kontrol = false;
		for (int i = 0; i < dizi.length; i++) {
			if(ulke.equals(dizi[i])) {
				result = ulke + " ==> Ülke Bulundu";
				break;
			}
		}
		System.out.println(result);
		
		
	}

}
