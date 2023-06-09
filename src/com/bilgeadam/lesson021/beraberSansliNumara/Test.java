package com.bilgeadam.lesson021.beraberSansliNumara;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		SansliNumara sansliNumara = new SansliNumara();
		sansliNumara.mapOlustur();
		sansliNumara.listeOlustur();
		sansliNumara.sanliNumaraBul();
		
		System.out.println("Liste uzunluğu == " +sansliNumara.list.size());
		System.out.println("Set uzunluğu = " + sansliNumara.set.size());
		System.out.println("Set ==>>" + sansliNumara.set);
		
		Set<Integer> numaralar = sansliNumara.set;
		
		/*
		 * integerdan string e topla -5-
		 * 
		 * 
		 */
		
		List<String> list1 = numaralar.stream().map(x-> "-"+x+"-").collect(Collectors.toList());
		
		list1.forEach(x -> System.out.println(x));
		
		//filter
	}

}
