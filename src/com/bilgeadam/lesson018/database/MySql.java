package com.bilgeadam.lesson018.database;

public class MySql implements IDatabase{

	@Override
	public void veriEkle() {
		System.out.println("MySql veritabanına veri eklendi");
		System.out.println("---------------------------------");
		
	}

	@Override
	public void veriSil() {
		System.out.println("MySql veritabanından veri silindi");
		System.out.println("---------------------------------");
		
	}

	@Override
	public void veriGuncelle() {
		System.out.println("MySql veritabanındaki veriler güncellendi");
		System.out.println("---------------------------------");
		
	}

	@Override
	public void veriGetir() {
		System.out.println("MySql veritabanından veri getirildi");
		System.out.println("---------------------------------");
		
	}

	@Override
	public void login() {
		System.out.println("MySql veritabanına login olundu.");
		System.out.println("---------------------------------");
		
	}

}
