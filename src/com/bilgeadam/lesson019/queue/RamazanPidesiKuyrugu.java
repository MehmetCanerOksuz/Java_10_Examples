package com.bilgeadam.lesson019.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 * String bir kuyruk olusturacagız
 * bir metot ile bu kuyruga 10 tane musteri ekleyelim..
 * 
 * daha sonra random 1 ile 12 arasında bir pide uretelim pide sayısı rastgele gelecek
 * 
 * daha sonra olusmus olan kuyruga pideleri dagıtalım
 * pide bittiginde pide kalmadı yazalım
 * 
 * ve daha sonra pide almayan varsa yazduralım..
 * 
 * 
 */

public class RamazanPidesiKuyrugu {
	
	public static void main(String[] args) {
				
		Queue<String> musteriler = new LinkedList<>();
		
		musteriEkle(musteriler);
		
		
		Random random = new Random();
		int pideSayisi = random.nextInt(1,13);
		System.out.println("Pide sayisi ==>> " + pideSayisi);
		
		for (int i = 0; i <pideSayisi; i++) {
			if(!musteriler.isEmpty()) {
				System.out.println(musteriler.poll()+"'e pide verildi.."); 
			}else {
				System.out.println("Kalan pide Sayısı = " +(pideSayisi-i));
				break;
			}
			
		}
		
		musteriler.forEach(musteri -> System.out.println("Kalan musteriler ==>>" + musteri));
		
	}
	
	public static void musteriEkle(Queue<String> musteriler) {
		
		for (int i = 0; i <10; i++) {
			musteriler.add("musteri"+(i+1));
		}
	}

}
