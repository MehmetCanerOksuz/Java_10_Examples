package com.bilgeadam.lesson028.ogrenciSecme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) {
		
		File file = new File(FileSabitler.OGRENCI_LIST_FILE_COPY);
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		File file2 = new File("C:/java10-workspace/dosya/yeni.dat");
		
//		try {
//			System.out.println(file2.createNewFile());
//		}catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//		System.out.println(file2.delete());
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getParent());
		System.out.println(file.isDirectory());
		System.out.println(file.lastModified());
	//	System.out.println(file2.mkdirs());
		System.out.println(file.length());
	

	}

}
