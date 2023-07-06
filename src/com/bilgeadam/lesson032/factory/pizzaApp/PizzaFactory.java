package com.bilgeadam.lesson032.factory.pizzaApp;

public class PizzaFactory {
	static PizzaSiparis pizzaSiparis = new PizzaSiparis();
	


	public static Pizza pizzaOlustur(EBoyut boyut, ETur tur, EHamurTipi hamurTipi) {

		switch (tur) {
		case TONBALIKLI,KARISIK:
			
			return new KlasikPizza(tur, hamurTipi, boyut);

		case AKDENIZ:
			
			return new VeganPizza(tur, hamurTipi, boyut);
		default:
			throw new RuntimeException("Hatalı pizza seçimi");
		}
		
	}

}
