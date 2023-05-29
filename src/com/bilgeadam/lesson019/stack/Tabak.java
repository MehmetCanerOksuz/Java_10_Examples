package com.bilgeadam.lesson019.stack;
/*
 * 
 * 
 * Tabak sınıfımızda tabaklarımızın id sini ve kirli olup olmadıklarını tutalım
 * 
 * daha sonra bir manager sınıfı olusturalım
 * bu manager sınıfında 10 tane tabak uretelim ve kirli olup olmadıkları rastgele gelsin..
 * 
 * temizleri bir stackte kirlileri başka bir stackde tutalım..
 * 
 * kullan metodu olusturalım ==>> temizler stack inden bir tabak alıp kirleteceğiz..
 * temizle ve kullan metodunda eğer stacklerimiz boşsa  temizle metodunda kullan çalışsın.. 
 * kullan metodunda temizle çalışsın..
 * 
 * daha sonra secim yap metodu  olusturacağız. 1 veya 2 değer alıcak..
 * gelen değer 1 ise temizle 2 ise kullan metodu çalışacak..
 * 
 * Test sınıfında 50 kere çalışan bir dongü olsun her defasında random bir secim üretip 
 * secim yap metodunu kullanacağız..
 */

public class Tabak {
	
	private int id;
	private boolean kirliMi;
	
	
	public Tabak(int id, boolean kirliMi) {
		
		this.id = id;
		this.kirliMi = kirliMi;
		
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public boolean isKirliMi() {
		return kirliMi;
	}


	public void setKirliMi(boolean kirliMi) {
		this.kirliMi = kirliMi;
	}


	@Override
	public String toString() {
		return "Tabak [id=" + id + ", kirliMi=" + kirliMi + "]";
	}
	
	

}
