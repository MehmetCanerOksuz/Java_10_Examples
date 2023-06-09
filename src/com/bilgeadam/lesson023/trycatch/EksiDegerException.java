package com.bilgeadam.lesson023.trycatch;

public class EksiDegerException extends RuntimeException{
	
	
	//RuntimeException dan aldığımız için unchekked  
	// try catch e almak zorunda değiliz...
	
	
	private String message;
	
	public EksiDegerException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
