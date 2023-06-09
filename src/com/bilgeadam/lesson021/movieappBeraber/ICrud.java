package com.bilgeadam.lesson021.movieappBeraber;

public interface ICrud <T> {
	
	void kayitEt(T t);
	
	void guncelle(T t);
	
	void sil(Long id);


}
