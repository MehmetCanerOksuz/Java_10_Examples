package com.bilgeadam.lesson017.benim;

public class Otomobil extends KaraTasitlari{

	public Otomobil(String plaka, int tekerlekSayisi) {
		super(plaka, tekerlekSayisi);
		
	}

	@Override
	public void hizlan() {
		System.out.println("Otomobil hızlanıyor..");
		
	}

	@Override
	public void yavasla() {
		System.out.println("Otomobil Yavasliyor..");
		
	}

	@Override
	public void sur() {
		// TODO Auto-generated method stub
		
	}

}
