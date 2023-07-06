package com.bilgeadam.lesson029.okulApp;

import java.io.Serializable;
import java.time.LocalDate;

public class Ogrenci implements Serializable{
	
	private String isim;
	private double notOrtalamasi;
	private EDurum durumu;
	private LocalDate dogumTarihi;
	

	public Ogrenci(String isim, double notOrtalamasi, LocalDate dogumTarihi) {
		super();
		this.isim = isim;
		this.notOrtalamasi = notOrtalamasi;
		this.dogumTarihi = dogumTarihi;
		durumBelirle(notOrtalamasi);
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getNotOrtalamasi() {
		return notOrtalamasi;
	}

	public void setNotOrtalamasi(double notOrtalamasi) {
		this.notOrtalamasi = notOrtalamasi;
	}

	public EDurum getDurumu() {
		return durumu;
	}

	public void setDurumu(EDurum durumu) {
		this.durumu = durumu;
	}

	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	
	public void durumBelirle(double ort) {
		if(notOrtalamasi>=60) {
			this.durumu = EDurum.GECTİ;
		}else {
			this.durumu = EDurum.KALDI;
		}
	}

	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", notOrtalamasi=" + notOrtalamasi + ", durumu=" + durumu + ", dogumTarihi="
				+ dogumTarihi + "]\n";
	}
	
	
	

}
