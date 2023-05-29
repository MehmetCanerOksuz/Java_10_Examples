package com.bilgeadam.lesson019.stack;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Manager {
	
	Stack<Tabak> kirliler = new Stack<>();
	Stack<Tabak> temizler = new Stack<>();
	
	public void tabakOlustur() {
		
		for(int i =1 ; i<11; i++) {
			Tabak tabak = new Tabak(i, kirliMi());
			if(tabak.isKirliMi()){
				kirliler.push(tabak);
			}else {
				temizler.push(tabak);
			}
		}
	}
	
	
	public boolean kirliMi() {
		Random random = new Random();
		return random.nextBoolean();
	}
	
	public void temizle() {
		
		if(kirliler.isEmpty()) {
			System.out.println("Kirli tabak kalmamıştır");
			kullan();
		}else {
			Tabak tabak = kirliler.pop();
			tabak.setKirliMi(false);
			temizler.push(tabak);
			System.out.println(tabak.getId() + "id li tabak temizlenmiştir..");
		}
		
		
	}

	public void kullan() {
		if (temizler.isEmpty()) {
			System.out.println("Temiz tabak kalmamıştır..");
			temizle();
		}else {
			Tabak tabak = temizler.pop();
			tabak.setKirliMi(true);
			kirliler.push(tabak);
			System.out.println(tabak.getId() + "id li tabak kirlenmiştir..");
		}
		
	}
	
	public void secimYap(int secim) {
		
		
		System.out.println("1- Tabağı temizle..");
		System.out.println("2- Tabağı kullan..");
		System.out.println("Lütfen yapmak istediğiniz işlemi seciniz..");
		
		
		switch (secim) {
		case 1:
			temizle();
			break;
			
		case 2:
			kullan();
			break;

		default:
			System.out.println("Lütfen gecerli bir değer giriniz..");
			break;
		}
		
		
	}
	

}
