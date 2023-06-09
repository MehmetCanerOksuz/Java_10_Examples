package com.bilgeadam.lesson022.movieappBeraber;

import java.util.List;
import java.util.Set;

public class Film{
	
	private String isim;
	private List<ETur> turler;
	private String id;
	private double puan;
	private Yonetmen yonetmen;
	private Set<Oyuncu> oyuncular;
	
	public Film(String isim, List<ETur> turler, Yonetmen yonetmen) {
		super();
		this.isim = isim;
		this.turler = turler;
		this.yonetmen = yonetmen;
	}

	public Film(String isim, List<ETur> turler) {
		super();
		this.isim = isim;
		this.turler = turler;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public List<ETur> getTurler() {
		return turler;
	}

	public void setTurler(List<ETur> turler) {
		this.turler = turler;
	}

	public double getPuan() {
		return puan;
	}

	public void setPuan(double puan) {
		this.puan = puan;
	}

	public Yonetmen getYonetmen() {
		return yonetmen;
	}

	public void setYonetmen(Yonetmen yonetmen) {
		this.yonetmen = yonetmen;
	}

	public Set<Oyuncu> getOyuncular() {
		return oyuncular;
	}

	public void setOyuncular(Set<Oyuncu> oyuncular) {
		this.oyuncular = oyuncular;
		
		
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Film [isim=" + isim + ", turler=" + turler + ", id=" + id + ", puan=" + puan + ", yonetmen=" + yonetmen
				+ ", oyuncular=" + oyuncular + "]";
	}





	
	
}
