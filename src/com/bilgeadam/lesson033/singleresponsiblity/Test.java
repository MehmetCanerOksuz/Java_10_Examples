package com.bilgeadam.lesson033.singleresponsiblity;

import com.bilgeadam.lesson033.utility.User;

public class Test {
	
	public static void main(String[] args) {
		
		Instagram instagram = new Instagram();
		User user1 = new User("Caner", "caner@gmail.com");
		User user2 = new User("Caner", "caner@gmail.com", "555-555-555");
		
		instagram.sendNotification(user1);
		System.out.println("-----------------------------");
		instagram.sendNotification(user2);
		
		instagram.sendEmail(user2);
		instagram.sendSms(user2);
	}

}
