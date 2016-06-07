package com.tai.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.tai.model.Student;

import sun.print.resources.serviceui;

public class StreamTest {
	
	public static void main(String args[]){
		filterStringLengthTest();
		sumTest();
		maxTest();
		reduceTest();
		groupTest();
	}
	
	public static void filterStringLengthTest() {
		List<String> list = Arrays.asList("apple", "book", "cat");
		List<String> result = null;
		result = list.stream().filter(s -> s.length()>4).filter(s -> s.length()>3).collect(Collectors.toList());
		System.out.println(result);
	}
	
	public static void sumTest() {
		List<Student> list = Arrays.asList(new Student("a", 16), new Student("b", 1), new Student("c", 33), new Student("d", 29));
		int totalAge = list.stream().mapToInt(s -> s.getAge()).sum();
		System.out.println(totalAge);
	}
	
	public static void maxTest() {
		List<Student> list = Arrays.asList(new Student("a", 16), new Student("b", 1), new Student("c", 33), new Student("d", 29));
		Optional<Student> optional = list.stream().max((s1,s2)-> s1.getAge() - s2.getAge());
		System.out.println(optional.get());
	}
	
	public static void reduceTest() {
		List<Student> list = Arrays.asList(new Student("a", 16), new Student("b", 1), new Student("c", 33), new Student("d", 29));
		System.out.println(list.stream().mapToInt(s -> s.getAge()).reduce((totalxx, age) ->  totalxx + age));;
	}
	
	public static void groupTest() {
		List<Student> list = Arrays.asList(new Student("a", 16), new Student("b", 1), new Student("c", 33), new Student("d", 29), new Student("e", 5));
		Function<Student, Integer> function = s ->{
			int age = s.getAge();
			if (age>0 && age<10){
				return 1;
			} else if (age > 10 && age<20){
				return 2;
			} else {
				return 3;
			}
		};
		System.out.println(list.stream().collect(Collectors.groupingBy(function)));
	}
}
