package com.bilgeadam.lesson021;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SansliNumaralar {
	
	public static void main(String[] args) {
		Random random = new Random();
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList();
		
		for (int i = 0; i < 10000; i++) {
			int sayi = random.nextInt(1,101);
			if(!map.containsKey(sayi)) {
				map.put(sayi, 1);
			}else {
				map.replace(sayi, map.get(sayi)+1);
			}
		}
		
		map.forEach((k,v) -> System.out.println(k + "==>>" + v));
		
		
		for (int key : map.keySet()) {
			for (int i = 0; i < map.get(key); i++) {
				list.add(key);
			}
		}
		
		System.out.println(list.size());
		
		Collections.shuffle(list);
		
		Set<Integer>onSayi = new LinkedHashSet();
		
		while(onSayi.size()<10) {
			onSayi.add(list.get(random.nextInt(10000)));
		}
		
		System.out.println(onSayi);
		
	}


}
