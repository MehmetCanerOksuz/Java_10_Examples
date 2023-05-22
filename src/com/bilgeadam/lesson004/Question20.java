package com.bilgeadam.lesson004;

import java.util.Scanner;

/**
 *   telefon kod mail kod başlangıc değerlerini biz kendimiz atayacağız (int)  
 * daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için koda
 * alacağız   eğer telefon kodu hatalı ise tel kodu hatalı çıktısı verelim  
 * eğer mail kodu hatalı ise mail kodu hatalı çıktısını verelim  
 */

public class Question20 {

	public static void main(String[] args) {

		int tel = 543, mail = 286;

		Scanner scanner = new Scanner(System.in);

		

		System.out.println("Lütfen telefon kodunu giriniz");
		int telKod = scanner.nextInt();

		if (tel != telKod) {
			System.out.println("Yanlış telefon kodu girdiniz.");
		}
		System.out.println("Lütfen mail kodunu giriniz");
		int mailKod = scanner.nextInt();

		if (mail != mailKod) {
			System.out.println("Yanlış mail kodu girdiniz.");
		}

	}

}
