package com.bilgeadam.lesson030.threadgiris;

public class Test {
	
	public static void main(String[] args) {
		
		Calisan calisan1 = new Calisan("Caner");
		
		Calisan calisan2 = new Calisan("Aslı");
		
		calisan1.start();
		calisan2.start();
		
		calisan1.calis();
		calisan2.calis();
		

	}

}
