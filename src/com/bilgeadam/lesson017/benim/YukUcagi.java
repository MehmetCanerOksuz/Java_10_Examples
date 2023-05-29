package com.bilgeadam.lesson017.benim;

public class YukUcagi extends Ucak implements IYuk{

	@Override
	public void yukAl() {
		System.out.println("Ucak Yuk Alıyor");
		
	}

	@Override
	public void yukBosalt() {
		System.out.println("Ucak Yuk Bosaltıyor");
		
	}

	@Override
	public void kalkisYap() {
		System.out.println("Ucak Kalkıs yapıyor");
		
	}

	@Override
	public void inisYap() {
		System.out.println("Ucak iniyor");
		
	}

	@Override
	public void hizlan() {
		System.out.println("Ucak Hızlanıyor");
		
	}

	@Override
	public void yavasla() {
		System.out.println("Ucak yavaslıyor");
		
	}
	
	

}
