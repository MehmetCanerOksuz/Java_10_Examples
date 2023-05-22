package com.bilgeadam.lesson006;
/*
 * deger Stringinin karakterleri toplamı kaçtır
 * 
 */

public class Question34 {
	
	public static void main(String[] args) {
		
		String deger = "123";
		int toplam = 0;
		int toplam2 =0;
		
		for(int i =0; i<deger.length();i++) {
			
			char a=deger.charAt(i);
			String karakter1 =Character.toString(a);
			String karakter2 = String.valueOf(a);
			
			int sayi = Integer.parseInt(karakter1);
			
			int sayi2 = Character.getNumericValue(a);
			toplam+=sayi;
			toplam2+=sayi2;
		}
		System.out.println(toplam);
		System.out.println(toplam2);
		
	}

}
