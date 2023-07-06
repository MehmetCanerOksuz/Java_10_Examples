package com.bilgeadam.lesson033.dependencyinversion.cozum;

public class MongoDb implements ILogger{
	
	public void log(String ex) {
		System.out.println(ex + " ==>>> mongoya loglandı");
	}

}
