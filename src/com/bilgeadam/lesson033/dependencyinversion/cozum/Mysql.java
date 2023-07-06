package com.bilgeadam.lesson033.dependencyinversion.cozum;

public class Mysql implements ILogger{

	public void log(String ex) {
		System.out.println(ex + " ==>>> Mysql e loglandı");
	}
}
