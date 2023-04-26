package com.bilgeadam.lesson001;

public class Question1 {
	


	public static void main(String[] args) {
		
		//Primitive (ilkel) veri tipleri        Stack Bellekte tutulur..
		//küçük harfle başlarlar..
		/*
		 * değişken isimlerini adlandırmada camel case kullanılır.
		 * 
		 * İlk harf küçük daha sonra yeni kelime varsa ilk harfi büyük olarak devam eder.
		 * 
		 * int veri türü, sayi bir değişkendir.
		 * 
		 */
		
		int sayi = 69;
		byte myByte = 25 ;
		short myShort = 5222;
		long myLong = 1_000_000_000;
		double myDouble = 1250000000.52;
		char myChar = 'A' ; // ctrl alt aşağı yön tuşu bu satırı aşağıya kopyalıyor.
		char myChar2 = 65 ;  //ASCII code sayısal deger A ya karşılık geliyor.
		boolean myBoolean = true;  // true ya da false
		float myFloat = 125.65f;
		
		//kısayol çalıştırma ctrl f11
		System.out.println("int deger : "+sayi);
		System.out.println("byte deger : "+myByte);
		System.out.println("short deger : "+myShort);
		System.out.println("long deger : "+myLong);
		System.out.println("double deger : "+myDouble);
		System.out.println("char deger : "+myChar);
		System.out.println("char deger2 : "+myChar2);
		System.out.println("boolean deger : "+myBoolean);
		System.out.println("float deger : "+myFloat);
		System.out.println("int degerin char karşılıgı : " + (char)+sayi);
		System.out.println("iki char değerinin toplanması : "+ (myChar + myChar2));  // bu şekilde int degerlerini alıyor..
		
		//Wrapper Class (Sarmalayıcı Sınıflar)      Heap Bellekte tutulur???
		
		Integer myInteger = 529;
		Integer myInteger2 = null;    
		int myInt = 0;
		
		System.out.println("INTEGER2 : " + myInteger2);
		
		myInteger2 = myInt;		
		
		System.out.println("INTEGER : " + myInteger);
		System.out.println("INTEGER2 : " + myInteger2);
		System.out.println("int : " + myInt);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.toString(myInt));  // Integer değeri Strings çevirir.
		
		System.out.println("Double max  : " + Double.MAX_VALUE+ "  min : " +Double.MIN_VALUE);
		System.out.println("Long max    : " + Long.MAX_VALUE+ "    min : " +Long.MIN_VALUE);
		System.out.println("Short max   : " + Short.MAX_VALUE+ "   min : " +Short.MIN_VALUE);
		System.out.println("Byte max    : " + Byte.MAX_VALUE+ "    min : " +Byte.MIN_VALUE);
		System.out.println("Float max   : " + Float.MAX_VALUE+ "   min : " +Float.MIN_VALUE);
		System.out.println("Integer max : " + Integer.MAX_VALUE+ " min : " +Integer.MIN_VALUE);
		
		long number1 = 32767;
		long number2 = 100;
		byte number3 = (byte) number2;
		byte number4 = (byte) number1;
		System.out.println(number3);
		System.out.println(number4);
		
		long result = number1+number3;
		System.out.println(result);
		short number5 = (short) (number1 + number3);
		short number6 = (short) (number2 + number3);
		short number7 = (short) number2;
		long number8 = number7;
		
		System.out.println(number5);
		System.out.println(number6);
		System.out.println(number7);
		System.out.println(number8);
		
		double number9 = 25.8;
		
		long result2 = (long) (number9 + number2);
		
		double result3 = number9+number2;
		System.out.println(result2);    // Ondalıkta her zaman alta yuvarlar.
		System.out.println(result3);
		
		int number10 =125/10;
		System.out.println(number10);
		
		float number11 = (float) (number9+10);
		double number12 = number11+10;
		System.out.println(number11);
		System.out.println(number12);
		
		String isim = "Mustafa";
		System.out.println(isim+number10);
		String a = isim+number10;
		System.out.println(a);
		String deger1 = Integer.toString(number10);
		System.out.println(deger1.length());
		String deger2 = number10+"";
		System.out.println(deger2);
		
	
	}	
}
