package com.bilgeadam.lesson018;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
	
	public static void main(String[] args) {
		
		//
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		long baslangıc = System.nanoTime();
	
		
		for (int i = 0; i < 10000000; i++) {
			arrayList.add(i);
		}
		long bitis = System.nanoTime();
		
		long arraylistSuresi = bitis-baslangıc;
		
		baslangıc = System.nanoTime();

		
		for (int i = 0; i < 10000000; i++) {
			linkedList.add(i);
		}
		bitis = System.nanoTime();
		
		long linkedListSuresi = bitis-baslangıc;
		
		System.out.println("arraylist =====>>>>> "+arraylistSuresi);
		System.out.println("linkedList =====>>>> "+linkedListSuresi);
		
	}

}
