package com.bilgeadam.lesson013;

public class _04_StudentTest2 {
	
	public static void main(String[] args) {
		
		_02_Student student1 = _02_Student.kayitOl2();
		_02_Student student2 = new _02_Student();
		student2 = _02_Student.kayitOl2();
		_02_Student student3 = _02_Student.kayitOl2();
		
		System.out.println("Kayıtlı ögrenci sayısı ==>>" + _02_Student.index);
		System.out.println(student1.no);
		System.out.println(student2.no);
		System.out.println(student3.no);
	}

}
