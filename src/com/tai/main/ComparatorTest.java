package com.tai.main;

import java.util.Arrays;
import java.util.Comparator;

import com.tai.model.Student;

class Sort {
	
	public int sortByLength(String o1, String o2) {
		return o1.length() - o2.length();
	}
}

public class ComparatorTest {
	
	public static void main(String args[]){
		String[] arr = new String[]{"Apple", "Book", "Cat", "Dog", "Elephant"};
		//Comparator<String> c = (o1, o2) -> {return o1.length() - o2.length();};
		//Comparator<String> c = (o1, o2) -> o1.length() - o2.length();
		//Comparator<String> c = ComparatorTest::sortByLength;//sort by static method
		
		Sort sort = new Sort();
		Comparator<String> c = sort::sortByLength;//sort by object non-static method
		
		System.out.println("before sort***********");
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println("before sort***********");
		
		Arrays.sort(arr,c);
		
		System.out.println("after sort***********");
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println("after sort***********");
	}
	
	public static int sortByLength(String o1, String o2) {
		return o1.length() - o2.length();
	}
}
