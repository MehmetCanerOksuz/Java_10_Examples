package com.bilgeadam.lesson004;
/*
 * iki tane sayı değişkenimiz olsun
 * 
 * dışarıdan bir işlem sececeğiz ( toplama,bölme,çıkarma,çarpma ; (+,/,-,*) )
 * 
 * 
 */

import java.util.Scanner;

public class Question26 {
	public static void main(String[] args) {
		
		int sayi1=19, sayi2= 5;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen yapılacak işlemi giriniz. (+,/,-,*) ");
		String islem = scanner.nextLine();
		switch (islem) {
		case "+":
			System.out.println("Sonuc : " + (sayi1+sayi2));
			break;
		case "/":
			System.out.println("Sonuc : " + (double)(sayi1/sayi2));
			break;
		case "-":
			System.out.println("Sonuc : " + (sayi1-sayi2));
			break;
		case "*":
			System.out.println("Sonuc : " + (sayi1*sayi2));
			break;

		default:
			System.out.println("Yanlış işlem seçtiniz.");
			break;
		}
	}

}
