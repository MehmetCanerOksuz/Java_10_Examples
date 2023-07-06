package com.bilgeadam.lesson031;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * 
 * 1- kosucu sınıfı olusturacağız
 * kosucunun ismi mesafe , sure, baslangıc zamanı olsun
 * 
 * thread için bir metot yazalım ==>>
 * kosucu 100 metre kosacak
 * 1 er 1 er mesafe alacak ve her 10 metrede bir program çıktısı verecek
 * mustafa ==>> 10. metrede
 * mustafa ==>> 20. metrede
 * 
 * metodun sonunda mustafa adlı kosucu 100 metreyi 2000 mili saniyede kostu
 * 
 * yarıs sınıfımızda 5 tane kosucu olusturup hread olarak calıstıralım
 */

public class YuzMetreYarisi {
	
	public static void main(String[] args) {
		
		long baslangıncZamani = System.nanoTime();
		
		Kosucu kosucu1 = new Kosucu("Caner", baslangıncZamani);
		Kosucu kosucu2 = new Kosucu("Onur", baslangıncZamani);
		Kosucu kosucu3 = new Kosucu("Burak", baslangıncZamani);
		Kosucu kosucu4 = new Kosucu("Ünal", baslangıncZamani);
		Kosucu kosucu5 = new Kosucu("Serkan", baslangıncZamani);
		Kosucu kosucu6 = new Kosucu("Ahmet", baslangıncZamani);
		Kosucu kosucu7 = new Kosucu("Engin", baslangıncZamani);
		Kosucu kosucu8 = new Kosucu("Abdullah", baslangıncZamani);
		Kosucu kosucu9 = new Kosucu("Ali", baslangıncZamani);
		Kosucu kosucu10 = new Kosucu("Aminenur", baslangıncZamani);
		Kosucu kosucu11 = new Kosucu("Aysu", baslangıncZamani);
		Kosucu kosucu12 = new Kosucu("Gizem", baslangıncZamani);
		Kosucu kosucu13 = new Kosucu("Orhun", baslangıncZamani);
		Kosucu kosucu14 = new Kosucu("Salih", baslangıncZamani);
		Kosucu kosucu15 = new Kosucu("Yiğit", baslangıncZamani);
		
		
		Thread thread1 = new Thread(kosucu1);
		Thread thread2 = new Thread(kosucu2);
		Thread thread3 = new Thread(kosucu3);
		Thread thread4 = new Thread(kosucu4);
		Thread thread5 = new Thread(kosucu5);
		Thread thread6 = new Thread(kosucu6);
		Thread thread7 = new Thread(kosucu7);
		Thread thread8 = new Thread(kosucu8);
		Thread thread9 = new Thread(kosucu9);
		Thread thread10 = new Thread(kosucu10);
		Thread thread11 = new Thread(kosucu11);
		Thread thread12= new Thread(kosucu12);
		Thread thread13 = new Thread(kosucu13);
		Thread thread14 = new Thread(kosucu14);
		Thread thread15 = new Thread(kosucu15);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();
		thread11.start();
		thread12.start();
		thread13.start();
		thread14.start();
		thread15.start();
		
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
			thread6.join();
			thread7.join();
			thread8.join();
			thread9.join();
			thread10.join();
			thread11.join();
			thread12.join();
			thread13.join();
			thread14.join();
			thread15.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Kosucu> kosucular = new ArrayList<>(List.of(kosucu1,kosucu2,kosucu3,kosucu4,kosucu5,
				kosucu6,kosucu7,kosucu8,kosucu9,kosucu10,kosucu11,kosucu12,kosucu13,kosucu14,kosucu15));
		
		kosucular.stream().sorted(Comparator.comparingLong(x -> x.getSure())).forEach(System.out::println);
		
	
		

	}

}
