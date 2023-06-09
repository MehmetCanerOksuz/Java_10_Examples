package com.bilgeadam.lesson021.movieapp;

public abstract class Film {
	
	private String isim;
	private Yonetmen yonetmen;
	private int puan;
	private Oyuncu[] oyuncular;
	private EFilmTurleri tur;
	
	public Film(String isim, Yonetmen yonetmen, int puan, Oyuncu[] oyuncu) {
		this.isim = isim;
		this.yonetmen = yonetmen;
		this.puan = puan;
		this.oyuncular = oyuncu;
	}
	

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Yonetmen getYonetmen() {
		return yonetmen;
	}

	public void setYonetmen(Yonetmen yonetmen) {
		this.yonetmen = yonetmen;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public Oyuncu[] getOyuncu() {
		return oyuncular;
	}

	public void setOyuncu(Oyuncu[] oyuncu) {
		this.oyuncular = oyuncu;
	}
	
	
	
	

}
