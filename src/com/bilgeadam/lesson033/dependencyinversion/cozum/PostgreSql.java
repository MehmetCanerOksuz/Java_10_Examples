package com.bilgeadam.lesson033.dependencyinversion.cozum;

public class PostgreSql implements ILogger{
	
	public void log(String ex) {
		System.out.println(ex + " ==>>> postgreye loglandı");
	}


}
