package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * Dışarıdan 2 tane sayı alıp toplayalım ve daha sonra
 * bu sayı çift ise ekrana true yazdıralım.
 * 
 */

public class Question7 {
	
	public static void main(String[] args) {
		
		int sayi1, sayi2, toplam;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Birinci sayıyı giriniz.");
		sayi1 = scanner.nextInt();
		
		System.out.println("İkinci sayıyı giriniz.");
		sayi2 = scanner.nextInt();
		
		toplam = sayi1+ sayi2;
		
		System.out.println("toplam = " + toplam );
		
		boolean kontrol = toplam%2==0;
		
		System.out.println(kontrol);
		System.out.println(toplam%2==0? "Çift" : "Tek");
		System.out.println(kontrol? "Çift" : "Tek");
	}

}
