package com.tai.main;

import java.util.Optional;
import java.util.function.Function;

import com.tai.model.Address;
import com.tai.model.Customer;

public class OptionalFlatMapTest {
	
	public static void main(String args[]){
		//faltMap1();//沒用ofNullab, requireNonNull檢核出null, 拋出Exception
		faltMap2();//用ofNullable包, 跟map範例結果相同
		map();
	}
	
	public static void faltMap1(){
		Optional<Customer> optionalCustomer = Optional.of(new Customer());
		Function<Customer, Optional<Address>> f1 = customer -> Optional.of(customer.getAddress());
		Function<Address, Optional<String>> f2 = address -> Optional.of(address.getCity());
		String city = optionalCustomer.flatMap(f1).flatMap(f2).orElse("default city");
		System.out.println(city);
	}
	
	public static void faltMap2(){
		Optional<Customer> optionalCustomer = Optional.of(new Customer());
		Function<Customer, Optional<Address>> f1 = customer -> Optional.ofNullable(customer.getAddress());
		Function<Address, Optional<String>> f2 = address -> Optional.ofNullable(address.getCity());
		String city = optionalCustomer.flatMap(f1).flatMap(f2).orElse("default city");
		System.out.println(city);
	}
	
	public static void map(){
		Optional<Customer> optionalCustomer = Optional.of(new Customer());
		Function<Customer, Address> f1 = customer -> customer.getAddress();
		Function<Address, String> f2 = address -> address.getCity();
		String city = optionalCustomer.map(f1).map(f2).orElse("default city");
		System.out.println(city);
	}
	
}
