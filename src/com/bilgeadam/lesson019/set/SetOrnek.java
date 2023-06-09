package com.bilgeadam.lesson019.set;
/*
 * bir set olusturalım bu sete film kategorisi ekleyeceğiz
 * katagori ekle diye bir metot yazıp dışarıdan veri alacağız ve 
 * sete e ekleyeceğiz eğer
 * kategori daha önce eklenmişse bu kategori daha önce eklenmistir çıktısı versin..
 * 
 * eklenmemiş ise kategori başarı ile eklenmiştir..
 * 
 * 
 */

import java.util.HashSet;
import java.util.Set;

public class SetOrnek {

	Set<String> kategoriler = new HashSet<>();
	
	public static void main(String[] args) {
		
		SetOrnek setOrnek = new SetOrnek();
		
		setOrnek.kategoriEkle("Drama");
		setOrnek.kategoriEkle("Anime");
		setOrnek.kategoriEkle("Komedi");
		setOrnek.kategoriEkle("Gerilim");
		setOrnek.kategoriEkle("Gerilim");
		

		
		
		
		for (String string : setOrnek.kategoriler) {
			System.out.println(string);
		}
		
	}
	
	public void kategoriEkle(String kategori) {
		if(!kategoriler.add(kategori)) {
			System.out.println("bu kategori daha önce eklenmistir");
		}else {
			System.out.println(kategori + " başarı ile eklenmiştir..");
		}
	}
}

