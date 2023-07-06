package com.bilgeadam.lesson032.factory;

public class PostgreSql implements ILogger{

	@Override
	public void logToDatabase(String message) {
		System.out.println(message + "----> postgreSql'e loglandı");
		
	}

	
}
