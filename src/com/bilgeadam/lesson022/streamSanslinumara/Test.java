package com.bilgeadam.lesson022.streamSanslinumara;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		SansliNumara sansliNumara = new SansliNumara();
		sansliNumara.mapOlustur();
		sansliNumara.listeOlustur();
		sansliNumara.sanliNumaraBul();

		System.out.println("Liste uzunluğu == " + sansliNumara.list.size());
		System.out.println("Set uzunluğu = " + sansliNumara.set.size());
		System.out.println("Set ==>>" + sansliNumara.set);

		Set<Integer> numaralar = sansliNumara.set;

		/*
		 * integerdan string e topla -5-
		 * 
		 * 
		 */

		List<String> list1 = numaralar.stream().map(x -> "-" + x + "-").collect(Collectors.toList());

		list1.forEach(x -> System.out.println(x));

		// filter
		System.out.println("=======FİLTER======");

		for (Integer integer : numaralar) {
			if (integer > 50) {
				System.out.println(integer);
			}
		}
		System.out.println("=================");

		// her zaman true ya da false bir kosul yazılmalı
		numaralar.stream().filter(x -> x > 50).forEach(x -> System.out.println(x));

		// filterda çalıstıgım collections hangi turdeyse donen degerleri o turde bir
		// yapıda toplayabiliriz...

		List<Integer> liste3 = numaralar.stream().filter(x -> x > 80).collect(Collectors.toList());

		System.out.println("=================");

		numaralar.stream().filter(x -> {
			if (x % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}).forEach(System.out::println);

		System.out.println("=================");

		numaralar.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

		System.out.println("=================");
		/// 70 den kucuk olanları 2 ile çarpıp bir listede toplayalım..

		numaralar.stream().filter(x -> x < 70).forEach(x -> System.out.println(x));
		System.out.println("=================");
		List<Integer> liste4 = numaralar.stream().filter(x -> x < 70).map(x -> x * 2).collect(Collectors.toList());
		liste4.forEach(x -> System.out.println(x));

		int toplam1 = numaralar.stream().filter(x -> x * 2 < 70).mapToInt(x -> x).sum();
		int toplam2 = numaralar.stream().filter(x -> x * 2 < 70).mapToInt(Integer::intValue).sum();

		///// 2,5,10,8,5
		// 2+5=7
		// 7+10 =17
		// 17+8=25
		// 25+5=30
		int toplam3 = numaralar.stream().filter(x -> x * 2 < 70).reduce((a, b) -> a + b).get();

		int toplam4 = numaralar.stream().filter(x -> x * 2 < 70).reduce(0, (a, b) -> a + b);

		double bolum = numaralar.stream().filter(x -> x * 2 < 70).mapToDouble(X -> X).reduce((a, b) -> a / b)
				.getAsDouble();

		double ortalama = numaralar.stream().filter(x -> x * 2 < 70).mapToInt(x -> x).average().getAsDouble();
		int min = numaralar.stream().mapToInt(x -> x).min().getAsInt();
		int max = numaralar.stream().mapToInt(x -> x).max().getAsInt();

		int max2 = numaralar.stream().max(Integer::compareTo).get();
		int min2 = numaralar.stream().min(Integer::compareTo).get();

		System.out.println("Toplam 1 ====>>" + toplam1);
		System.out.println("Toplam 2 ====>>" + toplam2);
		System.out.println("Toplam 3 ====>>" + toplam3);
		System.out.println("Toplam 4 ====>>" + toplam4);
		System.out.println("Bolum ====>>" + bolum);
		System.out.println("Ortalama ====>>" + ortalama);
		System.out.println("min ====>>" + min);
		System.out.println("max ====>>" + max);
		System.out.println("min2 ====>>" + min2);
		System.out.println("max2 ====>>" + max2);

		boolean kontrol = numaralar.stream().anyMatch(x -> x > 5 && x % 2 == 0);
		boolean kontrol2 = numaralar.stream().allMatch(x -> x > 25);
		System.out.println(kontrol);
		System.out.println(kontrol2);

		String deger = numaralar.stream().map(x -> x.toString()).collect(Collectors.joining(","));
		System.out.println(deger);

		List<String> stringList = new ArrayList<>(List.of("Ankara","Bolu","Var","Muş","İzmir","İstanbul","Adana","Antalya","Mersin","Artvin"));
		
		List<String> aIleBaslayan = stringList.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
		System.out.println(aIleBaslayan);
		
		List<String> aIleBiten = stringList.stream().filter(x->x.endsWith("A")).collect(Collectors.toList());
		System.out.println(aIleBiten);
		
		stringList.stream().filter(x ->x.length() <4 ).forEach(System.out::println);
		
		// Map olarak gruplama.... !!!!!!!!!!!
		// groupingBy kullanarak mapleme yapıyorsak value degeri bir liste olacak...
		System.out.println(" Map olarak gruplama");
		Map<Integer,List<String>> map = stringList.stream().collect(Collectors.groupingBy(x -> x.length()));
		
		Map<Character, List<String>> map2 = stringList.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
		Map<String, List<String>> map3 = stringList.stream().collect(Collectors.groupingBy(x -> x.substring(0,1)));
		
		System.out.println(map);
		System.out.println(map2);
		System.out.println(map3);
		
		
		Map<String, Integer> map5 = stringList.stream().collect(Collectors.toMap(x -> x, y ->y.length()));
		// İlk 2 harfini eşledik..
		Map<String, String> map6 = stringList.stream().collect(Collectors.toMap(x -> x, y ->y.substring(0,2)));
		
		System.out.println(map5);
		System.out.println(map6);
	}

}
