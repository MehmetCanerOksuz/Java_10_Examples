package com.bilgeadam.lesson010;

/*
 * Carpım tablosunu bir arrayin içine toplayacağız.
 * 1 ile 10 arası sayilar için geçerli.
 * 1x1 =1
 * 1x2=2
 * .
 * .
 * 1x10=10
 * 
 * 2x1=1
 * ...
 * 
 */

public class Question50 {
	
	public static void main(String[] args) {
		
		carpimTablosuYazdir(carpimTablosuOlustur());
		
	}
	
	public static String[][] carpimTablosuOlustur() {
		
		String array [][] = new String [10] [10];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j]= (i+1) + "x" + (j+1) +" = " + ( (i+1)*(j+1)) ;
			}
		}
		return array;
	}
	
	public static void carpimTablosuYazdir(String[][] array) {
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				System.out.println(array[i][j]);
//			}
//		}
		
		for(String [] icArray : array ) {
			for (String deger : icArray) {
				System.out.println(deger);
			}
		}
	}
	

}
