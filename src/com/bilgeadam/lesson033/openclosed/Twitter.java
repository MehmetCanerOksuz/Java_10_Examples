package com.bilgeadam.lesson033.openclosed;

public class Twitter extends SocialMedia{

	@Override
	public void changeScaleRatio(String type) {
		
		if(type.equals("jpg")) {
			setSclaeRatio(31);
		}else if(type.equals("png")) {
			setSclaeRatio(35);
		}else {
			setSclaeRatio(41);
		}
		
	}

}
