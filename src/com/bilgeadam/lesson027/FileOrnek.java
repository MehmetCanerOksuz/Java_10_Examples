package com.bilgeadam.lesson027;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 * output --> yazma işlemi
 * input --> okuma işlemleri
 * 
 * 
 */

public class FileOrnek {

	public static void main(String[] args) {
		
		File file = new File("C:/java10-workspace/dosya/deneme2.txt");
//		
//		try {
//			file.createNewFile();
//			System.out.println(file.getName() + " olusturuldu");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		FileOutputStream fos=null;
		FileInputStream fis=null;
		
		try {
//			
//			FileWriter fileWriter = new FileWriter("C:/java10-workspace/dosya/deneme.txt");
//			FileReader fileReader = new FileReader("C:/java10-workspace/dosya/deneme.txt");
			
			fos = new FileOutputStream("C:/java10-workspace/dosya/deneme.txt", false);// true degeri -->> 
			                                                                                           //var olana ekleyerek yazıyor..!
			//FileOutputStream fos2 = new FileOutputStream(file);
			
			
			
			
			fos.write(66);  // karakter olarak yazdırır..
			fos.write(69);
			byte[] array = {101,80,85,66};
			fos.write(array);
			String kelime = "\njava";
			fos.write(kelime.getBytes());

			
			//====OKUMA İSLEMLERİ====
			
			fis = new FileInputStream("C:/java10-workspace/dosya/deneme.txt");
//			int deger = fis.read();
//			System.out.println((char) deger);
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println(fis.read());
			
			int deger;
			
			while((deger =fis.read()) != -1) {
				System.out.print((char) deger);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
