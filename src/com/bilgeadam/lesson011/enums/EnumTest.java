package com.bilgeadam.lesson011.enums;

public class EnumTest {

	public static void main(String[] args) {
		
		EAylar haziran = EAylar.HAZIRAN;
		
		// Stringe çevirme metotları..
		String haziranString = EAylar.HAZIRAN.toString();
		String haziranString2 = EAylar.HAZIRAN.name();
		
		System.out.println(haziran);
		System.out.println(haziranString);
		System.out.println(haziranString2);
		
		System.out.println(EAylar.HAZIRAN.ordinal());   // .ordinal ile sırasını (İndex) alıyoruz...
		System.out.println(EAylar.TEMMUZ.ordinal());    // .ordinal ile sırasını (İndex) alıyoruz...
		System.out.println(EAylar.AGUSTOS.ordinal());   // .ordinal ile sırasını (İndex) alıyoruz...
		
		
		// String i enum a çevirme
		
		String ay = "temmuz";
		
		EAylar enumAy = EAylar.valueOf(ay.toUpperCase());   // varsa Enum a çevirecektir. Yoksa hata verir...
		System.out.println(enumAy);
		
		// Bir enum yapısını array a çevirme..
		
		EAylar [] dizi = EAylar.values();
		
		System.out.println("=============================");
		for (EAylar ay1 : dizi) {
			if(ay1.gun ==30 && ay1.mevsim.equalsIgnoreCase("yaz")) {
				System.out.println((ay1.ordinal()+1) + "-" + ay1.toString());
				System.err.println(ay1.mevsimGetir());
			}
			
		}
		
		System.out.println(EAylar.HAZIRAN.gun);
	}
}
