package com.bilgeadam.lesson006;

public class Question37 {
	
	public static void main(String[] args) {
		
		String [] dizi = new String [4];
		dizi[0] = "Java";
		dizi[3] = "React";
		System.out.println(dizi[3]);
		String[] dizi2 = {"Mustafa", "Mert" };
		System.out.println(dizi2[1]);
		
		String[] dizi3;
		dizi3 = new String[2];
		dizi3[0] ="Caner";
		
		int[] dizi4 = new int [10];
		Integer[] dizi5 = new Integer[5];
		System.out.println(dizi4[0]);  // int  0
		System.out.println(dizi[1]);   // String null
		System.out.println(dizi5[1]);   // Integer null
		
		boolean[] dizi6 = new boolean[5];
		System.out.println(dizi6[0]);    // boolean  false
		dizi6[1] = true;
		for (int i = 0; i < dizi6.length; i++) {
			System.out.println(dizi6[i]);
			
		}
		
		
	}

}
