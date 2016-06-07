package com.tai.main;

class HelloA {

	Runnable r1 = new Runnable() {
		public void run() {
			System.out.println(this);
		}
	};
	
	Runnable r2 = new Runnable() {
		public void run() {
			System.out.println(toString());
		}
	};
	
	@Override
	public String toString(){
		return "HelloA";
	}
}

class HelloB {
	
	Runnable r1 = () -> {
		System.out.println(this);
	};
	
	Runnable r2 = () -> {
		System.out.println(toString());
	};
	
	@Override
	public String toString() {
		return "HelloB";
	}
}
public class HelloMainTest {

	public static void main(String args[]){
		new HelloA().r1.run();//return Runnable toString()
		new HelloA().r2.run();//return Runnable toString()
		
		new HelloB().r1.run();//return HelloB toString()
		new HelloB().r2.run();//return HelloB toString()
	}
}
