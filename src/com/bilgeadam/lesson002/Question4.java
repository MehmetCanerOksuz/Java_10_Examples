package com.bilgeadam.lesson002;

public class Question4 {
	
	/*
	 * Bir türk lirası değerimiz olsun bunun başlangıç miktarını belirleyelim
	 * 
	 * daha sonra bir dolar kuru üzerinden dolar cinsinden değerini hesaplayalım..
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		double turkLirası = 1500;
		double dolarKuru = 19.42;
		double dolarCinsi = turkLirası / dolarKuru;
		
		System.out.println(dolarCinsi);
		
	}

}
