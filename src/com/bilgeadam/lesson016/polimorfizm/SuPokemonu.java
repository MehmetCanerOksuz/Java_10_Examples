package com.bilgeadam.lesson016.polimorfizm;

public class SuPokemonu extends Pokemon{
	
	
	private int yuzmdeHizi;
	private int suBasıncGucu;
	

	
	public SuPokemonu(int id, String ad, int guc, int can, int seviye, int yuzmdeHizi, int suBasıncGucu) {
		super(id, ad, guc, can, seviye);
		this.yuzmdeHizi = yuzmdeHizi;
		this.suBasıncGucu = suBasıncGucu;
		setTur("Su");
	}
	
	public int getYuzmdeHizi() {
		return yuzmdeHizi;
	}
	public void setYuzmdeHizi(int yuzmdeHizi) {
		this.yuzmdeHizi = yuzmdeHizi;
	}
	public int getSuBasıncGucu() {
		return suBasıncGucu;
	}
	public void setSuBasıncGucu(int suBasıncGucu) {
		this.suBasıncGucu = suBasıncGucu;
	}
	
	@Override
	public void saldir() {
		System.out.println(getAd()+" adlı pokemon su saldırısı yapıyor.");
		
	}
	
	@Override
	public void pokedex() {
		super.pokedex();
		System.out.println("yüzme hızı => " + yuzmdeHizi);
		System.out.println("Su Basıncı Gücü => " + suBasıncGucu);
	}

}
