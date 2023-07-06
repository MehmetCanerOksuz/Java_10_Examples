package com.bilgeadam.lesson032.factory;
/*
 * Kullanıcıdan aldığım database ismine göre loglama yapacağım..
 * 
 * 
 */
public class App {
	
	public static void main(String[] args) {
		
		String dbName = Utility.stringDegerAlma("Lütfen database ismini giriniz.").toLowerCase();
		ILogger logger = DatabaseFactory.createDatabase(dbName);

//		switch (dbName) {
//		case "postgre":
//			logger = new PostgreSql();
//			break;
//
//		case "mongo":
//			logger = new MongoDb();
//			break;
//		default:
//			break;
//		}
		
		logger.logToDatabase("Log mesajı");
	}

}
