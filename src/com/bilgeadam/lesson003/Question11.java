package com.bilgeadam.lesson003;
/*
 * 1 den girdiğimiz sayıya kadar olan çift sayıların toplamı
 * 
 */

import java.util.Scanner;

public class Question11 {
	
	public static void main(String[] args) {
		
		int sayi, ciftToplam=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz.");
		
		sayi=scanner.nextInt();
		
		for(int i=2; i<=sayi; i+=2) {
			
			ciftToplam +=i;
		}
		System.out.println(ciftToplam);
		
		ciftToplam =0;
		
		for(int i=2; i<=sayi; i++) {
			
			ciftToplam= ciftToplam+(i%2==0? i:0); 
		}
		System.out.println(ciftToplam);
		
	}

}
