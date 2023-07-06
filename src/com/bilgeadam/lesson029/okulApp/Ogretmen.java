package com.bilgeadam.lesson029.okulApp;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class Ogretmen extends Thread {

	private String isim;
	private List<Ogrenci> ogrenciList;
	private BufferedReader bufferedReader;

	public Ogretmen(String isim, BufferedReader bufferedReader) {
		super();
		this.isim = isim;
		this.ogrenciList = new ArrayList<>();
		this.bufferedReader = bufferedReader;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public List<Ogrenci> getOgrenciList() {
		return ogrenciList;
	}

	public void setOgrenciList(List<Ogrenci> ogrenciList) {
		this.ogrenciList = ogrenciList;
	}

	public void notlariOku() {

		this.ogrenciList = FileManager.dosyadanVeriOkuma(this.isim,this.bufferedReader);

	}

	public void dosyaOlustur() {
		FileManager.ogretmenDosyasiOlustur(ogrenciList, this.isim);
	}

	public List<Ogrenci> dosyadanOgrencileriGetir() {
		this.ogrenciList = FileManager.ogretmenDosyasınıOku(this.isim);
		return ogrenciList;
	}

	@Override
	public void run() {

		notlariOku();


	}

	@Override
	public String toString() {
		return "Ogretmen [isim=" + isim + ", ogrenciList=" + ogrenciList + "]";
	}

}
