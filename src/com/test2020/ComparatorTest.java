package com.test2020;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
	
	public static void main(String args[]) {
		String [] names = {"Apple", "Tai", "Adam", "Eva", "Peter"};
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		
		
		for (String s : names) {
			System.out.println(s);
		}
	}
}
