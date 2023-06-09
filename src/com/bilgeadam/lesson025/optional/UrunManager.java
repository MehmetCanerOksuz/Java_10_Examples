package com.bilgeadam.lesson025.optional;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

/*
 * 
 * urunOlusturMetodu ==>> eger urun ismim bos ise veya fiyatım sıfırdan kucuk girilmiş ise
 * bos bir nesne donsun bunlar doğru  girilmiş ise ürün olusturabiliriz.
 * 
 */

public class UrunManager {
	
	Scanner scanner = new Scanner(System.in);
	
	public Optional<Urun> urunOlustur() {
		Urun urun =null;
		
		try {
			System.out.println("Urun adı giriniz");
			String ad = scanner.nextLine();
			System.out.println("Urun fiyatı giriniz");
			double fiyat = Double.parseDouble(scanner.nextLine());
			System.out.println("Urun son kullanma tarihi giriniz");
			LocalDate date = LocalDate.parse(scanner.nextLine());
			
			if (ad.isBlank() || fiyat <0) {
				return Optional.empty();
			}else {
				return Optional.of(new Urun(ad, fiyat, date));
			}
			
		}catch(Exception e){
			System.out.println(e.toString());
			return Optional.empty();
		}

		
	}
	
	public static void main(String[] args) {
		UrunManager urunManager = new UrunManager();
		Optional<Urun> urun =urunManager.urunOlustur();
		System.out.println(urun);
		Optional<Urun> urun2 = urun.filter(x->x.getFiyat() > 50);
		System.out.println(urun2);
		
		urunManager.urunOlustur().ifPresent(x-> System.out.println("isim ==>>" + x.getIsim()));
		
		urunManager.urunOlustur().ifPresentOrElse(x-> System.out.println("isim -->>" + x.getIsim()),
				()-> System.out.println("Urun yoktur.."));
		
		Urun urun3 = urunManager.urunOlustur().orElse(new Urun("xxxx", 1000, null));
		Urun urun4 = urunManager.urunOlustur().orElseThrow(()-> new RuntimeException("Hata Oluştu!!!"));
		
		Urun urun5 = urunManager.urunOlustur().orElseGet(() -> new Urun("xx", 500, null));
		
		Optional<Urun> urun6 = urunManager.urunOlustur();
		
		if (urun6.isPresent()) {
			
		}else {
			
		}
	}

}
