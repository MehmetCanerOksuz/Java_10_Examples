package com.bilgeadam.lesson033.singleresponsiblity;
/*
 * Bir bildirim gönder metodu yazmanızı istiyorum.
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

public class Instagram {
	
	/*
	 * 1. basamakta bir sendNotification metodu yazdık
	 * kullanıcının telefon ve emailini kontrol edip ona göre bildirimler verdik.
	 * fakat bu metodun single responsibilitye uymadığını farkettik ve 2. basamağa geçtik...
	 * 
	 */

	public void sendNotification(User user) {
		
		if(user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());
		}
		if(user.getPhone() !=null) {
			Notification.sendSms(user.getPhone());
		}

	}
	
	
	/*
	 * 
	 * 2. basamakta yukarıdaki metodu görevlerine göre 2 ye ayırıdk.
	 * 2 ayrı metot ile single responsibilitye uygun hale getirdik.
	 * 
	 */
	
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
}
