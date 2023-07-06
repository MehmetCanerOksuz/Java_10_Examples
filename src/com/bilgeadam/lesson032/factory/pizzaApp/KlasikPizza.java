package com.bilgeadam.lesson032.factory.pizzaApp;

public class KlasikPizza extends Pizza{

	public KlasikPizza(ETur tur, EHamurTipi hamurTipi, EBoyut boyut) {
		super(tur, hamurTipi, boyut);
		
	}

	@Override
	public String toString() {
		return "KlasikPizza [getFiyat()=" + getFiyat() + ", getTur()=" + getTur() + ", getHamurTipi()=" + getHamurTipi()
				+ ", getBoyut()=" + getBoyut() + "]";
	}

	

}
