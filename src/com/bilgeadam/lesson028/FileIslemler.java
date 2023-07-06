package com.bilgeadam.lesson028;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIslemler {

	/*
	 * Sabitlerimizi tuttuğumuz bir sınıfımız olsun menudeki her bir işlem için bir
	 * metot yazalım System.out.println("1-Dosya yarat");
	 * System.out.println("2-Dosya sil");
	 * System.out.println("3- Dosyaya veri ekle");
	 * System.out.println("4-Dosya dan veri oku");
	 * System.out.println("5-Dosya da ki bir harfi değistir");
	 * 
	 * 
	 * 1- eger dosya daha önce yaratılmamışsa dosya ismi ile beraber basarılı bir
	 * şekilde olusturulduğu çıktısını verelim eger önce olusturukmussa bu dosya
	 * daha önce olusturulmuştur çıktısı verelim..
	 * 
	 * 4- dosyadan okuduğumuz veriyi bir stringte tutalım ve bu stringi geri
	 * dönelim.. 5- bir harf belirleyeceğiz bu harf dosyamızda varsa ikinci
	 * belirlediğimiz harf ile değiştireceğiz. dosyada da verinin değişmesini
	 * sağlayacağız..
	 */

	File file = new File(FileSabitler.PATH);

	BufferedReader bufferedReader;

	public void menu() {
		System.out.println("DOSYA İŞLEMLERİ");
		System.out.println("1-Dosya yarat");
		System.out.println("2-Dosya sil");
		System.out.println("3- Dosyaya veri ekle");
		System.out.println("4-Dosya dan veri oku");
		System.out.println("5-Dosya da ki bir harfi değistir");
		System.out.println("0- Çıkış");
	}

	public void uygulama() {
		int secim = 0;
		do {

			menu();
			secim = Utility.intDegerAlma("Lütfen bir işlem secini");
			switch (secim) {
			case 1:
				dosyaYarat();
				break;
			case 2:
				dosyaSil();
				break;
			case 3:
				dosyayaVeriEkle();
				break;
			case 4:
				dosyadanVeriOku();
				break;
			case 5:
				dosyadakiBirHarfiDegistir();
				break;
			case 0:
				System.out.println("Çıkış yapılıyor...");
				break;

			default:
				System.out.println("Lütfen geçerli bir işlem seçiniz..");
			}

		} while (secim != 0);
	}

	public void dosyaYarat() {

		try {

			if (file.createNewFile()) {
				System.out.println(file.getName() + " başarılı bir şekilde oluşturuldu.");
			} else {
				System.out.println(file.getName() + " dosyası daha önce oluşturulmuştur..");
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void dosyaSil() {

		if (file.delete()) {
			System.out.println(file.getName() + " başarılı bir şekilde silinmiştir.");
		} else {
			System.out.println(file.getName() + " isimli dosyası bulunamamıştır!!!..");
		}
	}

	public void dosyayaVeriEkle() {

		String veri = Utility.stringDegerAlma("Lütfen eklemek istediğinizi yazınız..");

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {

			System.out.println(file.length());
			if (file.length() != 0) {
				veri = "\n" + veri;
			}
			bufferedWriter.write(veri);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String dosyadanVeriOku() {

		String veri = "";
		String deger;

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

			while ((deger = bufferedReader.readLine()) != null) {
				if(veri.equals("")) {
					veri += deger;
				}else {
					veri += deger +"\n";
				}
			}
			
			System.out.println(veri);
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return veri;
	}

	public void dosyadakiBirHarfiDegistir() {

		String eskiHarf = Utility.stringDegerAlma("Lütfen eski harfi giriniz");
		String yeniHarf = Utility.stringDegerAlma("Lütfen yeni harfi giriniz");
		String veri = dosyadanVeriOku();
		veri=veri.replace(eskiHarf, yeniHarf);

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {

			bufferedWriter.write(veri);

			System.out.println(veri);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
