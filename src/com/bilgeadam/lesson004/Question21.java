package com.bilgeadam.lesson004;

import java.util.Scanner;

/**
 *   telefon kod mail kod başlangıc değerlerini biz kendimiz atayacağız (int)  
 * daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için koda
 * alacağız 
 * ikiside doğru ise sisteme kayıt oldunuz, her ihtimali..
 */

public class Question21 {
	
	public static void main(String[] args) {
		
		int tel = 543, mail = 286;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen telefon kodunu giriniz");
		int telKod = scanner.nextInt();
		System.out.println("Lütfen mail kodunu giriniz");
		int mailKod = scanner.nextInt();

		if (tel == telKod && mail == mailKod) {
			System.out.println("Sisteme kayıt oldunuz.");
		} else if (tel != telKod && mail == mailKod) {
			System.out.println("Telefon kodu hatalıdır.");
		} else if (tel == telKod && mail != mailKod) {
			System.out.println("Mail kodu hatalıdır.");
		} else {
			System.out.println("Telefon ve mail kodu hatalıdır.");
		}
	}

}
