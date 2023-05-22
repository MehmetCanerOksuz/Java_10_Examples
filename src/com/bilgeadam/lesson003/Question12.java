package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * Kullanıcıdan alınan bir sayının çarpım tablosunu yazdıralım ( 10 a kadar)
 * 
 */

public class Question12 {
	
	public static void main(String[] args) {
		
		int sayi;
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		
		sayi=scanner.nextInt();
		System.out.println("Çarpım tablosu");
		for(int i=1; i<=10; i++) {
			

			System.out.println(sayi+"x"+i+"= " +(sayi*i));
		}
		
	}

}
