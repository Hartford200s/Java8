package com.tai.enumsample;

public class Main {
	
	public static void main(String args[]) {
		executeAction(ActionEnum.RUN);
		System.out.println(ErrorCode.RUNERROR);//show enum name properties
		System.out.println(ErrorCode.RUNERROR.name());//show enum name properties
		System.out.println(ErrorCode.RUNERROR.getMessage());
		System.out.println(ErrorCode.RUNERROR.ordinal());
		System.out.println(ErrorCode.STOPERROR.ordinal());
	}
	
	public static void executeAction(ActionEnum actionEnum) {
		System.out.println(ActionEnum.valueOf(ActionEnum.class, "RUN"));
	}
	
}
