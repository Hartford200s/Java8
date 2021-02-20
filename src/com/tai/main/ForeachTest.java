package com.tai.main;

import java.util.Arrays;
import java.util.List;

public class ForeachTest {
	
	public static void main(String args[]) {
		List<String> names = Arrays.asList("A","B","C");
		names.forEach(s->{System.out.println(s);});
		System.out.println("---------分隔線-----------");
		names.forEach(System.out::println);
	}
}
