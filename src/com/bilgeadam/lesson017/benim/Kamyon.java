package com.bilgeadam.lesson017.benim;

public class Kamyon extends KaraTasitlari implements IYuk{

	public Kamyon(String plaka, int tekerlekSayisi) {
		super(plaka, tekerlekSayisi);
		
	}

	@Override
	public void hizlan() {
		System.out.println("Kamyon hızlanıyor..");
		
	}

	@Override
	public void yavasla() {
		System.out.println("Kamyon yavaşlıyor..");
		
	}

	@Override
	public void yukAl() {
		System.out.println("Kamyon yuk alıyor");
		
	}

	@Override
	public void yukBosalt() {
		System.out.println("Kamyon yuk bosaltıyor");
		
	}

	@Override
	public void sur() {
		// TODO Auto-generated method stub
		
	}

}
