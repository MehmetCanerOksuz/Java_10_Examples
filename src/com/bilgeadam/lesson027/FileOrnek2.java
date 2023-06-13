package com.bilgeadam.lesson027;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOrnek2 {
	
	List<Integer> icerik = new ArrayList<>();
	
	public static void main(String[] args) {
		
		FileOrnek2 fileOrnek2 = new FileOrnek2();
		//fileOrnek2.dosyadanVeriOkuma("C:/java10-workspace/dosya/deneme.txt");
		fileOrnek2.dosyadanVeriOkuma("C:/java10-workspace/dosya/2.png");
		fileOrnek2.dosyayaVeriYazdırma("C:/java10-workspace/dosya/kopya.txt");
		fileOrnek2.dosyayaVeriYazdırma("C:/java10-workspace/dosya/kopya1.jpg");
		fileOrnek2.dosyayaVeriYazdırma("C:/java10-workspace/dosya/kopya2.jpg");
		fileOrnek2.dosyayaVeriYazdırma("C:/java10-workspace/dosya/kopya3.png");
		
		
	}
	
	
	public void dosyadanVeriOkuma(String dosyaYolu) {
		

		FileInputStream fis = null;
		

		try {
			fis = new FileInputStream(dosyaYolu);
			
			int deger;
			while((deger=fis.read()) != -1) {
				System.out.print((char)deger);
				icerik.add(deger);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void dosyayaVeriYazdırma(String dosyaYolu) {
		
		FileOutputStream fos=null;
		
		try {
			fos = new FileOutputStream(dosyaYolu);
			
			for (Integer integer : icerik) {
				fos.write(integer);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




}
