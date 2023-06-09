package com.bilgeadam.lesson021.movieappBeraber;

import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		FilmManager filmManager = new FilmManager();
		CastManager castManager = new CastManager();
		Yonetmen yonetmen = new Yonetmen("Miyazaki", null);
		
		castManager.kayitEt(yonetmen);
		
		Film film1 = new Film("Ruhların Kaçışı", List.of(ETur.ANIME,ETur.DRAMA),yonetmen);
		
		filmManager.kayitEt(film1);
	}

}
