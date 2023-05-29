package com.bilgeadam.lesson018;

import java.util.ArrayList;
import java.util.List;

/*
 * 1 tane liste olusturalım
 * 
 * Ankara
 * Bursa
 * Antalya
 * Artvin
 * Erzurum
 * Bursa
 * Karaman
 * 
 * an ile başlayan şehirleri silelim
 * 
 * 
 */

public class ArrayListOrnek {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Ankara");
		list.add("Antalya");
		list.add("Bursa");
		list.add("Antalya");
		list.add("Artvin");
		list.add("Erzurum");
		list.add("Bursa");
		list.add("Karaman");
		
		for (String sehir : list) {
			System.out.println(sehir);
		}
		
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).startsWith("An")) {
//				list.remove(i);
//				i--;                      // -1 yapmayınca kaydığı için bir sonrakini kontrol etmiyor..
//			}
//		}
//		
//		System.out.println("-----------------------");
		
		for (String sehir : list) {
			System.out.println(sehir);
		}
		
		System.out.println("-----------------------");
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).startsWith("An")) {
				list.set(i,"xxx");               
			}
		}
		System.out.println(list);
	}

}
