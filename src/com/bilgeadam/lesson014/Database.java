package com.bilgeadam.lesson014;
/*
 * 
 * 
 * 
 */

public class Database {
	
	public static int kullaniciIndex;
	
	public static int index =0;
	
	public static Kullanici[] kullaniciListesi = new Kullanici[6]; 
	
	public static void defaultKullanicilar() {
		
		Kullanici kullanici1 = new Kullanici(index + 1,"caner","123","Caner");
		kullaniciListesi[index] = kullanici1;
		index++;
				
		Kullanici kullanici2 = new Kullanici(index + 1,"mehmet","123","Mehmet");
		kullaniciListesi[index] = kullanici2;
		index++;
			
		Kullanici kullanici3 = new Kullanici(index + 1,"asli","123","Asli");
		kullaniciListesi[index] = kullanici3;
		index++;
		
	}
	
	
	public static void kullaniciEkle(Kullanici kullanici) {
		
		if(kullaniciListesi[kullaniciListesi.length - 1] != null) {
			arrayBoyutArttırma();
		}
		kullaniciListesi[index] = kullanici;
		index++;
	}
	
	
	public static void arrayBoyutArttırma() {
		Kullanici [] temp = new Kullanici[kullaniciListesi.length +5];
		
		for (int i = 0; i < kullaniciListesi.length; i++) {
			temp[i] = kullaniciListesi[i];
		}
		
		kullaniciListesi = temp;
		
	}


	public static boolean kullaniciKontrol(String username, String sifre) {
		
		kullaniciIndex =0;
		for (int i = 0; i < kullaniciListesi.length; i++) {
			if(kullaniciListesi[i]!= null) {
				if(username.equals(kullaniciListesi[i].getUsername()) && sifre.equals(kullaniciListesi[i].getSifre())) {
					
					return true;
				}
			}
			kullaniciIndex++;
		}
		
		return false;
	}

}
