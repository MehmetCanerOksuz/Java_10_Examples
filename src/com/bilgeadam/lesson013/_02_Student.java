package com.bilgeadam.lesson013;

import java.util.Scanner;

/*
 * öğrencinin bir numarası bir ismi olsun
 * daha sonra kayıt metodu yazalım
 * Mustafa adlı öğrenci başarı ile kayıt edildi öğrenci numaraso 1
 * Serkan adlı öğrenci başarı ile kayıt edildi öğrenci numaraso 2
 */

public class _02_Student {

	String name;
	static int index;
	int no;
	
	public void kayitOl() {
		index++;
		no = index;
		System.out.println("==============");
		System.out.println(name + " adli ogrenci başarı ile kayıt oldu.");
		System.err.println("Ogrenci numarası =>" + no);
		System.out.println("==============");
	}
	
	public static _02_Student kayitOl2() {
		index++;
		_02_Student student = new _02_Student();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen ogrenci ismi giriniz");
		student.name = scanner.nextLine();
		student.no = index;
		System.out.println("==============");
		System.out.println(student.name + " adli ogrenci başarı ile kayıt oldu.");
		System.err.println("Ogrenci numarası =>" + student.no);
		System.out.println("==============");
		
		return student;
	}
	
	
}