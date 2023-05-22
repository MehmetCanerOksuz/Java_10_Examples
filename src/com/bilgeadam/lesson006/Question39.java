package com.bilgeadam.lesson006;

import java.util.Scanner;

/*
 * uzunluğu 5 olan bir int dizisi tanımlayıp
 * dışarıdan aldığımız degerleri bu diziye atayalım
 * ve daha sonra bu dizin,n elemanlarını yazdıralım
 * 
 */

public class Question39 {
	
	public static void main(String[] args) {
		
		int [] myArray = new int[5];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("Lütfen dizinin " +i+ ". indexi için değer giriniz.");
			myArray[i] = scanner.nextInt();
			
		}
		System.out.println("--------yadırma----------");
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
	}

}
