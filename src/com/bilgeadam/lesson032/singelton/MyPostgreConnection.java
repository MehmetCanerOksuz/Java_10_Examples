package com.bilgeadam.lesson032.singelton;
/*
 * Singelton yapısında bir Sınıf oluşturmak için gerekli adımlar
 * 
 * 1 - const. ==>> private olacak yeni bir nesne new lememize izin verilmeyecek..
 * 2 - sınıf içinde kendi referansında private static bir değişken tutacağız
 * 3- Static bir getInstance() metodu oluşturuyoruz.. İçerisinde sınıf içinde tanımladığımız
 * instance değişkeninin null olup olmadığını kontrol ediyoruz.. Eğer null ise new leme işlemini yapıyoruz..
 * ve metod sonunda yeni olusturduğumuz instance i geri dönüyoruz. Eğer null değilse zaten daha önce oluşturulmuştur..
 * Biz de daha önce olusturulmuş olan instance i geri dönüyoruz..
 * 
 */

public class MyPostgreConnection {

	private static MyPostgreConnection instance;
	
	private MyPostgreConnection() {
		
	}
	
	public static MyPostgreConnection getInstance() {
		
		if(instance ==null) {
			instance = new MyPostgreConnection();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "MyPostgreConnection [hashCode()=" + hashCode() + "]";
	}
	
	
	
}
