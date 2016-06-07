package com.tai.functionalInterface;

@FunctionalInterface
public interface Action<T>{
	
	int compare(T o1, T o2);
	
	boolean equals(Object obj);
	
	int hashCode();
	
	String toString();
	
}
