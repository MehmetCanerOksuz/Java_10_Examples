package com.bilgeadam.lesson018.database;

public class Oracle implements IDatabase{

	@Override
	public void veriEkle() {
		System.out.println("Oracle veritabanına veri eklendi");
		System.out.println("---------------------------------");
		
	}

	@Override
	public void veriSil() {
		System.out.println("Oracle veritabanından veri silindi");
		System.out.println("---------------------------------");
		
	}

	@Override
	public void veriGuncelle() {
		System.out.println("Oracle veritabanındaki veriler güncellendi");
		System.out.println("---------------------------------");
		
	}

	@Override
	public void veriGetir() {
		System.out.println("Oracle veritabanından veri getirildi");
		System.out.println("---------------------------------");
		
	}

	@Override
	public void login() {
		System.out.println("Oracle veritabanına login olundu.");
		System.out.println("---------------------------------");
		
	}


}
