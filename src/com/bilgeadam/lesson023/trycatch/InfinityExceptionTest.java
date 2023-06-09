package com.bilgeadam.lesson023.trycatch;
/*
 * cheked exception ==>> kontrol edilmesi zorunlu istisnalar exception sınıfından extends alırlar..
 * bir metot içinde checked exception fırlatıyor isek metot da fırlattıgımız exception türünü declara etmek zorundayız..
 * metodu kullandığımız yerde metodu try catch içine almak zorundayız..
 * 
 * unchecked exception ==>> kontrol edilmesi zorunlu olmayan istisnalar ; runtimeException sınıfından extends alırlar
 * kontrol etmek zorunlu değildir fakat hatalı bir deger girersek istisna fırlatacaktır..
 * 
 * 
 */

public class InfinityExceptionTest {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(bolme(20,2));
		} catch (InfinityExcepsion e) {
			
			e.printStackTrace();
		}
		System.out.println("Program çalışmaya devam ediyor..");
		
		try {
			System.out.println(pozitifDegerlerToplami(5, -5));
		}catch (EksiDegerException e) {
			System.out.println("hata olustu " + e.toString());
		}
		
		System.out.println("2. Kez Program çalışmaya devam ediyor..");
		
		
	}
	
	public static double bolme(double sayi1, double sayi2) throws InfinityExcepsion {
		
		if(sayi2==0) {
			throw new InfinityExcepsion("Sonsuzluk hatası");
		}
		
		return sayi1 / sayi2;
	}
	
	public static double pozitifDegerlerToplami(int sayi1, int sayi2) {
		
		if(sayi1<0 || sayi2<0) {
			throw new EksiDegerException("Girdiğiniz sayılar pozitif olmak zorundadır.");
		}
		
		return sayi1+sayi2;
	}

}
