package com.bilgeadam.lesson029.okulApp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileManager {

	static String file = "C:/java10-workspace/dosya/";
	static String path = file + "/ogrenci.txt";

	public static List<Ogrenci> dosyadanVeriOkuma(String ogretmenIsmi, BufferedReader bufferedReader) {

		List<Ogrenci> ogrenciList = new ArrayList<>();
		String veri;
		try {

			while ((veri = bufferedReader.readLine()) != null) {
				String[] veriDizisi = veri.split(",");
				String isim = veriDizisi[0];
				List<String> notList = Arrays.asList(veriDizisi).subList(1, 4);
				double ort = ortHesapla(notList);
				LocalDate date = Utility.formatliLocalDateCevirme(veriDizisi[4], "dd/MM/yyy");

				Ogrenci ogrenci = new Ogrenci(isim, ort, date);
				ogrenciList.add(ogrenci);
				System.out.println(
						ogretmenIsmi + " adlı ogretöem ==>>" + ogrenci.getIsim() + " adlı ogrencinin notunu okudu");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return ogrenciList;
	}

	public static void ogretmenDosyasiOlustur(List<Ogrenci> ogrenciList, String ogretmenAdi) {

		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream(file + ogretmenAdi + ".txt"))) {

			objectOutputStream.writeObject(ogrenciList);

			System.out.println("Öğrenciler başarılı bir şekilde kaydedildi..");

		} catch (FileNotFoundException e) {
			System.out.println("Öğrencileri kaydetme işlemi başarısız...");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Öğrencileri kaydetme işlemi başarısız...");
			e.printStackTrace();
		}

	}

	public static List<Ogrenci> ogretmenDosyasınıOku(String ogretmenAdi) {
		List<Ogrenci> ogrenciList = new ArrayList<>();

		try (ObjectInputStream objectInputStream = new ObjectInputStream(
				new FileInputStream(file + ogretmenAdi + ".txt"))) {

			ogrenciList = (List<Ogrenci>) objectInputStream.readObject();

		} catch (FileNotFoundException e) {
			System.out.println("Bir hata oluştu : " + e.toString());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Bir hata oluştu : " + e.toString());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Bir hata oluştu : " + e.toString());
			e.printStackTrace();
		}

		return ogrenciList;
	}

	private static double ortHesapla(List<String> notList) {
		return notList.stream().collect(Collectors.averagingDouble(x -> Double.parseDouble(x)));

	}

}
