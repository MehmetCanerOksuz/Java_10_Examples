package com.bilgeadam.lesson019.set;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

/*
 * dışarıdan bir kelime girelim her harfini bir sete atmak istiyoruz
 * tekrar edenleri bir sete, tekrar etmeyenleri başka bir sete atalım..
 * sonra tekrar eden ve etmeyen setlerini yazdıralım
 * 
 * 
 */

public class SetOrnek2 {
	

	public static void main(String[] args) {
		
		Set<Character> tekrarEden = new LinkedHashSet<>();
		Set<Character> tekrarEtmeyen = new LinkedHashSet<>();
		SetOrnek2 ornek = new SetOrnek2();
		
		ornek.kontrolEtme("DENEMEEEE");
		String kelime="JAVAA";
		
		for(int i = 0; i<kelime.length();i++) {
			if(!tekrarEden.contains(kelime.charAt(i))&& !tekrarEtmeyen.add(kelime.charAt(i))) {
				tekrarEden.add(kelime.charAt(i));
				tekrarEtmeyen.remove(kelime.charAt(i));
			}
		}
		
		System.out.println("Tekrar EDEN" + tekrarEden);
		System.out.println("Tekrar ETMEYEN" + tekrarEtmeyen);
		
		
		
		
	}
	
	public void kontrolEtme(String ifade) {
		Set<Character> tekrarEden = new LinkedHashSet<>();
		Set<Character> tekrarEtmeyen = new LinkedHashSet<>();
		String ifade2 = null;
		for (int i = 0; i < ifade.length(); i++) {
			if(!tekrarEtmeyen.contains(ifade.charAt(i))) {
				tekrarEtmeyen.add(ifade.charAt(i));
			}else {
				tekrarEden.add(ifade.charAt(i));
			}
		}
		
		for (Character character : tekrarEden) {
			
			ifade2 += character.toString();
			
		}
		
		for (int i = 0; i < ifade2.length(); i++) {
			if(tekrarEtmeyen.contains(ifade2.charAt(i))) {
				tekrarEtmeyen.remove(ifade2.charAt(i));
			}
		}
		
		
		
		
		System.out.println(tekrarEden);
		System.out.println(tekrarEtmeyen);
		
	}
	
	
	
	

}
