package com.bilgeadam.lesson016;

public class Urun {
	
	private double fiyat;
	private String barkod;
	private String sonKullanmaTarihi;
	

	public Urun(double fiyat, String barkod, String sonKullanmaTarihi) {
		super();
		this.fiyat = fiyat;
		this.barkod = barkod;
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}
	
	
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public String getBarkod() {
		return barkod;
	}
	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}
	public String getSonKullanmaTarihi() {
		return sonKullanmaTarihi;
	}
	public void setSonKullanmaTarihi(String sonKullanmaTarihi) {
		this.sonKullanmaTarihi = sonKullanmaTarihi;
		
		
	}
	@Override
	public String toString() {
		return "Urun [fiyat=" + fiyat + ", barkod=" + barkod + ", sonKullanmaTarihi=" + sonKullanmaTarihi + "]";
	}
	
	
	

}
