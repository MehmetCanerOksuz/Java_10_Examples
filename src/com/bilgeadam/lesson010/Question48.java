package com.bilgeadam.lesson010;

/*
 * 1 metot yazavağız bu metot bize bu arayde 1 ve 4 un kaç kere geçtiğini söyleyecek.
 * ayrıca 1 sayısının adeti 4 ten büyük ise true değil ise false dönsün
 * 
 */

public class Question48 {

	public static void main(String[] args) {

		int[] sayilar = { 1, 4, 5, 6, 1, 1, 4, 8, };
		
		birVeDort(sayilar);

	}

	public static boolean birVeDort(int[] sayilar) {

		int birSay =0;
		int dortSay =0;
		boolean kontrol = false;
		for (int i = 0; i < sayilar.length; i++) {
			
			if (sayilar[i] == 1) {
				birSay++;
			}else if (sayilar[i] ==4) {
				dortSay++;
			}
		}
		if(birSay>dortSay) {
			kontrol = true;
		}
		
		System.out.println("1 sayısı => " + birSay +" kadar geçiyor.");
		System.out.println("4 sayısı => " + dortSay +" kadar geçiyor.");
		System.out.println(kontrol);
		return kontrol;
		
	}

}
