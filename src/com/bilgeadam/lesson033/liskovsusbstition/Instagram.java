package com.bilgeadam.lesson033.liskovsusbstition;
/*
 
 * daha sonra eğer kullanıcının emaili varsa email gönder.
 * telefonu varsa sms göndersin.. İkiside varsa ikisini de göndersin.
 * 
 * bildirimGonder ==>> Kullanıcı
 * sms ==>> 555-555-555 ==>> sms gönderiliyor..
 * email ==>>caner@gmail.com ==>> email gönderiliyor
 * 
 * 
 */

import com.bilgeadam.lesson033.utility.Notification;

import com.bilgeadam.lesson033.utility.User;

/*
 * 1- email ve sms gonder metotlarımız vardı sonra facebook dedi ki ben artık
 * sms göndermeyi desteklemiyorum bu sorunu nasıl çözeriz..
 * 
 * 2- Whatsapp ==> sadece video konferans, sohbet, resim paylaş, hikaye paylaş özelliklerini destekliyor..
 * ---Facebook ==> post, resim, hikaye, sohbet..
 * -- instagram => post, resim, hikaye, sohbet
 * 
 */

public class Instagram extends SocialMedia implements ISms,IEmail, IPostable{

	@Override
	public void changeScaleRatio(String type) {
		if(type.equals("jpg")) {
			setSclaeRatio(38);
		}else if(type.equals("png")) {
			setSclaeRatio(30);
		}else {
			setSclaeRatio(40);
		}
		
	}
	
	public void sendEmail(User user) {
		if(user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());
		}
	}
	
	public void sendSms(User user) {
		if(user.getPhone() !=null) {
			Notification.sendSms(user.getPhone());
		}
	}

	@Override
	public void sharePost() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sharePhoto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shareStory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub
		
	}
	

}
