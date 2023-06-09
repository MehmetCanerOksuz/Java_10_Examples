package com.bilgeadam.lesson023.trycatch;

public class InfinityExcepsion extends Exception{

	private String message;
	
	public InfinityExcepsion(String message) {
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
