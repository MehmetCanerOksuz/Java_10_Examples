package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * Dairenin alanını ve çevresini hesaplayan bir progrem..
 * 
 * 
 */

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen Dairenin yarıçapını giriniz");
		
		double yariCap = scanner.nextDouble();
		
		double pi = 3.14;
		double daireAlanı = pi*yariCap*yariCap;
		double daireCevresi = 2*pi*yariCap;
		
//		System.out.println("daire alanı = " + daireAlanı);
//		System.out.println("daire çevresi = " + daireCevresi);
		
		System.out.println("Dairenin alanı = " + daireAlanı + "\nDairenin çevresi = " + daireCevresi);
		
	}
}
