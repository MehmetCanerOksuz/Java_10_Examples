package com.bilgeadam.lesson010;

import java.util.Scanner;

/*
 * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3'ün katı
* ise bilge 5'in ise adam hem3 ve hem 5 in katı ise bilgeadam yazdıralım int start=2; int
* end=22; çıktı [2,bilge,4,adam,bilge,7.......14,bilgeadam......bilge,22
 * 
 */

public class Question49 {
	
	public static void main(String[] args) {
		
		ucVeBesinKati();
		
	}
	
	public static void ucVeBesinKati() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen dizinin başlangıç degerini giriniz.");
		int start = scanner.nextInt();
		System.out.println("Lütfen dizinin bitiş degerini giriniz.");
		int end = scanner.nextInt();
		
		int diziElemanSayisi = end - start +1;
		String dizi[] = new String [diziElemanSayisi];
		
		for (int i = 0; i < dizi.length; i++) {
			String start1 = Integer.toString(start);
			dizi[i]=start1;
			start++;
		}
		
		
		
		for (int i = 0; i < dizi.length; i++) {
			int sayi = Integer.parseInt(dizi[i]);
			if(sayi%15==0) {
				dizi[i]="bilgeadam";
			}else if(sayi%5==0) {
				dizi[i] = "adam";
			}else if (sayi%3==0) {
				dizi[i] ="bilge";
			}
		}
		
		System.out.print("[");
		for (String deger : dizi) {
			System.out.print(deger + ",");
		}
		System.out.println("]");
	}
	

}
