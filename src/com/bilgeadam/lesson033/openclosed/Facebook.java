package com.bilgeadam.lesson033.openclosed;

import com.bilgeadam.lesson033.utility.Notification;
import com.bilgeadam.lesson033.utility.User;

public class Facebook extends SocialMedia{

	@Override
	public void changeScaleRatio(String type) {
		
		if(type.equals("jpg")) {
			setSclaeRatio(34);
		}else if(type.equals("png")) {
			setSclaeRatio(37);
		}else {
			setSclaeRatio(45);
		}
		
	}
	

	
}
