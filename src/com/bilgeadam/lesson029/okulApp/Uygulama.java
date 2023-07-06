package com.bilgeadam.lesson029.okulApp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Ogrenci sınıfımızda ;
 * isim, not ortalaması, durumu = (geçti veya kaldı) , dogum tarihi
 * 
 * ogretmen sınıfımız olsun ;
 * isim, bir de motlarını okudugu ogrencileri tutsun
 * 
 * File Manager;
 * 1-) dosyadan verileri okuyalım ve bize bir ogrenci listesi donsun
 * gelen her degerden bir ogrenci yaratıp listeye ekleyeceğiz 
 * en sonunda da listeye geri döneceğiz
 *
 *2-) ogretmen dosyası olustur ==> ogretmen ismi ile bir dosya olusturup gelen
 *listeyi bir dosyaya yazdıralım
 *
 *3-) OgrencileriGetir diye metot yazalım.. dosyadan ogrencileri okuyup bir liste dönsün..
 * 
 */

public class Uygulama {
	
	public static void main(String[] args) {
		
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(FileManager.path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Ogretmen ogretmen = new Ogretmen("Caner", bufferedReader);
		Ogretmen ogretmen2 = new Ogretmen("Aslı",bufferedReader);
		
//		ogretmen.notlariOku();
//		ogretmen.getOgrenciList().forEach(System.out::println);
//		
//		ogretmen.dosyaOlustur();
//		System.out.println("=============================");
//		ogretmen.dosyadanOgrencileriGetir().forEach(System.out::println);
//		
//		
//		System.out.println("=============================");
//		List<Ogrenci> list = ogretmen.getOgrenciList().stream().map(x->{
//			x.setNotOrtalamasi(x.getNotOrtalamasi()+5);
//			x.durumBelirle(x.getNotOrtalamasi());
//			return x;
//		}).collect(Collectors.toList());
//		
//		ogretmen.setOgrenciList(list);
//		ogretmen.getOgrenciList().forEach(System.out::println);
//		System.out.println("=============================");
//		ogretmen.dosyaOlustur();
//		ogretmen.dosyadanOgrencileriGetir().forEach(System.out::println);
//		
//		System.out.println("=============================");
		
		ogretmen.start();
		ogretmen2.start();
		
		try {
			//ogretmen.join();             //ogremen için main i beklettik diğer işlemleri yaptı..
			ogretmen2.join();            // ogretmen2 için main i beklettik.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(ogretmen.getIsim() + "==>>" + ogretmen.getOgrenciList().size());
		System.out.println(ogretmen2.getIsim() + "==>>" + ogretmen2.getOgrenciList().size());
		
		System.out.println(ogretmen.getIsim() + "==>>" +ogretmen.getOgrenciList());
		System.out.println(ogretmen2.getIsim() + "==>>" +ogretmen2.getOgrenciList());
		
		ogretmen.dosyaOlustur();
		ogretmen2.dosyaOlustur();
	}

}
