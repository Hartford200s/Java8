package com.tai.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.tai.model.Person;

public class GenericsTest {
	
	public static List<? extends Number> getNumberList(List<? extends Number> list) {
		return list;
	}
	
	public static void main(String args[]){
		List<Integer> list = Arrays.asList(1,2,3);
		System.out.println(getNumberList(list));
		
		List<BigDecimal> list2 = new ArrayList<>();
		System.out.println(getNumberList(list2));
		
	}
}
