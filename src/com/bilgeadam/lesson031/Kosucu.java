package com.bilgeadam.lesson031;

import java.util.Random;

public class Kosucu implements Runnable{
	
	private String isim;
	private int mesafe;
	private long sure;
	private long baslangıcZamani;
	
	public Kosucu(String isim,long baslangıcZamani) {
		super();
		this.isim = isim;
		this.baslangıcZamani = System.currentTimeMillis();
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getMesafe() {
		return mesafe;
	}

	public void setMesafe(int mesafe) {
		this.mesafe = mesafe;
	}

	public long getSure() {
		return sure;
	}

	public void setSure(long sure) {
		this.sure = sure;
	}

	public long getBaslangıcZamani() {
		return baslangıcZamani;
	}

	public void setBaslangıcSuresi(long baslangıcZamani) {
		this.baslangıcZamani = baslangıcZamani;
	}

	@Override
	public String toString() {
		return "Kosucu [isim=" + isim + ", mesafe=" + mesafe + ", sure=" + sure + ", baslangıcSuresi=" + baslangıcZamani
				+ "]";
	}
	
	@Override
	public void run() {

		Random random = new Random();
		long uyutma = random.nextInt(10);
		
		System.out.println(isim + "==>> " + baslangıcZamani);
		while (this.mesafe <100) {
			mesafe++;
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			if (mesafe%10==0) {
				System.out.println(isim + "==> " +mesafe+". metrede" );
			}
			
		}
		
		long bitis = System.nanoTime();
		sure = (bitis - baslangıcZamani);
		System.out.println("bitis ==>>" + bitis);
		System.out.println(isim + " adlı kosucu 100 metreyi " + sure + " milisaniyede kostu");
		
	}
	

}
