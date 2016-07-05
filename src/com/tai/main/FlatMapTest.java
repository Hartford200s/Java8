package com.tai.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapTest {
	
	public static void main(String args[]){
		flatMapTest();
	}
	
	public static void flatMapTest(){
		Stream<List<Integer>> stream = Stream.of(
				Arrays.asList(1,3,5),
				Arrays.asList(2,4,6),
				Arrays.asList(10,11)
			);
	
	Stream<Integer> integerStrem = stream.flatMap(list -> list.stream());
	integerStrem.forEach(System.out::println);
	}
}
