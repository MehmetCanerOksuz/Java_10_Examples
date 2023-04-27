package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * Dışarıdan vize ve final bilgisi girilsin
 * daha sonra ogrenci ismi girilsin
 * çıktı olarak eğer ortalama 60 üzerinde ise  Caner adlı öğrenci geçti,
 * altında ise kaldı çıktısını verelim
 * 
 * ortalama = vize%40, final %60
 * 
 * 
 */

public class Question8 {

	public static void main(String[] args) {
		
		int vize, finalNotu;
		double ortalama;
		String isim;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen vize notunuzu giriniz");
		vize = scanner.nextInt();
		
		System.out.println("Lütfen final notunuzu giriniz");
		finalNotu = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Lütfen isminizi giriniz");
		isim = scanner.nextLine();
		
		ortalama = vize*0.4 + finalNotu*0.6;
		System.out.println(ortalama);
		
		System.out.println(ortalama>=60 ? isim + " adlı öğrenci geçti." : isim + " adlı öğrenci kaldı.");
		
		

	}

}
