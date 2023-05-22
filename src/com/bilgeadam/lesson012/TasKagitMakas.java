package com.bilgeadam.lesson012;

import java.util.Random;
import java.util.Scanner;

/*
 * 
 * Cseneklerimiz enum olsun..
 * 
 * daha sonra bu secenekleri kullanıcıya sunup aralarından bir tanesini seçmesini isteyelim.
 * 
 * pc secimi ise random bir şekilde bu 3 seçenekten biri olsun.
 * daha sonra sectiğimiz ile pc secimini karşılaştırıp kazanıp kazanmadığını belirleyelim.
 */

public class TasKagitMakas {
	
	static ETasKagitMakas[] secenekler = ETasKagitMakas.values();
		
	
	
	public static ETasKagitMakas secimYap() {
		
		
		for (ETasKagitMakas secenek : secenekler) {
			System.out.println((secenek.ordinal()+1) + "-" + secenek);
		}
		
		
		
		// 1- TAS  2-KAGIT   3-MAKAS
		
		int secim = secimKontrol();
		return secenekler[secim-1];
	}

	public static int secimKontrol() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen TAS/KAĞIT/MAKAS verilerinden birini seçiniz.");
		int secim;
		
		while ((secim =scanner.nextInt()) <1 || secim>3) {
			System.out.println("yanlış bir secim yaptınız.. lütfen tekrar deneyiniz.");
			
		}
		
//		do {
//			System.out.println("Lütfen 1 ile 3 arası bir sayı giriniz");
//			secim = scanner.nextInt();
//		}while(secim<1 || secim>3);
		
		return secim;
	}
	
	public static ETasKagitMakas pcSecimiYap() {
		
		Random random = new Random();
		int index = random.nextInt(secenekler.length);
		
		return secenekler[index];
	}
	
	public static void oyun() {
		
		ETasKagitMakas secimim = secimYap();
		ETasKagitMakas pcSecim = pcSecimiYap();
		

		if(pcSecim == secimim) {
			System.out.println("Beraberlik");
		}else {
			switch (secimim) {
			case TAS:
				if(pcSecim == ETasKagitMakas.KAGIT) {
					System.out.println("Kaybettiniz");
				}else {
					System.out.println("Kazandınız.");
				}
				
				break;
			case KAGIT:
				if(pcSecim == ETasKagitMakas.MAKAS) {
					System.out.println("Kaybettiniz");
				}else {
					System.out.println("Kazandınız.");
				}
				
				break;
			case MAKAS:
				if(pcSecim == ETasKagitMakas.TAS) {
					System.out.println("Kaybettiniz");
				}else {
					System.out.println("Kazandınız.");
				}
				
				break;

			default:
				break;
			}
		}
		System.out.println(pcSecim);
		
		
	}

}
