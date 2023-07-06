package com.bilgeadam.lesson033.openclosed;
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
 * Open Closed..
 * 
 * 1- İnstagram sınıfımız içinde bir sclaeRatio özelliğimiz olsun
 * ResizePhoto diye bir sınıfımız olsun bu sınıf içinde boyutlandırma yapacağız..
 * bu metot bizden bir instagram alacak bir de string bir type alacak ve
 * eğer type jpg ise sclaeRatio ( kucultme katsayısı ) 33 eğer png ise 30  default 40 olsun..
 * 
 * 2- Yeni bir sosyal medya uygulaması daha eklendi facebook
 * facebook için jpg 34 png 37 default 45 olsun daha sonra resizephoto sınıfından 2. bir metot yazalım
 * bu metot da facebook da goz onune alınsın..
 * 
 * 3- Yeni bir sosyal medya daha ekleyelim, whatsapp
 * jpg 28, png 32 default 36...
 */

public class Instagram extends SocialMedia{

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
	

}
