package com.bilgeadam.lesson022.movieappBeraber;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Test {
	
	public static void main(String[] args) {
		
		Manager<Film,String> managerFilm = new Manager<>();
		
		Manager<Cast,Long> managerCast = new Manager<>();
		
		Yonetmen yonetmen = new Yonetmen("Miyazaki", null);
		
		managerCast.kayitEt(Database.casts,yonetmen);
		
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);
		String id = UUID.randomUUID().toString();
		System.out.println(id);
		
		managerCast.sil(1L);
		managerFilm.sil("sss");
		
		Film film1 = new Film("Ruhların Kaçışı", List.of(ETur.ANIME,ETur.DRAMA),yonetmen);
		
		managerFilm.kayitEt(Database.filmList,film1);
		
		List<Film> list = new ArrayList<>();
		
		listeyeEkle(list, film1);
		System.out.println(list.get(0));
		
		
	}
	
	
	public static <T> void listeyeEkle(List<T> list, T t) {
		list.add(t);
	}

}
