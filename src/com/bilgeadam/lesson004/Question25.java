package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question25 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String boyut = scanner.nextLine();
		
		switch (boyut) {
		case "S":
			System.out.println("Küçük boy Pizza seçtiniz");
			break;
		case "M":
			System.out.println("Orta boy Pizza seçtiniz");
			break;
		case "L":
			System.out.println("Büyük boy Pizza seçtiniz");
			break;
		case "XL":
			System.out.println("Extra Büyük boy Pizza seçtiniz");
			break;

		default:
			System.out.println("Yanlış bir secim yaptınız. Lütfen S/M/L/XL değerlerinden birini seciniz.");
			break;
		}
	}

}
