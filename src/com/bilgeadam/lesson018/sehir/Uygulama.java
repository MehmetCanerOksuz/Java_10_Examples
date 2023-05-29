package com.bilgeadam.lesson018.sehir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
 * sehir sınıfında isim plaka ve nufus degerlerimiz olsun
 * plaka kodu uret diye bir metot 01,02,03,... 09,10..
 * rastgele nufus olustur diye bir metot yazalım
 * 
 * uygulama sınıfında bir sehir listesi olusturacağız
 * bir sehirleri olustur metodu ile String arrayden gelen verileri sehir nesnesine cevirip
 * sehirler nesnesine ekleyecceğiz.
 * 
 * 
 */

public class Uygulama {
	
	ArrayList<Sehir> sehirler;
	
	
	
	public Uygulama() {
		this.sehirler = new ArrayList<>();
	}



	public void sehirOlustur() {
		
		for (int i = 0; i < SehirDatabase.iller.length; i++) {
		Sehir sehir =new Sehir(SehirDatabase.iller[i]);
		sehir.plakaKoduUret(i+1);
		sehirler.add(sehir);
		}

	}
	
	public static void main(String[] args) {
		Uygulama uygulama = new Uygulama();
		uygulama.sehirOlustur();
		System.out.println(uygulama.sehirler);
		
		Comparator<Sehir> comparatorNufus = new Comparator<Sehir>() {

			@Override
			public int compare(Sehir o1, Sehir o2) {
				
				return (int) (o1.getNufus()-o2.getNufus());
			}
		};
		
		Collections.sort(uygulama.sehirler,comparatorNufus);   // nüfusa göre sıraladık...
		for (Sehir sehir : uygulama.sehirler) {
			System.out.println(sehir);
		}
		
		Collections.shuffle(uygulama.sehirler);    // karıştırma...
		for (Sehir sehir : uygulama.sehirler) {
			System.out.println(sehir);
		}
		
		
		Comparator<Sehir> comparatorisim = new Comparator<Sehir>() {

			@Override
			public int compare(Sehir o1, Sehir o2) {
				
				return o1.getIsim().compareTo(o2.getIsim());
			}
		};
		
		Collections.sort(uygulama.sehirler,comparatorisim);

		for (Sehir sehir : uygulama.sehirler) {
			System.out.println(sehir);
		}
	}

}
