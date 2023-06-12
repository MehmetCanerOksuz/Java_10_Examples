package com.bilgeadam.lesson025.optional;

import java.util.List;

import com.bilgeadam.lesson026.limanuygulamasi.kendibasladigim.Yuk;

public class YukAlani {
	
	static long yukAlaniIdSayac =1;
	private long id;
	private List<Yuk> yukler;
	
	


	public YukAlani() {
		super();
		this.id = yukAlaniIdSayac++;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public List<Yuk> getYukler() {
		return yukler;
	}


	public void setYukler(List<Yuk> yukler) {
		this.yukler = yukler;
	}


	@Override
	public String toString() {
		return "YukAlani [id=" + id + ", yukler=" + yukler + "]";
	}
	
	


	
}
