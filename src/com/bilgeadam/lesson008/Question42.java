package com.bilgeadam.lesson008;
/*
 * 
 * 1 metot yazalım, bu metotta split kullanmadan mu ifadeyi her virgülden bölüp su çıktıyı elde edelim.
 * Java
 * React
 * Spring
 * Google
 */

public class Question42 {
	
	public static void main(String[] args) {
		
		String ifade = "Java,React,Spring,Google";
		
		ifadeAyir(ifade);
		
		ifadeAyir2(ifade);
		
		System.out.println(ifadeAyir3(ifade));
		
	}
	
	public static String ifadeAyir3(String ifade) {
		System.out.println("3. metot");
		
		ifade=ifade.replace(",", "\n");
		return ifade;
		
	}

	public static void ifadeAyir2(String ifade) {
		
		int index = 0;
		for (int i = 0; i < ifade.length(); i++) {
			
			if(ifade.charAt(i)==',') {
				System.out.println(ifade.substring(index,i));
				index = i+1;
			}
			
		}
		System.out.println(ifade.substring(index));
		
	}

	public static void ifadeAyir(String ifade) {
		
		for (int i = 0; i < ifade.length(); i++) {
			
			if(ifade.charAt(i)==',') {
				System.out.println();
			}else {
				System.out.print(ifade.charAt(i));
			}
			
		}
		System.out.println();
		
	}

}
