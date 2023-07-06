package com.bilgeadam.lesson033.dependencyinversion.cozum;

public class DatabaseLogger {
	
	ILogger database;

	public DatabaseLogger(ILogger database) {
		this.database = database;
	}
	
	public void logToDatabase(String ex) {
		
		database.log(ex);
	}
	
}
