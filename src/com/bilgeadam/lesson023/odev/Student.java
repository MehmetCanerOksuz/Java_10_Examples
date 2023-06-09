package com.bilgeadam.lesson023.odev;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
	int id;
	String durum;
	String bolum;
	String name;
	List<Double> notlar = new ArrayList<>();

	public double ortHesapla() {

		return notlar.stream().mapToDouble(x->x.doubleValue()).sum()/notlar.size();

	}
	public double ortHesapla2() {

		return notlar.stream().collect(Collectors.averagingDouble(y->y));

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", durum=" + durum + ", bolum=" + bolum + ", name=" + name + ", notlar=" + notlar
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Double> getNotlar() {
		return notlar;
	}

	public void setNotlar(List<Double> notlar) {
		this.notlar = notlar;
	}

}