package com.bilgeadam.lesson007;

import java.util.Locale;

public class StringMetotlari {

	public static void main(String[] args) {

		String value1 = "Merhaba Dünya";
		String value2 = "Java";
		System.out.println(value1.length()); // uzunluk
		System.out.println(value1.charAt(0)); // index değerindeki Charı donuyor
		System.out.println(value1.concat(value2)); // Birleştirme işlemi
		System.out.println(value1);
		System.out.println(value2);
		String value3 = value2.concat(value1);
		System.out.println(value3);
		// belli index aralıgındaki deperleri alma..
		System.out.println(value1.substring(5)); // belli index aralıgındaki deperleri alma..
		System.out.println(value1.substring(2, 5));
		System.out.println(value1.substring(1));
		System.out.println(value1.substring(7, 9));
		System.out.println(value1.substring(5));
		System.out.println(value1.substring(5, value1.length() - 1));
		// İÇERİYOR MU
		System.out.println(value1.contains("Mer")); // value1 Mer i içeriyor mu??
		System.out.println(value1.contains("D"));
		System.out.println(value1.contains(" D"));
		System.out.println(value1.contains(" d"));
		// EŞİTLİK
		String value4 = "Merhaba Dünya";
		String value5 = "merhaba Dünya";
		String value6 = new String("Merhaba Dünya");
		System.out.println(value1.equals(value4));
		System.out.println(value1.equals(value5));
		System.out.println(value1.equalsIgnoreCase(value5)); // büyük küçük önemli değilse..
		System.out.println(value1 == value4);
		System.out.println(value1 == value6); // Eşittir (==) referans kontrol ediyor. / equals içerik kontrol ediyor..
		System.out.println(value1.equals(value6));

		// Bir karakterin kacıncı indexde oldugunu bulan metot (indexOf)
		System.out.println(value1.indexOf("a"));
		System.out.println(value1.lastIndexOf("a"));
		System.out.println(value1.lastIndexOf("x")); // yoksa -1 dönüyor.

		// Uppercase LowerCase ( Büyütme Küçültme )
		System.out.println(value1.toUpperCase());
		System.out.println(value1);
		System.out.println(value1.toLowerCase());
		// System.out.println(value1.toUpperCase(Locale.ENGLISH));
		System.out.println(value1.substring(0, 3).toUpperCase() + value1.substring(3));

		// replace - değiştirme..
		System.out.println(value1.replace('a', 'x'));
		System.out.println(value1.replace("ab", "xx"));

		// StartsWith endWiths // ile başlıyor mu ile bitiyor mu
		System.out.println(value1.startsWith("M"));
		System.out.println(value1.startsWith("m"));
		System.out.println(value1.endsWith("a"));
		System.out.println(value1.endsWith("m"));

		// başında ve sonundaki boşlukları silme
		String value9 = " xxx ";
		System.out.println(value9);
		System.out.println(value9.trim());

		// split (,) ü almadan diğerlerini diziye çeviriyor..
		String value10 = "Java,React,.Net";
		String[] dizi = value10.split(",");
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		System.out.println(dizi[2]);

		////////
		char[] array = value10.toCharArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}

	}

}
