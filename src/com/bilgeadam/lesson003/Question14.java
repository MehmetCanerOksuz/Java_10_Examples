package com.bilgeadam.lesson003;

/*
 * 1 den başlayarak sayıları toplayalım. Toplamımız 50 den büyük olara kadar 
 * programımızın çalışsın sonunda da toplamı ve kaç kere çalıştığını yazalım..
 * 
 * 
 */

public class Question14 {
	
	public static void main(String[] args) {
		
		int toplam=0;
		
		int i =0;
		while(toplam<=50) {
			
			i++;
			toplam+=i;
			
			System.out.println("dongu = "+toplam + "dongu sayısı" + i);
		}
		System.out.println("Toplam = "+ toplam+ "\tProgram " + i + " kere çalıştı" );
	}

}
