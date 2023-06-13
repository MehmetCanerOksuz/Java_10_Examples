package com.bilgeadam.lesson027.fileodev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileOdev {

	public static void main(String[] args) {
		
		FileOdev fileOdev = new FileOdev();
//		fileOdev.dosyadanVerileriListeyeEkleme();
		
		String kopyaList = "C:/java10-workspace/dosya/kopya1ogrencilistesi.txt";
		
		fileOdev.dosyayaListeyiYazdırma(fileOdev.dosyadanVerileriListeyeEkleme("C:/java10-workspace/dosya/ogrencilistesi.txt"),kopyaList);
		
		
		List<String> list = fileOdev.dosyadanVerileriListeyeEkleme("C:/java10-workspace/dosya/kopya1ogrencilistesi.txt");
		int index= fileOdev.listedenRastgeleIndex(list);
		System.out.println(index);
		String ismiAlinanlarPath = "C:/java10-workspace/dosya/ismiAlinanlar.txt";
		fileOdev.ismiAlinanOgrenciYeniListeyeYazdırma(list, index, ismiAlinanlarPath);
		
		fileOdev.guncelOgrenciListesiYazdırma(list, index, kopyaList);
		
	}

	public List<String> dosyadanVerileriListeyeEkleme(String path) {
		List<String> icerik = new ArrayList<>();
		try {
			BufferedReader bufferedReader =new BufferedReader(new FileReader(new File(path)));
			
			String deger;
			while((deger = bufferedReader.readLine())!= null) {
				icerik.add(deger);
				System.out.println(deger);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return icerik;
	}
	
	public void dosyayaListeyiYazdırma(List<String> list,String path) {
		
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(path)));
			for (int i = 0; i < list.size(); i++) {
				if(i!= list.size()-1) {
					bufferedWriter.write(list.get(i));
					bufferedWriter.newLine();
				}else {
					bufferedWriter.write(list.get(i));
				}
			}
			
			bufferedWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public int listedenRastgeleIndex(List<String> list) {
		Random random = new Random();
		
		return random.nextInt(list.size());
	}
	
	public void ismiAlinanOgrenciYeniListeyeYazdırma(List<String> list, int index, String path) {
		
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(path)));
			bufferedWriter.write(list.get(index));
			bufferedWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void guncelOgrenciListesiYazdırma(List<String> list, int index, String path) {
		
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(path)));
			list.remove(index);
			
			for (int i = 0; i < list.size(); i++) {
				if(i!= list.size()-1) {
					bufferedWriter.write(list.get(i));
					bufferedWriter.newLine();
				}else {
					bufferedWriter.write(list.get(i));
				}
			}
			bufferedWriter.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
