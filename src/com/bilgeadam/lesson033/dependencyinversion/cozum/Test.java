package com.bilgeadam.lesson033.dependencyinversion.cozum;

import com.bilgeadam.lesson033.dependencyinversion.exception.StoryException;
import com.bilgeadam.lesson033.dependencyinversion.socialmedia.WhatsApp;

public class Test {
	
	public static void main(String[] args) {
		
		WhatsApp whatsApp = new WhatsApp();
		DatabaseLogger databaseLogger = null;
		
		try {
			whatsApp.videoConferancing();
		} catch (Exception e) {
			new DatabaseLogger(new MongoDb()).logToDatabase(e.toString());
		}
		
		try {
			whatsApp.shareStory();
		}catch (StoryException e) {
			PostgreSql postgreSql = new PostgreSql();
			databaseLogger = new DatabaseLogger(postgreSql);
			databaseLogger.logToDatabase(e.toString());
		}
		
	}

}
