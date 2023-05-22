package com.bilgeadam.lesson013;

public class _03_StudentTest {

	public static void main(String[] args) {
		
		_02_Student student1 = new _02_Student();
		student1.name = "Caner";
		student1.kayitOl();
		
		_02_Student student2 = new _02_Student();
		student2.name = "Mehmet";
		student2.kayitOl();
		
		_02_Student student3= new _02_Student();
		student3.name = "Hilal";
		student3.kayitOl();
		
		_02_Student student4= new _02_Student();
		student4.name = "Mustafa";
		student4.kayitOl();
		
		System.out.println(student1.no);
		System.out.println(student2.no);
		System.out.println(student3.no);
		System.out.println(student4.no);
	}
}
