package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * Dışarıdan girilen bir sayının faktoriyelini hesaplayalım.
 * 
 */

public class Question13 {
	
	public static void main(String[] args) {
		
		int sayi, sonuc=1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz : ");
		
		sayi=scanner.nextInt();
		
		for(int i=sayi; i>=1; i--) {
			
			sonuc*=i;
			
		}
		System.out.println(sayi + "!"+ " = " + (sonuc));
	}

}
