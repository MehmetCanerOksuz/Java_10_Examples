package com.bilgeadam.lesson004;

import java.util.Scanner;

//Dışarıdan dogum gununuzun ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre

//burc hesabı yapan program

//Koç Burcu : 21 Mart - 20 Nisan

//Boğa Burcu : 21 Nisan - 21 Mayıs

//İkizler Burcu : 22 Mayıs - 22 Haziran

//Yengeç Burcu : 23 Haziran - 22 Temmuz

//Aslan Burcu : 23 Temmuz - 22 Ağustos

//Başak Burcu : 23 Ağustos - 22 Eylül

//Terazi Burcu : 23 Eylül - 22 Ekim

//Akrep Burcu : 23 Ekim - 21 Kasım

//Yay Burcu : 22 Kasım - 21 Aralık

//Oğlak Burcu : 22 Aralık - 21 Ocak

//Kova Burcu : 22 Ocak - 19 Şubat

//Balık Burcu : 20 Şubat - 20 Mart

//swicth case if else

// Girilen sayının 5 in kuvveti olup olmadığını bulan kod.

public class Odev {
	
	public static void main(String[] args) {
		
		int gün,ay;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen doğum gününüzün gününü giriniz.");
		gün =scanner.nextInt();
		while(gün>31 || gün <1) {
			System.out.println("Lütfen 1 ile 31 arasında değer giriniz.");
			gün =scanner.nextInt();
		}
		System.out.println("Lütfen doğum gününüzün ayını giriniz.");
		ay = scanner.nextInt();
		while(ay>12 || ay<1) {
			System.out.println("Lütfen 1 ile 12 arasında değer giriniz.");
			ay = scanner.nextInt();
		}
		switch (ay) {
		case 1:
			if(gün<=21) {
				System.out.println("Burç = Oğlak");
			}else {
				System.out.println("Burç = Kova");
			}
			
			break;
		case 2:
			if(gün<=19) {
				System.out.println("Burç = Kova");
			}else {
				System.out.println("Burç = Balık");
			}
			
			break;
		case 3:
			if(gün<=20) {
				System.out.println("Burç = Balık");
			}else {
				System.out.println("Burç = Koç");
			}
			
			break;
		case 4:
			if(gün<=20) {
				System.out.println("Burç = Koç");
			}else {
				System.out.println("Burç = Boğa");
			}
			
			break;
		case 5:
			if(gün<=21) {
				System.out.println("Burç = Boğa");
			}else {
				System.out.println("Burç = İkizler");
			}
			
			break;
		case 6:
			if(gün<=22) {
				System.out.println("Burç = İkizler");
			}else {
				System.out.println("Burç = Yengeç");
			}
			
			break;
		case 7:
			if(gün<=22) {
				System.out.println("Burç = Yengeç");
			}else {
				System.out.println("Burç = Aslan");
			}
			
			break;
			
		case 8:
			if(gün<=22) {
				System.out.println("Burç = Aslan");
			}else {
				System.out.println("Burç = Başak");
			}
			
			break;
		case 9:
			if(gün<=22) {
				System.out.println("Burç = Başak");
			}else {
				System.out.println("Burç = Terazi");
			}
			
			break;
		case 10:
			if(gün<=22) {
				System.out.println("Burç = Terazi");
			}else {
				System.out.println("Burç = Akrep");
			}
			
			break;
		case 11:
			if(gün<=21) {
				System.out.println("Burç = Akrep");
			}else {
				System.out.println("Burç = Yay");
			}
			
			break;
		case 12:
			if(gün<=21) {
				System.out.println("Burç = Yay");
			}else {
				System.out.println("Burç = Oğlak");
			}
			
			break;

		default:
			System.out.println("Lütfen ay ve gün girerken dikkat ediniz.");
			break;
		}
	}

}
