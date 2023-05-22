package com.bilgeadam.lesson004;
/*
 * 
 * Soru2-) a dan z ye kadar alfabeyi yazdıralım ; ( dongu kullanarak)
 */

public class Question17 {
	public static void main(String[] args) {

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
			
			char karakter = 97;
			
			while (karakter >= 97 && karakter <= 122) {
				System.out.print(karakter + " ");
				karakter++;
			}

		}
	}

}
