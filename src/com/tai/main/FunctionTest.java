package com.tai.main;

import java.util.function.Function;

public class FunctionTest {
	
	public static void main(String args[]){
		Function<String, String> f = s -> "value:"+s;
		test(f, "Tai");
	}
	
	public static <T, R> void test(Function<T, R> function, T t) {
		System.out.println(function.apply(t));
	}
	
}
