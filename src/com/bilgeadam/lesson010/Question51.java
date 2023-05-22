package com.bilgeadam.lesson010;

/*
 * bir metot yazalım bu metot çift boyutlu dizimizdeki tek sayıları başka bir diziye atsın.
 * 
 * daha sonra bu diziyi yazdıralım.
 * 
 * 
 */

public class Question51 {
	
	public static void main(String[] args) {
		
		int[][] matris = { 
				{ 56, 23, 678, 231, 5 }, 
				{ 234, 21, 78, 26, 6 }, 
				{ 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 } };
		
		arrayYazdir(arrayOlustur(matris));
	}
	
	public static int [] arrayOlustur(int [][] diziler) {
		
		
		int index =0;
		for (int i = 0; i < diziler.length; i++) {
			for (int j = 0; j < diziler[i].length; j++) {
				if(diziler[i][j] % 2 != 0) {
					index++;
				}
			}
		}
		int [] array = new int[index];
		index =0;
		for (int i = 0; i < diziler.length; i++) {
			for (int j = 0; j < diziler[i].length; j++) {
				if(diziler[i][j] % 2 != 0) {
					array[index]=diziler[i][j];
					index++;
				}
			}
		}
		
		return array;
	}
	
	public static void arrayYazdir (int [] array) {
		for(int deger : array) {
			System.out.println(deger);
		}
	}

}
