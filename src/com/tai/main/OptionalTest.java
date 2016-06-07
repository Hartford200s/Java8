package com.tai.main;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalTest {

	public static void main(String[] args) {
		//of();//java.lang.NullPointerException
		//ofNullable();//java.util.NoSuchElementException
		//isPresent();
		//empty();// java.util.NoSuchElementException
		orElse();//useful
		orElseGet();//useful
		orElseThrow();//useful
	}
	
	public static void of(){
		String s = null;
		Optional<String> optional = Optional.of(s);//java.lang.NullPointerException
	}
	
	public static void ofNullable(){
		String s = null;
		Optional<String> optional = Optional.ofNullable(s);
		optional.get();//java.util.NoSuchElementException
	}
	
	public static void isPresent(){
		String s = null;
		Optional<String> optional = Optional.ofNullable(s);
		if (optional.isPresent()){
			System.out.println(optional.get());
		} else {
			System.out.println("is null........");
		}
	}
	
	public static void empty() {
		String s = null;
		Optional<String> optional = s == null ? Optional.empty() : Optional.of(s);
		System.out.println(optional.get());
	}
	
	public static void orElse() {
		String s = null;
		Optional<String> optional = Optional.ofNullable(s);
		System.out.println(optional.orElse("optional.get() is null, default value"));
	}
	
	public static void orElseGet() {
		String s = null;
		Optional<String> optional = Optional.ofNullable(s);
		Supplier<String> supplier = () -> {
			System.out.println("run supplier...");
			return "default value";
			};
			
		System.out.println(optional.orElseGet(supplier));	
	}
	
	public static void orElseThrow() {
		String s = null;
		Optional<String> optional = Optional.ofNullable(s);
		Supplier<IllegalArgumentException> supplierException = () -> {
			System.out.println("run supplierException");
			return new IllegalArgumentException("custom Exception message");};
		optional.orElseThrow(supplierException);
	}
}
