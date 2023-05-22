package com.bilgeadam.lesson013;

public class _00_StaticOrnek {

	int number1; //nesne değişkeni- nesne özelliği
	static int number2;  // static sınıf değişkeni - sınıf özelliğidir.  package
						 // 
	
	public void numaraVer() {
		System.out.println("Numara ver metodu");
		number1 +=1;
		number2 +=1;
		System.out.println("number1 ==>>>" + number1);
		System.out.println("number2 ==>>>" + number2);
	}
	
	public static void numuraVer2() {
		System.out.println("Numara 2 metodu");
		number2++;
		System.out.println(number2);
		//System.out.println(number1);   // Static bir metot içinde static olmayan bir özelliği direk  --
		// kullanamayız..  
		//Kullanmak için nesne oluşturmalıyız.
		
//		StaticOrnek staticOrnek = new StaticOrnek();
//		staticOrnek.number1++;
	}
	
	public static void main(String[] args) {
	 number2 = 5;
	 _00_StaticOrnek.number2 = 10;
	 _00_StaticOrnek staticOrnek = new _00_StaticOrnek();
	 staticOrnek.number1 = 10;     // static olmadığı için nesne üzerinden ulaştık..
	 
	 System.out.println(number2);
	 System.out.println(staticOrnek.number1);
	 staticOrnek.numaraVer();
	 
	 staticOrnek = new _00_StaticOrnek();
	 
	 staticOrnek.numaraVer();
	 staticOrnek.numaraVer();
	 
	 _00_StaticOrnek staticOrnek2 = new _00_StaticOrnek();
	 System.out.println(staticOrnek2.number1);
	 System.out.println(staticOrnek.number1);
	 System.out.println(staticOrnek2.number2);
	 System.out.println(staticOrnek.number2);
	}
}
