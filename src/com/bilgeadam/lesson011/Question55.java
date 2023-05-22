package com.bilgeadam.lesson011;

/*
 * Bir dizide 13 var ise ve 13 ve bir sonraki eleman toplama eklenmeden toplama eklenmeden
 * toplama sonucu bulan kod
 * 
 */

public class Question55 {

	public static void main(String[] args) {

		int[] sayilar = { 1, 13, 13, 5, 1 };
		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {

			if (sayilar[i] != 13) {
				if (i != 0) {
					if (sayilar[i - 1] != 13) {
						toplam += sayilar[i];
					}

				} else {
					toplam += sayilar[i];
				}
			}
		}

		System.out.println(toplam);

		toplamBul(sayilar);
		toplamBul2(sayilar);
	}

	public static void toplamBul(int[] sayilar) {

		int toplam = 0;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == 13) {
				if (i + 1 < sayilar.length && sayilar[i + 1] != 13) {
					i++;
				}
			} else {
				toplam += sayilar[i];
			}
		}

		System.out.println(toplam);
	}
	
	public static void toplamBul2(int [] sayilar) {
		int toplam =0;
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i]==13 || (i>1 && sayilar[i-1]==13)) {
				continue;
			}else {
				toplam+=sayilar[i];
			}
		}
		System.out.println(toplam);
	}

}
