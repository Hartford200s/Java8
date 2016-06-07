package com.tai.main;

import java.util.ArrayList;
import java.util.function.Function;

public class Test2 {

	static <X, Y> ArrayList<Y> map(ArrayList<X> list, Function<X, Y> mapper) {
        ArrayList<Y> mappedList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            mappedList.add(mapper.apply(list.get(i)));
        }
        return mappedList;
    }
	
	static <String, Y> ArrayList<Y> map2(ArrayList<String> list, Function<String, Y> mapper) {
        ArrayList<Y> mappedList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            mappedList.add(mapper.apply(list.get(i)));
        }
        return mappedList;
    }
}
