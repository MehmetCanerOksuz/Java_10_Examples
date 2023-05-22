package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * 1 den girdiğimiz sayıya kadar olan sayıların toplamını ekrana yazdıran program
 * 
 */

public class Question10 {
	
	public static void main(String[] args) {
		
		int sayi,toplam =0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		sayi = scanner.nextInt();
		
		for(int i=1; i<=sayi;i++) {
			
			toplam+=i;
		}
		System.out.println("toplam for = " + toplam);
		
		toplam = 0;
		int i =1;
		while (i<=sayi) {
			
			toplam+=i;
			i++;
			
		}
		System.out.println("toplam while = " + toplam);
		
	}

}
