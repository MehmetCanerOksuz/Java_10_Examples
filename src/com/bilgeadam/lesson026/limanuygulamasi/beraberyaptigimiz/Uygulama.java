package com.bilgeadam.lesson026.limanuygulamasi.beraberyaptigimiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

/*
 * Bir limanımız olacak bu limanda yük yerleştirilecek alanlar olacak
 *  limandaki yük lerştirilecek alan sayısı liman olusturulurken belirlenebilir.
 *  veya her liman için 10 adet yük yeri olabilir.
 *  her yükün bir ağırlık bir kabul tarihi olsun
 * 
 * 2 - Kendi exception sınıfımızı yaratalım ve uygulamamızda bir yük yeri seç metodu yapalım
 * eğer seçtiğimiz yer dolu ise doluyer seçimi diye bir hata fırlatsın..
 * 
 * 3 - yukYeriSec2
 * 
 * ------------ODEV--------------
 * 4 - Tarih belirle metodu yazalım ----> utility tarihi deger alma kullanılabilir..
 * --- a) eger geçmiş tarih girilmişse GECERSİZ_KABUL_TARİHİ hatası fırlatsın..
 *     b) girdiğimiz gün cumartesi veya pazar ise mesai günleri dısı hatası versin..
 *     
 * 5 - yukOlustur metodu yazalım ==>> dışarıdan bir isim alalım, agırlık alacağız ve tarih alacagız
 * --- agırlık ve tarihi yazdıgımız metotlar üzerinden alacagız..
 * --- eger hata yoksa bize bir tane yük dönsün..
 * --- eger hata varsa bize bos bir optional dönsün..
 * 
 * 6 - Bu metotlarıda bir yuk kabulu metotlarında toplayıp bütün kontrollerimden geçmişse
 * --- başta aldıgım index degerine yükü setleyelim..
 * --- yukKabul metodu -->>  yukyerisec2, yukOlustur bu iki metot basarılı çalışmıssa yuk olusturdan dönen yuku 
 * --- limandaki yükler arrayıne index degeri ile setleyeceğiz..    
 * 
 * 
 */

public class Uygulama {

	Liman liman;

	public Uygulama() {
		this.liman = new Liman();
	}

	public static void main(String[] args) {

		Yuk yuk = new Yuk("Yuk1", 1000, LocalDate.now());
		Uygulama uygulama = new Uygulama();

		uygulama.liman.getYukler()[3] = new Yuk("Yuk3", 100, LocalDate.now().minusDays(5));
		uygulama.liman.getYukler()[5] = new Yuk("Yuk5", 100, LocalDate.now().minusDays(2));
		// uygulama.yukYeriSec(yuk);
		
//		try {
//			int index = uygulama.yukYeriSec2(yuk);
//			uygulama.liman.getYukler()[index] = yuk;
//		}catch (LimanException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			uygulama.agirlikBelirle();
//		} catch (LimanException e) {
//			
//			e.printStackTrace();
//		}
//		
//		try {
//			uygulama.tarihBelirle();
//		} catch (LimanException e) {
//			e.printStackTrace();
//		}
		
//		System.out.println(uygulama.yukOlustur()); 
		
		uygulama.yukKabulu(uygulama);
		
		System.out.println(Arrays.toString(uygulama.liman.getYukler()));
		System.out.println("Program devam ediyor..");

	}

	public void yukYeriSec(Yuk yuk) {

		int index = Utility.intDegerAlma("Lütfen bir yük yeri seçiniz");
		try {
			if (liman.getYukler()[index] != null) {
				throw new LimanException(ErrorType.DOLU_YER_SECIMI);
			} else {

				liman.getYukler()[index] = yuk;
				System.out.println("işlem başarılı");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Yük yeri seçimi başarısız");
		}

	}

	public int yukYeriSec2() throws LimanException {

		int index = Utility.intDegerAlma("Lütfen bir yük yeri seçiniz");

		if (liman.getYukler().length <= index || index < 0) {
			throw new LimanException(ErrorType.SINIRLAR_DISINDA);
		}
		if (liman.getYukler()[index] != null) {
			throw new LimanException(ErrorType.DOLU_YER_SECIMI);
		}
		return index;

	}
	
	public double agirlikBelirle() throws LimanException {
		
		double agirlik = Utility.doubleDegerAlma("Lütfen agırlığı giriniz");
		if (agirlik <100 ) {
			throw new LimanException(ErrorType.YETERSIZ_AGIRLIK);
		}
		
		return agirlik;
	}
	public LocalDate tarihBelirle() throws LimanException {
		
		LocalDate tarih = Utility.stringTarihDegeriAlma("Lütfen tarihi giriniz");
		if(tarih.isBefore(LocalDate.now())) {
			throw new LimanException(ErrorType.GECERSIZ_KABUL_TARIHI);
		}
		if(tarih.getDayOfWeek().equals(DayOfWeek.SATURDAY) || tarih.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			throw new LimanException(ErrorType.MESAI_GUNLERI_DISI);
		}
		return tarih;
	}
	
	public Optional<Yuk> yukOlustur() {
		
		Yuk yuk = null;
		try {
			yuk = new Yuk(Utility.stringDegerAlma("Lütfen yük ismini giriniz"), agirlikBelirle(), tarihBelirle());
			
		}catch (LimanException e) {
			e.printStackTrace();
			
		}catch (Exception e) {
			System.out.println("Beklenmedik bir hata oluştu : " + e.toString());
		}
		
		return Optional.ofNullable(yuk);
		
	}
	
	
	public void yukKabulu() {
		int index = -1;
		Optional<Yuk> yuk = Optional.empty();
		try {
			index = yukYeriSec2();
			yuk = yukOlustur();
		}catch (LimanException e) {
			e.printStackTrace();
		}finally {
			if(yuk.isEmpty()) {
				System.out.println("Yukunuz kabul olmamıstır.");
			} else {
				System.out.println("Yukunuz kabul olmustur " + index + " nolu yere yerleşmiştir.");
				liman.getYukler()[index] = yuk.get();
			}
		}
	}
}
