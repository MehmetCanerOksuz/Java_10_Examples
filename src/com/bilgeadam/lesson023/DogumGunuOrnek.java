package com.bilgeadam.lesson023;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
 * Dışarıdan String bir dogum günü tarihi alalım
 * daha sonra gunumuz ile kıyaslayalım kac gun, kaç hafta,kaç yıl yaşamışız onu bulalım..
 * 
 * 
 */

public class DogumGunuOrnek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen doğum gününüzü YIL-AY-GUN olarak giriniz..");
		LocalDate date1 = LocalDate.parse(scanner.nextLine());
		LocalDate now = LocalDate.now();
		
		long gun = date1.until(now, ChronoUnit.DAYS);
		System.out.println("GUN =>>"+gun);
		long hafta = date1.until(now, ChronoUnit.WEEKS);
		System.out.println("Hafta ==>>" + hafta);
		long ay = date1.until(now, ChronoUnit.MONTHS);
		System.out.println("Ay ==>>" +ay);
		long yıl = date1.until(now, ChronoUnit.YEARS);
		System.out.println("Yıl ==>>" + yıl);
		
		
	}
}
