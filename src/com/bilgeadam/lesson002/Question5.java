package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * 
 * @author Caner
 * Dışarıdan veri alma ilgili örnekler
 * 
 * Scanner
 * 
 */

public class Question5 {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir isim giriniz");
		String isim = input.nextLine();
		
		System.out.println("isim = " + isim);
		
		int sayi1 = 10;
		System.out.println("Lütfen bir sayi giriniz.");
		int sayi2 = input.nextInt();
		
		// double sayi3 = input.nextDouble();
		// long sayi4 = input.nextLong();
		// float sayi5 = input.nextFloat();
		
		System.out.println("sonuc = " + (sayi1 + sayi2));
		
		
		// int ( sayısal) degerden sonra bir String deger almak istersek mutlaka bos bir
		// nextLine() kullanalım...
		
		input.nextLine();
		System.out.println("Lütfen bir isim giriniz");
		String isim2 = input.nextLine();
		
		System.out.println("isim2 = " + isim2);
		
	}

}
