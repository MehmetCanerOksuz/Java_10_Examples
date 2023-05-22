package com.bilgeadam.lesson005;

import java.util.Scanner;

// Burc Bulma

public class Question27 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean kontrol = false;

		do {

			kontrol = false;

			System.out.println("Lütfen dogdugunuz günün ayın kacıncı günü oldugunu giriniz");
			int gun = scanner.nextInt();
			System.out.println("Lütfen dogdugunuz ayın yılın kacıncı günü oldugunu giriniz");
			int ay = scanner.nextInt();

			switch (ay) {
			case 1:

				if (gun > 31 || gun < 1) {
					System.out.println("Ocak ayı için 1-31 arası");
					kontrol = true;
				} else if (gun <= 21) {
					System.out.println("Oğlak");
				} else {
					System.out.println("Kova");
				}

				break;
			case 2:

				if (gun > 29 || gun < 1) {
					System.out.println("Şubat ayı için 1-29 arası");
					kontrol = true;
				} else if (gun <= 19) {
					System.out.println("Kova");
				} else {
					System.out.println("Balık");
				}

				break;
			case 3:

				if (gun > 31 || gun < 1) {
					System.out.println("Mart ayı için 1-31 arası");
					kontrol = true;
				} else if (gun <= 20) {
					System.out.println("Balık");
				} else {
					System.out.println("Koç");
				}

				break;
			case 4:

				if (gun > 30 || gun < 1) {
					System.out.println("Nisan ayı için 1-30 arası");
					kontrol = true;
				} else if (gun <= 21) {
					System.out.println("Koç");
				} else {
					System.out.println("Boğa");
				}

				break;
			case 5:

				if (gun > 31 || gun < 1) {
					System.out.println("Mayıs ayı için 1-31 arası");
					kontrol = true;
				} else if (gun <= 21) {
					System.out.println("Boğa");
				} else {
					System.out.println("İkizler");
				}

				break;
			case 6:

				if (gun > 30 || gun < 1) {
					System.out.println("Haziran ayı için 1-31 arası");
					kontrol = true;
				} else if (gun <= 22) {
					System.out.println("İkizler");
				} else {
					System.out.println("Yengeç");
				}

				break;
			case 7:

				if (gun > 31 || gun < 1) {
					System.out.println("Temmuz ayı için 1-31 arası");
					kontrol = true;
				} else if (gun <= 22) {
					System.out.println("Yengeç");
				} else {
					System.out.println("Aslan");
				}

				break;
			case 8:

				if (gun > 31 || gun < 1) {
					System.out.println("Ağustos ayı için 1-31 arası");
					kontrol = true;
				} else if (gun <= 22) {
					System.out.println("Aslan");
				} else {
					System.out.println("Başak");
				}

				break;
			case 9:

				if (gun > 30 || gun < 1) {
					System.out.println("Eylül ayı için 1-30 arası");
					kontrol = true;
				} else if (gun <= 22) {
					System.out.println("Başak");
				} else {
					System.out.println("Terazi");
				}

				break;
			case 10:

				if (gun > 31 || gun < 1) {
					System.out.println("Ekim ayı için 1-31 arası");
					kontrol = true;
				} else if (gun <= 22) {
					System.out.println("Terazi");
				} else {
					System.out.println("Akrep");
				}

				break;
			case 11:

				if (gun > 30 || gun < 1) {
					System.out.println("Kasım ayı için 1-30 arası");
					kontrol = true;
				} else if (gun <= 21) {
					System.out.println("Akrep");
				} else {
					System.out.println("Yay");
				}

				break;
			case 12:

				if (gun > 31 || gun < 1) {
					System.out.println("Aralık ayı için 1-31 arası");
					kontrol = true;
				} else if (gun <= 21) {
					System.out.println("Yay");
				} else {
					System.out.println("Oğlak");
				}

				break;

			default:
				System.out.println("Bir yılda 12 ay vardır. Lütfen 1-12 arasında giriniz");
				kontrol = true;
				break;
			}

		} while (kontrol);

	}

}
