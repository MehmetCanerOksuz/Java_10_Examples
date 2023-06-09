package com.bilgeadam.lesson024;

/*
 * 1 -> 1 metot yazacağız dışarıdan bir index alıcak sonra o indexteki değeri yazdıracağız..
 * hata varsada hatayı yakalayıp hata mesajını yazdıralım..
 * 
 * 2 -> array üzerinde gezelim, gezerken toplayabildiğimiz değerleri toplam değişkenine ekleyerek
 * bir toplam sonucu bulalım ve bir sayac ile de hata sayısını tutalım ; döngü sonunda toplamı ve
 * hata sayısını yazdıralım..
 * 
 */

public class TryCatchOrnek2 {

	public static void main(String[] args) {
		String[] array = { "30", "a", "20", "ab", null, "50" };

		indexDeğeriYazdir(array, 2);
		arrayToplaVeHataSay2(array);

	}

	public static void indexDeğeriYazdir(String[] array, int index) {

		try {
			System.out.println(array[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString() + " Arrayin boyutu = " + array.length + " Lütfen 0 ile " + array.length
					+ " arasında bir sayı giriniz");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

	public static void arrayToplaVeHataSay(String[] array) {

		int hataSay = 0;
		int toplam = 0;

		for (String deger : array) {
			try {
				toplam += Integer.valueOf(deger);
			} catch (NumberFormatException e) {
				hataSay++;
				System.out.println(e.toString());
				e.printStackTrace();

			} catch (Exception e) {
				hataSay++;
				System.out.println(e.toString());
				e.printStackTrace();
			}
		}

		System.out.println("Toplam = " + toplam);
		System.out.println("Hata sayısı = " + hataSay);
	}
	public static void arrayToplaVeHataSay2(String[] array) {

		int hataSay = 0;
		int toplam = 0;

		for (String deger : array) {
			try {
				nullKontrolu(deger);
				toplam += Integer.valueOf(deger);
			} catch (NumberFormatException e) {
				hataSay++;
				System.out.println(e.toString());
				
			} catch (Exception e) {
				hataSay++;
				System.out.println(e.toString());
			}
		}

		System.out.println("Toplam = " + toplam);
		System.out.println("Hata sayısı = " + hataSay);
	}
	
	public static String nullKontrolu(String deger) throws Exception{
		
		if(deger ==null) {
			throw new NullPointerException("Null Hatası!!!!");
		}
		
		return deger;
		
	}

}
