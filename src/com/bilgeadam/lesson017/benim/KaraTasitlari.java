package com.bilgeadam.lesson017.benim;

public abstract class KaraTasitlari extends Arac{
	
	private String plaka;
	private int tekerlekSayisi;
	
	
	public KaraTasitlari(String plaka, int tekerlekSayisi) {
		super();
		this.plaka = plaka;
		this.tekerlekSayisi = tekerlekSayisi;
	}


	public String getPlaka() {
		return plaka;
	}


	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}


	public int getTekerlekSayisi() {
		return tekerlekSayisi;
	}


	public void setTekerlekSayisi(int tekerlekSayisi) {
		this.tekerlekSayisi = tekerlekSayisi;
	}
	
	public abstract void sur();
	
	
	
	

}
