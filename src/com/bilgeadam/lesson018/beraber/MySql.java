package com.bilgeadam.lesson018.beraber;

public class MySql extends IDatabase{

	@Override
	public void veriEkle() {
		System.out.println("MySql veri eklendi");
		
	}

	@Override
	public void veriSil() {
		System.out.println("MySql veri silindi");
		
	}

	@Override
	public void veriGüncelle() {
		System.out.println("MySql veri güncellendi");
		
	}

	@Override
	public void verileriGetir() {
		System.out.println("MySql veriler getirildi");
		
	}

	@Override
	public void login() {
		System.out.println("MySql'e giriş yapıldı");
		
	}

}
