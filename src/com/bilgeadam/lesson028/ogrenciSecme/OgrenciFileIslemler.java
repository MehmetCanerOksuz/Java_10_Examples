package com.bilgeadam.lesson028.ogrenciSecme;

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

public class OgrenciFileIslemler {

	List<String> ogrenciList;
	File file;
	FileReader fileReader;
	BufferedReader bufferedReader;
	BufferedWriter bufferedWriter;

	public OgrenciFileIslemler() {
		this.ogrenciList = new ArrayList<>();
	}

	public void dosyadanVerileriListeyeEkleme(String dosyaYolu) {

		try {
			bufferedReader = new BufferedReader(new FileReader(new File(dosyaYolu)));

			String deger;
			while ((deger = bufferedReader.readLine()) != null) {
				ogrenciList.add(deger);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void dosyayaListeyiYazdırma(String path) {

		try {
			bufferedWriter = new BufferedWriter(new FileWriter(new File(path)));
			for (int i = 0; i < ogrenciList.size(); i++) {
				if (i != ogrenciList.size() - 1) {
					bufferedWriter.write(ogrenciList.get(i));
					bufferedWriter.newLine();
				} else {
					bufferedWriter.write(ogrenciList.get(i));
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public int ogrenciSec() {
		Random random = new Random();
		return random.nextInt(ogrenciList.size());
	}
	
	public void secilenOgrenciyiDosyayaYazdir(String dosyaYolu, int index) {
		
			try {
				bufferedWriter = new BufferedWriter(new FileWriter(dosyaYolu,true));
				bufferedWriter.write(ogrenciList.get(index));
				bufferedWriter.newLine();
				System.out.println(ogrenciList.get(index));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		
	}
}
