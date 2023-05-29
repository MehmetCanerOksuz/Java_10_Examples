package com.bilgeadam.lesson019.queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
	
	public static void main(String[] args) {
		
		Queue<Integer> kuyruk1 = new LinkedList<>();
		Queue<Integer> kuyruk2 = new ArrayBlockingQueue(5);
		
		
		
		
		
		///// Öncelikli Kuyruk....
		
		System.out.println("====öncelikli Kuyruk====");
		Queue<Integer> kuyruk4 = new PriorityQueue<>();
		
		kuyruk4.offer(50);
		kuyruk4.offer(30);
		kuyruk4.offer(80);
		kuyruk4.offer(20);
		kuyruk4.offer(90);
		System.out.println(kuyruk4.peek());
		
		System.out.println("for each yazdırımı");
		for(Integer integer : kuyruk4) {
			System.out.println(integer);
		}
		
		System.out.println("while - sıra ile yazdırma..");
		while(!kuyruk4.isEmpty()) {
			System.out.println(kuyruk4.poll());
		}
		
		
		
		Queue<Musteri> musteriler = new PriorityQueue<>();
		
		musteriler.offer(new Musteri("Mustafa",35));
		musteriler.offer(new Musteri("Kemal",65));
		musteriler.offer(new Musteri("Ece",15));
		musteriler.offer(new Musteri("Tuba",25));
		
		// Müşteriler sınıfında yas a göre küçükten büyüğe sıraladık..
		while(!musteriler.isEmpty()) {
			System.out.println(musteriler.poll());
		}
		
		
		Comparator<Musteri2> comparatorYas = new Comparator<Musteri2>() {

			// yaslar esit ise harf e göre sırala..
			@Override
			public int compare(Musteri2 o1, Musteri2 o2) {
				if(o1.yas - o2.yas ==0) {
					return o1.isim.compareTo(o2.isim);
				}else {
					return o1.yas - o2.yas;
				}
				
				
			}
		};
		
		Comparator<Musteri2> comparatorIsim = new Comparator<Musteri2>() {

			@Override
			public int compare(Musteri2 o1, Musteri2 o2) {
				
				return o1.isim.compareTo(o2.isim);
			}
		};
		
		Queue<Musteri2> musteriler2 = new PriorityQueue<>(comparatorIsim);
		
		musteriler2.offer(new Musteri2("Mustafa",35));
		musteriler2.offer(new Musteri2("Kemal",65));
		musteriler2.offer(new Musteri2("Ece",15));
		musteriler2.offer(new Musteri2("Tuba",25));
		
		while(!musteriler2.isEmpty()) {
			System.out.println(musteriler2.poll());
		}
		
		

	}
	

	
	

}
