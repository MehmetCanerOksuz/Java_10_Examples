package com.bilgeadam.lesson014;

import java.util.Arrays;

public class Sepet {
	
	private EUrun[] urunler;
	private double totalPrice;
	
	public Sepet() {
		this.urunler = new EUrun[10];
	}

	public EUrun[] getUrunler() {
		return urunler;
	}

	public void setUrunler(EUrun[] urunler) {
		this.urunler = urunler;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Sepet [urunler=" + Arrays.toString(urunler) + ", totalPrice=" + totalPrice + "]";
	}
	
	

}
