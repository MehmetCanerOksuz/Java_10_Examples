package com.bilgeadam.lesson019.stack;

import java.util.Stack;

/*
 * Lifo -->> son giren ilk çıkar
 * 
 * Integer bir stack oluşturup içine 6 7 tane deger ekleyelim
 * 100 den küçük olan degerlerin toplamını bulalım
 * 100 den buyuk olanları da baska bir stack yapısına aktaralım
 * daha sonra yeni stackimizi yazdıralım..
 * 
 * 
 */

public class StackOrnek {
	
	public static void main(String[] args) {
		
		
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> kucukstack = new Stack<>();
		
		stack.push(120);
		stack.push(320);
		stack.push(20);
		stack.push(50);
		stack.push(350);
		stack.push(5);
		stack.push(45);
		stack.push(450);
		
		int toplam = 0;
		
		while(!stack.isEmpty()) {
			int deger = stack.peek();        //pop() üsteki değere bakıp onu çıkartıyor..  // peek() sadece bakıyor..
			if(deger<100) {
				toplam+= stack.pop();
			}else {
				kucukstack.push(stack.pop());
			}
		}
		
		System.out.println("Toplam ==>>" + toplam);
		System.out.println(stack);
		
		for (Integer integer : kucukstack) {
			System.out.println(integer);
		}
		System.out.println("---------------While----------------");
		while(!kucukstack.isEmpty()) {
			System.out.println(kucukstack.pop());
		}
		
		System.out.println(kucukstack.size());
		

	}

}
