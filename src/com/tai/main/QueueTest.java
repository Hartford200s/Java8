package com.tai.main;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	
	public static void main(String args[]){
		Queue<String> queue = new LinkedList<String>();
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.forEach(q -> {
			System.out.println(q);
		});
		System.out.println(queue);
	}
}
