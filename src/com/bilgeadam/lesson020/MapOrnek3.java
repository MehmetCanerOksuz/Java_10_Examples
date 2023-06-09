package com.bilgeadam.lesson020;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * dışarıdan bir kelime gireceğiz
 * merhaba
 * her bir harfin frekansını bulacağız ve bir map yapısı içinde tutacağız.
 * 
 * merhaba
 * 
 * m=1
 * e=1
 * r=1
 * h=1
 * a=2
 * b=1
 * 
 * 
 * 
 */
public class MapOrnek3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Map<Character, Integer> map = new TreeMap();
		System.out.println("Kelimeyi giriniz..");
		String kelime =scanner.nextLine();
		for (int i = 0; i < kelime.length(); i++) {
			if(!map.containsKey(kelime.charAt(i))) {
				map.put(kelime.charAt(i), 1);
			}else {
				map.replace(kelime.charAt(i), map.get(kelime.charAt(i))+1);
			}
			
		}
		map.forEach( (k,v) -> System.out.println(k+"==>>" + v));
		
	}
	

}
