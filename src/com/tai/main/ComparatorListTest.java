package com.tai.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorListTest {
	
	public static void main(String args[]){
		List<String> list = Arrays.asList("X","A","M","B","D","C",null);
//		Collections.sort(list, String::compareTo);
//		list.sort(String::compareTo);
		list.sort(Comparator.nullsFirst(Comparator.reverseOrder()));
		System.out.println(list);
	}
}
