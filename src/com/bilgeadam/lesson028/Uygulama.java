package com.bilgeadam.lesson028;

import java.io.File;

public class Uygulama {

	public static void main(String[] args) {
		OgrenciFileIslemler ogrenciFileIslemler = new OgrenciFileIslemler();
		//baslangicListesiOlusturma(ogrenciFileIslemler);   // Sıfırlama metodu
		ogrenciFileIslemler.dosyadanVerileriListeyeEkleme(FileSabitler.OGRENCI_LIST_FILE_COPY);
		listedenOgrenciSecme(ogrenciFileIslemler);

	
	}
	
	public static void baslangicListesiOlusturma(OgrenciFileIslemler ogrenciFileIslemler) {
				
		ogrenciFileIslemler.dosyadanVerileriListeyeEkleme(FileSabitler.OGRENCI_LIST_FILE);
		//ogrenciFileIslemler.ogrenciList.forEach(System.out::println);
		ogrenciFileIslemler.dosyayaListeyiYazdırma(FileSabitler.OGRENCI_LIST_FILE_COPY);
	}
	
	public static void listedenOgrenciSecme(OgrenciFileIslemler ogrenciFileIslemler) {
		
		if(ogrenciFileIslemler.ogrenciList.isEmpty()) {
			System.out.println("Seçilecek öğrenci kalmadı");
			baslangicListesiOlusturma(ogrenciFileIslemler);
			File file = new File(FileSabitler.ALINAN_OGRENCI);
			file.delete();
		}else {
			int index = ogrenciFileIslemler.ogrenciSec();
			ogrenciFileIslemler.secilenOgrenciyiDosyayaYazdir(FileSabitler.ALINAN_OGRENCI, index);
			ogrenciFileIslemler.ogrenciList.remove(index);
			ogrenciFileIslemler.dosyayaListeyiYazdırma(FileSabitler.OGRENCI_LIST_FILE_COPY);
		}
		

	}
}
