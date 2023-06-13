package com.bilgeadam.lesson027;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOrnek3 {

	public static void main(String[] args) {
		
		String path ="C:/java10-workspace/dosya/deneme3.txt";
		File file = new File(path);
		
		BufferedReader bufferedReader;
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter;
		
		try {
			//fileWriter = new FileWriter(path);
//			fileWriter = new FileWriter(file);
//			bufferedWriter = new BufferedWriter(fileWriter);
			
			bufferedWriter = new BufferedWriter(new FileWriter(file));
			bufferedWriter.write("Deneme2");
			bufferedWriter.write("Deneme3");
			bufferedWriter.newLine();
			bufferedWriter.write("Deneme4\n");
			bufferedWriter.write("Deneme5");
			bufferedWriter.append("xyz", 1, 2);  // girilenin 1 ile 2 arasındaki index ekledik... ==>>  y
			bufferedWriter.write("xyz", 1, 2);  // girilenin 1 den sonra 2 değer yazdırıyor..  ==>>  yz
			bufferedWriter.flush();    // Buffered toplayarak yazdığı için kapatınca yazıyor.. flush yapınca buraya kadar olanları yazdırıyor..
			bufferedWriter.write("Deneme6");
			
			bufferedReader = new BufferedReader(new FileReader(file));
			
//			System.out.println(bufferedReader.read()); // harf harf okuyor.
//			
//			System.out.println(bufferedReader.readLine());  // satır satır okuyor..
//			System.out.println(bufferedReader.readLine());  // satır olarak okurken ifade yoksa null dönüyor
//			System.out.println(bufferedReader.readLine());
			
			// birinci yöntem...
//			for (int i = 0; i < file.length(); i++) {
//				System.out.println((char)bufferedReader.read());
//			}
			
			String deger = null;
			while((deger = bufferedReader.readLine()) != null) {
				System.out.println(deger);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
//			try {
//				bufferedWriter.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
