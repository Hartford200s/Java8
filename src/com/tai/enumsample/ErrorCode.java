package com.tai.enumsample;

public enum ErrorCode {
	
	RUNERROR("Run error","001"),
	STOPERROR("Stop error","002");
	
	
	private String maeeage;
	private String code;
	
	private ErrorCode(String maeeage, String code){
		this.maeeage = maeeage;
		this.code = code;
	}
	
	public String getMessage() {
		return this.maeeage;
	}
}
