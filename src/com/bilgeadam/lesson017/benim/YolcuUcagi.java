package com.bilgeadam.lesson017.benim;

public class YolcuUcagi extends Ucak implements IYolcu{

	@Override
	public void yolcuAl() {
		System.out.println("Ucak yolcu alıyor");
		
	}

	@Override
	public void yolcuIndir() {
		System.out.println("Ucak yolcu indiriyor");
		
	}

	@Override
	public void kalkisYap() {
		System.out.println("Ucak kalkıs yapıyor");
		
	}

	@Override
	public void inisYap() {
		System.out.println("Ucak iniyor");
		
	}

	@Override
	public void hizlan() {
		System.out.println("Ucak hızlanıyor");
		
	}

	@Override
	public void yavasla() {
		System.out.println("Ucak yavaslıyor");
		
	}

}
