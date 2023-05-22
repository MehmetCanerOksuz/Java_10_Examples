package com.bilgeadam.lesson014;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		
//		Kullanici kullanici1 =new Kullanici(1,"Dom","123","Caner");
//		System.out.println(kullanici1.getIsim());
//		System.out.println(kullanici1.getUsername());
//		System.out.println(kullanici1.getSepet().getTotalPrice());
//		//kullanici1.getSepet().setUrunler(new EUrun[5]);     //==>>>  Sepet içinde constructorda atadığımız için bunlara gerek yok..
//		
//		kullanici1.getSepet().getUrunler()[0]=EUrun.CIPS;
//		kullanici1.getSepet().getUrunler()[1]=EUrun.KOLA;
//		System.out.println(Arrays.toString(kullanici1.getSepet().getUrunler()));
//		
//		for(EUrun urun : kullanici1.getSepet().getUrunler()) {
//			if(urun !=null) {
//				System.out.println(urun.name());
//			}
//		}
		
		
		Uygulama uygulama = new Uygulama();
		uygulama.uygumalaGiris();
	}

}
