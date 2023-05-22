package com.bilgeadam.lesson012.oop;

public class ReferansTypeVsPrimitiveType {
	
	public static void main(String[] args) {
		
		int a =5;
		int b =4;
		
		System.out.println(a);
		System.out.println(b);
		
		a=b;
		b=12;
		
		System.out.println(a);
		System.out.println(b);
		
		
		String [] sehirler1 = {"Ankara", "Istanbul", "İzmir"};
		String [] sehirler2 = {"Bursa", "Konya", "Mersin" };
		
		System.out.println(sehirler1[0]);
		System.out.println(sehirler2[0]);
		
		System.out.println("========================");
		
		sehirler2 = sehirler1;
		System.out.println(sehirler2[0]);
		
		sehirler1[0] = "Bolu";
		System.out.println(sehirler2[0]);
		
		sehirler2[1] = "Edirne";
		System.out.println(sehirler1[1]);
		
		
		String x = new String("asd");
		String y = new String("xcv");
		
		y=x;
		System.out.println(x);
		System.out.println(y);
		x="54";		
		System.out.println(x);
		System.out.println(y);
		
		String c = new String("asd");
		String d = new String("asd");
		System.out.println(c==d);
		c=d;
		System.out.println(c==d);
		System.out.println(c);
		System.out.println(d);
		c="54";	
		System.out.println(c==d);
		System.out.println(c);
		System.out.println(d);
	}

}
