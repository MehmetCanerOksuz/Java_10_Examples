package com.bilgeadam.lesson026.limanuygulamasi.beraberyaptigimiz;

public enum ErrorType {
	
	DOLU_YER_SECIMI(1001,"Sectiginiz yer doludur"),
	SINIRLAR_DISINDA(1002, "Yaptıgınız secim sınırlar dısındadır"),
	YETERSIZ_AGIRLIK(1003,"100 un altinda bir agirlik olusturulamaz."),
	GECERSIZ_KABUL_TARIHI(1004,"Kabul tarihi gecmistir..!!"),
	MESAI_GUNLERI_DISI(1005,"Mesai gunlerimiz sadece Hafta icidir!!..")
	
	
	;

	private int code;
	private String message;
	
	
	private ErrorType( int code,String message) {
		this.code = code;
		this.message = message;
		
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getCode() {
		return code;
	}
	
}
