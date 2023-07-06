package com.bilgeadam.lesson033.liskovsusbstition;

import com.bilgeadam.lesson033.utility.User;

public class Test {
	
	public static void main(String[] args) {
		
		User user = new User("Caner", "caner@gmail.com");
		
		Facebook facebook = new Facebook();
		
		facebook.sendEmail(user);
	}

}
