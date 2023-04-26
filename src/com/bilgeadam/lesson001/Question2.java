package com.bilgeadam.lesson001;

/*
 * iki tane string değişkenimiz olsun. isim ve soyisim bu değişkenlerde tutalım.
 * daha sonra bir yaş değişkenimiz olsun yaşımızıda bu değişkende tutalım
 * sizden bunun sonucunda şöyle bir çıktı istiyorum
 * 
 * Caner Öksüz - 28
 * 
 * 
 */

public class Question2 {
	
	public static void main(String[] args) {
		
		String isim = "Caner";
		String soyisim = "Öksüz";
		byte yas = 28;
		
		System.out.println(isim+" "+soyisim+" - "+yas);
		
		String sonuc = isim+"\n"+soyisim+"\n"+yas;    //  (\n) bir alt satıra geç demek..
		String sonuc2 = isim+"\t"+soyisim+"\t"+yas;   //  (\t) bir tab kadar boşluk bırakıyor.
		System.out.println(sonuc);
		System.out.println(sonuc2);
		
	}

}
