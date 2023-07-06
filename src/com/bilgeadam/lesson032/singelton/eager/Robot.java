package com.bilgeadam.lesson032.singelton.eager;
/*
 * 1- 1 tane Robotumuz var bu rabotun çalış metodu var.
 * çalış metodunda ==>> hascode -->>> numaralı robot çalışıyor.
 * 
 * 2- Ev halkı sınıfımız olsun bu sınıfta Robot cagır metodu olsun.
 * bu metot çalışınca bize robot sınıfındaki çalış metodunu çalıştırsın. 
 * (Ev halkı her defasında aynı robotu çağırmalı)
 * 
 * 3- Test sınıfında 3 tane ev halkı yaratarak bunu deneyelim..
 * 
 * 
 */

public class Robot {
	
	private static Robot instance = new Robot();
	
	private Robot() {
		
	}
	
	// thread lerin aynı anda bu metoda girmesini engellemek için synchronized keywordunu kullanmak gerekir...
	// public synchronized static Robot getRobot()
	// bu sayede ğere Tgreadker üzerinde çalışıyorsak her defasında aynı nesneyi üretmeyi garanti altına almış oluruz.
	
	public static Robot getRobot() {
		
		instance = instance;
		
		return instance;
	}

	public void calis() {
		System.out.println(hashCode() + " numaralı robot çalışıyor..");
	}

	
	
}
