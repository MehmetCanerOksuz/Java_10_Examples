package com.bilgeadam.lesson016.polimorfizm;

public class ElektrikPokemonu extends Pokemon{
	
	private int voltajGucu;
	
	public ElektrikPokemonu(int id, String ad, int guc, int can, int seviye, int voltajGucu) {
		super(id, ad, guc, can, seviye);
		this.voltajGucu = voltajGucu;
		setTur("Elektrik");
	}

	public int getVoltajGucu() {
		return voltajGucu;
	}

	public void setVoltajGucu(int voltajGucu) {
		this.voltajGucu = voltajGucu;
	}
	
	@Override
	public void saldir() {
		System.out.println(getAd()+" adlı pokemon elektrik saldırısı yapıyor.");
		
	}

	

}
