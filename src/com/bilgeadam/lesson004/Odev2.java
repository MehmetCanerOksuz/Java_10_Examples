package com.bilgeadam.lesson004;

import java.util.Scanner;

//Girilen sayının 5 in kuvveti olup olmadığını bulan kod.

public class Odev2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = scanner.nextInt();
		
		if(sayi % 5 ==0) {
			
			while(sayi % 5==0) {
				sayi/=5;
			}
			
			if(sayi ==1) {
				System.out.println("5'in kuvvetidir.");
			}else {
				System.out.println("5'in kuvveti değildir.");
			}
		} else {
			System.out.println("5'in kuvveti değildir.");
		}
		
		
	}

}
