package com.bilgeadam.lesson018.beraber;

public class Oracle extends IDatabase{
	
	@Override
	public void veriEkle() {
		System.out.println("Oracle veri eklendi");
		
	}

	@Override
	public void veriSil() {
		System.out.println("Oracle veri silindi");
		
	}

	@Override
	public void veriGüncelle() {
		System.out.println("Oracle veri güncellendi");
		
	}

	@Override
	public void verileriGetir() {
		System.out.println("Oracle veriler getirildi");
		
	}

	@Override
	public void login() {
		System.out.println("Oracle'a giriş yapıldı");
		
	}

}
