package com.bilgeadam.lesson018;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list1.add(5);
		list2.add(15);
		
		System.out.println(list1.size());
		System.out.println(list1.get(0));
	}

}
