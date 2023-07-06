package com.bilgeadam.lesson032.singelton.enums;
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

public enum Robot {
	
	ROBOT;
	
	public void calis() {
		System.out.println(hashCode() + " numaralı robot çalışıyor..");
	}
	
}
