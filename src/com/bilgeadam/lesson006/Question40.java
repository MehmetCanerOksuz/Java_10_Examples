package com.bilgeadam.lesson006;
/*
 * tek ve çift sayılar toplamını bul
 * 
 * 
 */

public class Question40 {
	
	public static void main(String[] args) {
		
		String [] sayilar = { "4", "6", "5", "12", "13" };
		
		double ciftToplam =0, tekToplam =0;
		
		for (int i = 0; i < sayilar.length; i++) {
			
			int a = Integer.parseInt(sayilar[i]);
			
			if(a%2==0) {
				ciftToplam+=a;
			}else {
				tekToplam+=a;
			}
			
		}
		double oran = tekToplam / ciftToplam;
		System.out.println("Oran = " + oran);
		System.out.println("Çift sayılar toplamı = " + ciftToplam);
		System.out.println("Tek sayılar toplamı = " + tekToplam);
	}

}
