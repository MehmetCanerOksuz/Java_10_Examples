package com.bilgeadam.lesson020;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("06", "Ankara");
		map.put("05", "Amasya");
		map.put("06", "ankara");        // üstüne yazıyor.. ondan dolayı en son olan gelir..
		map.put("08", "Artvin");
		
		System.out.println(map.get("06"));
		map.replace("05", "AMASYA");         // DEĞİŞTİRMEK İÇİNN..

		System.out.println(map.containsKey("10"));   // key 2 sahip mi??
		System.out.println(map.containsKey("05"));
		System.out.println(map.containsValue("Artvin"));  // value ye sahip mi ??
		System.out.println(map.containsValue("Bolu"));
		
		for(Entry<String, String> value : map.entrySet()) {
			System.out.println(value.getKey() + "-" + value.getValue());
		}
		
		System.out.println("KEYSET İLE ========");
		for (String anahtar : map.keySet()) {
			System.out.println(anahtar + "-" + map.get(anahtar));
		}
		
		Collection<String> iller = map.values();
		
		for (String string : iller) {
			System.out.println(string);
		}
		
		map.forEach( (k,v) -> System.out.println(k+"==>>" + v));
		
		
		List<String> list = new ArrayList<>(List.of("Java", "react", "Spring"));
		
		list.forEach(x -> System.out.println("-" + x + "-"));
		
	
		deneme("asd");
		deneme(1);
	}
	
	public static  <T> void deneme(T ifade) {
		System.out.println(ifade);
	}
}
