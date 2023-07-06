package com.bilgeadam.lesson032.factory.pizzaApp;

public class PizzaSiparis {
	
	public void menu() {
		
		System.out.println("Pizza Sipariş Menusu");
		Pizza pizza = pizzaSec3();
		siparisHazirlama(pizza);
	}

	/*
	 *turu hamur tipi ve boyutunu secip bir factory sınıfına yollayıp bize bir pizza dönmesini istiyoruz.. 
	 */
	private Pizza pizzaSec() {
		EBoyut boyut = boyutSec();
		EHamurTipi hamurTipi = hamurTipiSec();
		ETur tur = turSec();
		
		return PizzaFactory.pizzaOlustur(boyut,tur,hamurTipi);
	}


	private void siparisHazirlama(Pizza pizza) {
		System.out.println("Siparişiniz ==>>" + pizza);
		System.out.println("Hazırlanıyor..");
	}
	
	public EBoyut boyutSec() {
		
		for (EBoyut eBoyut : EBoyut.values()) {
			System.out.println(eBoyut.ordinal()+1  + "-" + eBoyut.toString());
		}
		int secim = Utility.intDegerAlma("Lütfen pizza boyutunu seçiniz.");
		return EBoyut.values()[secim-1];
	}
	
	public EHamurTipi hamurTipiSec() {
		for (EHamurTipi hamurTipi : EHamurTipi.values()) {
			System.out.println(hamurTipi.ordinal()+1 + "-" + hamurTipi);
		}
		
		int secim = Utility.intDegerAlma("Hamur tipini seçiniz.");
		return EHamurTipi.values()[secim -1];
	}
	
	public ETur turSec() {
		for (ETur tur: ETur.values()) {
			System.out.println(tur.ordinal()+1 + "-" + tur.toString());
		}
		
		int secim = Utility.intDegerAlma("Lütfen turu seçiniz");
		return ETur.values()[secim-1];
	}
	
	
	//       İKİNCİ YÖNTEM...........
	
	private Pizza pizzaSec2() {
		EBoyut boyut =(EBoyut) secim(EBoyut.values(), "Lütfen bir pizza boyutu seçiniz..");
		EHamurTipi hamurTipi =(EHamurTipi) secim(EHamurTipi.values(),"Lütfen bir hamur tipi seçiniz..");
		ETur tur = (ETur)secim(ETur.values(), "Lütfen bir tür seçiniz..");
		
		return PizzaFactory.pizzaOlustur(boyut,tur,hamurTipi);
	}
	
	public Enum secim(Enum [] dizi, String sorgu) {
		
		for (Enum deger : dizi) {
			System.out.println(deger.ordinal()+1 + "-" + deger);
		}
		int secim = Utility.intDegerAlma(sorgu);
		return dizi[secim-1];
	}
	
	
	//       UCUNCU YÖNTEM....
	
	public <T> T secim2(T[] dizi, String sorgu) {
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println((i+1)+ "-" + dizi[i]);
		}
		int secim = Utility.intDegerAlma(sorgu);
		return dizi[secim-1];
	}
	
	private Pizza pizzaSec3() {
		EBoyut boyut =secim2(EBoyut.values(), "Lütfen bir pizza boyutu seçiniz..");
		EHamurTipi hamurTipi =secim2(EHamurTipi.values(),"Lütfen bir hamur tipi seçiniz..");
		ETur tur = secim2(ETur.values(), "Lütfen bir tür seçiniz..");
		
		return PizzaFactory.pizzaOlustur(boyut,tur,hamurTipi);
	}
	

}
