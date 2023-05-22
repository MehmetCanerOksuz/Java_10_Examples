package com.bilgeadam.lesson013;

public class _05_StringPool {
	
	public static void main(String[] args) {
		
		//Stringler değiştirilemez.. Yenisini oluşturur..
		
		String isim = "Mustafa";
		String isim2 = "Mustafa";
		
		System.out.println(isim == isim2);
		
		String isim3 = "Mustafa Ozturk";
		String isim4 = "Mustafa Ozturk";
		isim4 = "Mustafa ÖZTÜRK";
		isim4 = "Serkan";
		
		String isim6 = new String("Hilal");
		String isim7 = new String("Hilal");
		String isim8 = new String("Hilal");
		isim6 = isim8;
		isim7=isim8;
		isim8 = "xxx";
		
		System.out.println(isim8 == isim7);
		System.out.println(isim7);
		String isim9 = "Hilal";
		String isim10 = new String("Hilal").intern();
		System.out.println(isim9 == isim10);
	}

}
