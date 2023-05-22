package com.bilgeadam.lesson005;

public class Question31 {
	
	public static void main(String[] args) {
		
		String kelime = "Java";
		
		char karakter = kelime.charAt(0);
		char karakter1 = kelime.charAt(1);
		char karakter2 = kelime.charAt(2);
		char karakter3 = kelime.charAt(3);
		char sonKarakter = kelime.charAt(kelime.length()-1);
		System.out.println(karakter);
		System.out.println(karakter1);
		System.out.println(karakter2);
		System.out.println(karakter3);
		System.out.println(kelime.length());
		System.out.println(sonKarakter);
		
		for ( int i = 0 ; i < kelime.length() ; i++) {
			System.out.println(i+". indexdeki karakter ===>" + kelime.charAt(i));
		}
		
		
		
		
	}

}
