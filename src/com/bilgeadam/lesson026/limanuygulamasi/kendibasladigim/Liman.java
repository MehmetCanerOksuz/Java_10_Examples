package com.bilgeadam.lesson026.limanuygulamasi.kendibasladigim;

import java.util.List;

import com.bilgeadam.lesson025.optional.YukAlani;

public class Liman {

	static long limanIdSayac=1;
	private long id;
	private List<YukAlani> alanlar;
	private int yukAlanAdeti;

	

	
	public Liman(int yukAlanAdeti) {
		this.id = limanIdSayac++;
		yukAlaniOlustur(yukAlanAdeti);
	}

	



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}


	public List<YukAlani> getAlanlar() {
		return alanlar;
	}


	public void setAlanlar(List<YukAlani> alanlar) {
		this.alanlar = alanlar;
	}





	public List<YukAlani> yukAlaniOlustur(int yukAlanAdeti) {
		
		for (int i = 0; i <yukAlanAdeti; i++) {
			alanlar.add(new YukAlani());
		}
		
		return null;
	}
}
