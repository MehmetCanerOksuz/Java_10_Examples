package com.bilgeadam.lesson007;

public class MetotTest {
	
	public static void main(String[] args) {
		String [] myDizi = new String [3];
		metot1();
		String deger ="Java";
		int sayi = 1;
		
		metot2(deger, sayi , myDizi);
		
		System.out.println("main metod==>" + myDizi[1]);
		
		System.out.println(topla());
		int result = topla();          // topla metodunu result a eşitledik..
		
		System.out.println(result + 5);
		
		String isim = metot3();    // metot3 ü isim e eşitledik..
		System.out.println(isim);
		
		System.out.println(cikar(5,2));
		
		int result2 = cikar(12,18);    // cikar metodunu result2 ye eşitledik..
		
		System.out.println(result2);
		
		String[] yeniDizi = new String[3]; 
		arrayOlustur(yeniDizi);
		System.out.println(yeniDizi[0]);
		
		String[] yeniDizi2 = arrayOlustur2();
		System.out.println(yeniDizi2[1]);
		
		
	}
	
	// Geri donusu olmayan parametresiz metot ;
	public static void metot1() {    // void dönüş tipi ; dönüş tipi olmadığı için void...
		int sayi1= 5;
		int sayi2= 10;
		int sonuc= sayi1 + sayi2;
		System.out.println(sonuc);		
		System.out.println("Metot1 çalışıyor.");
	}
	
	//Geri donusu olmayan parametreli metot ;
	
	public static void metot2(String kelime, int sayi, String[] dizi) {
		System.out.println("Metot2 çalışıyor.");
		dizi[sayi] = kelime;
		System.out.println(sayi);
		System.out.println(dizi[sayi]);
	}
	
	//Geri donusumlu parametresiz ;
	
	public static int topla() {
		
		int sayi1 = 12;
		int sayi2 = 13;
		int sonuc = sayi1 + sayi2;
		//System.out.println(sonuc);
		return sonuc;
		
	}
	
	public static String metot3() {
		
		return "Caner";
	}
	
	public static int cikar (int sayi1, int sayi2 ) {   // ilk değer buraya geliyor.. sonra ne yaparsak...
		return sayi1-sayi2;
	}
	
	public static String[] arrayOlustur(String[] dizi) {
		
		//dizi =new String[3];
		dizi[0] ="Html";
		dizi[1] ="Css";
		dizi[2] ="JavaScript";
		return dizi;
	}
	
	public static String[] arrayOlustur2() {
		String[] yeniDizi = new String[4];
		yeniDizi =new String[3];
		yeniDizi[0] ="Html";
		yeniDizi[1] ="Css";
		yeniDizi[2] ="JavaScript";
		
		return yeniDizi;
	}
	
	


}
