package com.bilgeadam.lesson016;
/*
 * Bir market ve market yonetimi sınıflarımız olsun
 * içecekler yiyecekler temizlik urunleri ve sut urunleri satılsın
 * 
 * calısanlar ve musterilerimiz olsun
 * 
 * 
 */

public class Test {
	
	public static void main(String[] args) {
		
		MarketYonetimi marketYonetimi = new MarketYonetimi();
		Market market = new Market("Market","Ankara");
		marketYonetimi.setMarket(market);
		
		System.out.println(marketYonetimi.getMarket());
		
		Market market2 = new Market("Market2","Bolu");
		MarketYonetimi marketYonetimi2 = new MarketYonetimi(market2);
		System.out.println(marketYonetimi2.getMarket());
	}

}
