package com.bilgeadam.lesson020;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
/*
 * isim ve notlar2 yi map yapısında tutalım
 * 
 */
public class MapOrnek2 {
	
	public static void main(String[] args) {
		
		String[] ogrenci = {"Mustafa", "Ece", "Elif"};
		int[]notlar = {60, 80, 75 } ;
		
		int[][] notlar2 = { {50,50,50}, {80,90,80},{70,50,86} };
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		for (int i = 0; i < notlar.length; i++) {
			map.put(ogrenci[i], notlar[i]);
		}
		
		map.forEach( (k,v) -> System.out.println(k+"==>>" + v));
		
		Map<String, int[]> map2 = new LinkedHashMap<>();
		
		for (int i = 0; i < notlar2.length; i++) {
			map2.put(ogrenci[i], notlar2[i]);
			}
		
		for (Entry<String, int[]> deger : map2.entrySet()) {
			System.out.println(deger.getKey() + " notları ==>>");
			int toplam =0;
			for (int not : deger.getValue()) {
				System.out.println(not);
				toplam+=not;
			}
			System.out.println("ortalama == " + (toplam / deger.getValue().length));
			System.out.println("===================");
		}
		
	}

}
