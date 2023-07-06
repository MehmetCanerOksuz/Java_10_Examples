package com.bilgeadam.lesson033.dependencyinversion.socialmedia;

import com.bilgeadam.lesson033.utility.Notification;
import com.bilgeadam.lesson033.utility.User;

public abstract class SocialMedia implements ISocialMedia{
	
	private double sclaeRatio;
	
	public abstract void changeScaleRatio(String type);
	
	

	public double getSclaeRatio() {
		return sclaeRatio;
	}

	public void setSclaeRatio(double sclaeRatio) {
		this.sclaeRatio = sclaeRatio;
	}
	

	public abstract void sharePhoto();
	
	public abstract void chat();
	
	

	
	

}
