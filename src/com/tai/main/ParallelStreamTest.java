package com.tai.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ParallelStreamTest {
	
	public static void main(String args[]){
		test1();
		test2();
	}
	
	public static void test1(){
		System.out.println("test1 start");
		List<String> list = Arrays.asList("1", "2", "3", "4", "5");
		list.parallelStream().forEach(s -> {
			System.out.println(s);
		});
		System.out.println("test1 end");
	}
	
	public static void test2(){
		System.out.println("test2 start");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> biggerThan5 = numbers.parallelStream().filter(n -> n>5).collect(Collectors.toList());
		biggerThan5.forEach(System.out::println);
		System.out.println(biggerThan5);
		
		biggerThan5.parallelStream().map(n -> n*10).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("test2 end");
	}
}
