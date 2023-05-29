package com.bilgeadam.lesson017.benim;

public abstract class Arac {
	
	 private int hiz;
	 
	 public Arac() {
		super();
	}
	 
	 

	public Arac(int hiz) {
		super();
		this.hiz = hiz;
	}


	public int getHiz() {
		return hiz;
	}



	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	


	@Override
	public String toString() {
		return "Arac [hiz=" + hiz + "]";
	}



	public abstract void hizlan();
	 
	public abstract void yavasla();
	

	 
}
