package com.bilgeadam.lesson026.limanuygulamasi.kendibasladigim;

import java.time.LocalDate;

public class Yuk {
	
	static long yukIdSayac=1;
	private long id;
	private double agirlik;
	private LocalDate kabulTarihi;
	
	



	public Yuk(double agirlik, LocalDate kabulTarihi) {
		super();
		this.id = yukIdSayac++;
		this.agirlik = agirlik;
		this.kabulTarihi = kabulTarihi;
	}


	public double getAgirlik() {
		return agirlik;
	}


	public void setAgirlik(double agirlik) {
		this.agirlik = agirlik;
	}


	public LocalDate getKabulTarihi() {
		return kabulTarihi;
	}


	public void setKabulTarihi(LocalDate kabulTarihi) {
		this.kabulTarihi = kabulTarihi;
	}


	@Override
	public String toString() {
		return "Yuk [agirlik=" + agirlik + ", kabulTarihi=" + kabulTarihi + "]";
	}

	
}
