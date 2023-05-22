package com.bilgeadam.lesson008;
/*
 * 
 * 
 * bir dizide art arda gelen 2 indexdeki degerde 2 rakamı ise bize true dönen bir metot yazınız.
 */

public class Question44 {

	public static void main(String[] args) {

		int[] sayilar = { 1, 2, 4, 5, 8, 2, 2, 15 };
		System.out.println(ikiKontrol(sayilar));
		boolean kontrol = false;
		System.out.println(ikiKontrol(sayilar, kontrol));
	}
	
	public static boolean ikiKontrol(int [] dizi) {
		for (int i = 1; i < dizi.length; i++) {
			if(dizi[i]==2 && dizi[i-1] ==2) {
				return true;
			}
		}
		return false;
	}
	
	// method overLoading  ==> Aşırı yükleme
	
	public static boolean ikiKontrol(int [] dizi, boolean kontrol) {
		for (int i = 1; i < dizi.length; i++) {
			if(dizi[i]==2 && dizi[i-1] ==2) {
				kontrol = true;
				break;
			}else {
				kontrol = false;
			}
		}
		
		return kontrol;
	}

}
