package com.bilgeadam.lesson032.singelton;

public class Test {
	
	public static void main(String[] args) {
		
		MyPostgreConnection myConnection1 = MyPostgreConnection.getInstance();
		MyPostgreConnection myConnection2 = MyPostgreConnection.getInstance();
		MyPostgreConnection myConnection3 = MyPostgreConnection.getInstance();
		MyPostgreConnection myConnection4 = MyPostgreConnection.getInstance();
		MyPostgreConnection myConnection5 = MyPostgreConnection.getInstance();
		
		System.out.println(myConnection1);
		System.out.println(myConnection2);
		System.out.println(myConnection3);
		System.out.println(myConnection4);
		System.out.println(myConnection5);
	}

}
