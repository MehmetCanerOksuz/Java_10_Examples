package com.bilgeadam.lesson014;

import java.util.Scanner;

/*
 * 1 - Kullanıcı sınıfımız olacak
 * -kullanıcılarımız username ve şifre ile uygulamayaca giriş yapsın. ıd si olsun
 * -daha sonra sepetlerine ürün ekleyebilsinler
 * 2 - Kullanıcılarımızı databasede tutalım
 * -databasede başlangıçta 3 tane default kullanıcı olsun
 * -uygulama içinde kayıt ol seçeneği ile burdaki databaseimize kullanıcı ekleyelim.
 * 3 - sepet --> sepetimizde eklediğimiz ürünleri tutan bir yapı olsun
 * her kullanıcı kedni seperine urun ekleyebilecek
 * 4- urunlermizde enum yapalım
 *CIPS, KOLA, SEKER, YAG, UN, EKMEK, ÇAY, YUMURTA, YOGURT, SUT
 *
 * 
 */

public class Uygulama {
	
	int kullaniciIndex = Database.kullaniciIndex;

	Scanner scanner = new Scanner(System.in);

	public void kayitOl() {
		System.out.println("Lütfen username girişi yapınız.");
		String username = scanner.next();
		System.out.println("Lütfen sifre girişi yapınız.");
		String sifre = scanner.next();
		System.out.println("Lütfen isim girişi yapınız.");
		String isim = scanner.next();

		Kullanici kullanici = new Kullanici(Database.index +1, username, sifre, isim);
		Database.kullaniciEkle(kullanici);
		

	}

	public void girisYap() {
		System.out.println("Lütfen username girişi yapınız.");
		String username = scanner.next();
		System.out.println("Lütfen sifre girişi yapınız.");
		String sifre = scanner.next();

		if (Database.kullaniciKontrol(username, sifre)) {
			System.out.println("Giriş yapıldı.");
			
			String secim;
			do {
				menu2();
				System.out.println("Lütfen seçiminizi yapınız.");
				secim = scanner.next();

				switch (secim) {
				case "1":
					alisveris();
					break;
				case "2":
					sepetGoster();
					break;
				case "3":
					System.out.println("Çıkış Yapıldı...!!");
					break;

				default:
					System.out.println("Lütfen 1 ile 3 arasında bir değer giriniz.");
					break;
				}

			} while (!secim.equals("3"));
			
			
		} else {
			System.out.println("Geçersiz şifre veya username");
		}
	}

	public void menu() {

		System.out.println("1-Kayıt Ol");
		System.out.println("2-Giriş Yap");
		System.out.println("3-Çıkış");
	}

	public void uygumalaGiris() {
		Database.defaultKullanicilar();
		
		String secim;
		do {
			menu();
			System.out.println("Lütfen seçiminizi yapınız.");
			secim = scanner.next();

			switch (secim) {
			case "1":
				kayitOl();
				break;
			case "2":
				girisYap();
				break;
			case "3":
				System.out.println("Çıkış Yapıldı...!!");
				break;

			default:
				System.out.println("Lütfen 1 ile 3 arasında bir değer giriniz.");
				break;
			}

		} while (!secim.equals("3"));

	}
	
	public void menu2() {
		System.out.println("1-Alışveriş yap");
		System.out.println("2-Sepeti görüntüle");
		System.out.println("3-Çıkış");
	}
	
	public void alisveris() {
		String secim;
		int index=0;
		do {
			urunListesi();
			System.out.println("Lütfen sepetinize eklemek istediğiniz ürünü seçiniz.");
			secim = scanner.next();

			switch (secim) {
			case "1":
				Database.kullaniciListesi[kullaniciIndex].getSepet().getUrunler()[index]=EUrun.CIPS;
				index++;
				System.out.println("ürün sepetinize eklendi.");
				break;
			case "2":
				Database.kullaniciListesi[kullaniciIndex].getSepet().getUrunler()[index]=EUrun.KOLA;
				index++;
				System.out.println("ürün sepetinize eklendi.");
				break;
			case "3":
				Database.kullaniciListesi[kullaniciIndex].getSepet().getUrunler()[index]=EUrun.SEKER;
				index++;
				System.out.println("ürün sepetinize eklendi.");
				break;
			case "4":
				Database.kullaniciListesi[kullaniciIndex].getSepet().getUrunler()[index]=EUrun.YAG;
				index++;
				System.out.println("ürün sepetinize eklendi.");
				break;
			case "5":
				Database.kullaniciListesi[kullaniciIndex].getSepet().getUrunler()[index]=EUrun.UN;
				index++;
				System.out.println("ürün sepetinize eklendi.");
				break;
			case "6":
				Database.kullaniciListesi[kullaniciIndex].getSepet().getUrunler()[index]=EUrun.EKMEK;
				index++;
				System.out.println("ürün sepetinize eklendi.");
				break;
			case "7":
				Database.kullaniciListesi[kullaniciIndex].getSepet().getUrunler()[index]=EUrun.ÇAY;
				index++;
				System.out.println("ürün sepetinize eklendi.");
				break;
			case "8":
				Database.kullaniciListesi[kullaniciIndex].getSepet().getUrunler()[index]=EUrun.YUMURTA;
				index++;
				System.out.println("ürün sepetinize eklendi.");
				break;
			case "9":
				Database.kullaniciListesi[kullaniciIndex].getSepet().getUrunler()[index]=EUrun.YOGURT;
				index++;
				System.out.println("ürün sepetinize eklendi.");
				break;
			case "10":
				Database.kullaniciListesi[kullaniciIndex].getSepet().getUrunler()[index]=EUrun.SUT;
				index++;
				System.out.println("ürün sepetinize eklendi.");
				break;
			case "11":
				System.out.println("Alışverişten çıkılıyor..!");
				break;

			default:
				System.out.println("Lütfen 1 ile 11 arasında bir değer giriniz.");
				break;
			}

		} while (!secim.equals("11"));
		
	}
	
	public void sepetGoster() {
		
		System.out.println("Sepetinizdeki ürünler ===>>>>>>>>");
		int sayac=1;
		for (EUrun urun : Database.kullaniciListesi[kullaniciIndex].getSepet().getUrunler()) {
			if(urun !=null) {
				System.out.println(sayac +"-"+ urun.name());
				sayac++;
			}
		}
		
		System.out.println("---------------------------------------");
	}
	
	
	public void urunListesi() {
		int sayac=1;
		EUrun[] urunler = EUrun.values();
		for (int i = 0; i < urunler.length; i++) {
			System.out.println(sayac + "-" + urunler[i]);
			sayac++;
		}
		System.out.println("11- Çıkış");
		
	}

}
