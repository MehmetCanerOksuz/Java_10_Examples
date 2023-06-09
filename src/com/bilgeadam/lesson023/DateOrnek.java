package com.bilgeadam.lesson023;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateOrnek {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
//		System.out.println(date.getDate());
//		System.out.println(date.getDay());
//		System.out.println(date.getYear());
		
		LocalDate date1 = LocalDate.now();
		LocalDateTime date2 = LocalDateTime.now();
		System.out.println(date1);
		System.out.println(date2);
		
		LocalDate date3 = LocalDate.of(2001, 06, 10);
		LocalDate date4 = LocalDate.of(2001, Month.JULY, 10);
		System.out.println(date3);
		System.out.println(date4);
		System.out.println(date3.getDayOfMonth());
		System.out.println(date3.getYear());
		System.out.println(date3.getDayOfYear());
		System.out.println(date3.getMonthValue());
		System.out.println(date3.getDayOfWeek()); // gunun degerini veriyor.. ( pazartesi- salı....)
		System.out.println(date3.getDayOfWeek().getValue());   // haftanın kaçıncı günü ( 1-2-3...)
		System.out.println(date3.isLeapYear());  // artık yıl mu???
		
		System.out.println(date3.plusYears(2));
		System.out.println(date3.plusMonths(2));
		System.out.println(date3.plusDays(2));
		
		System.out.println(date3.minusYears(2));
		System.out.println(date3.minusMonths(2));
		System.out.println(date3.minusDays(2));
		
		System.out.println(date1.isBefore(date3));   // Karşılaştırma ; önce mi ?? 
		System.out.println(date1.isAfter(date3));
		
		System.out.println(date3.isEqual(date1));   // Eşit mi ??
		
		LocalDate date5 = LocalDate.parse("2022-12-15");  //yıl-ay-gun..
		System.out.println(date5);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String date6 = LocalDate.now().format(formatter);
		System.out.println(date6);
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy H:mm");
		LocalDateTime date7 = LocalDateTime.parse("11/10/2022 15:16" , formatter2);
		System.out.println(date7);
		
		LocalDate date8 = LocalDate.now();
		
		LocalDate date9 = LocalDate.parse("2022-06-05");
		
		long ay = date9.until(date8, ChronoUnit.MONTHS);
		System.out.println("ay ==>>" + ay);
		
		long gun = date9.until(date8, ChronoUnit.DAYS);
		System.out.println("GUN ==>>" + gun);
		
		long yıl = date9.until(date8, ChronoUnit.YEARS);
		System.out.println("Yıl ==>>" + yıl);
		
		long hafta = date9.until(date8, ChronoUnit.WEEKS);
		System.out.println("hafta ==>>" + hafta);
		
		long yıl2 = ChronoUnit.YEARS.between(date9, date8);
		System.out.println(yıl2);
		
		
	}

}
