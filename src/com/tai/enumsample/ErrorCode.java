package com.tai.enumsample;

import java.util.HashMap;
import java.util.Map;

public enum ErrorCode {
	
	RUNERROR("Run error","001"),
	STOPERROR("Stop error","002");
	
	
	private String maeeage;
	private String code;
	
	private static Map<String, ErrorCode> errorCodeMap = new HashMap<>();
	
	static {
		for (ErrorCode errorCode : values()) {
			errorCodeMap.put(errorCode.code, errorCode);
		}
	}
	
	public static ErrorCode getErrorCodebyCode(String code) {
		return errorCodeMap.get(code);
	}
	
	private ErrorCode(String maeeage, String code){
		this.maeeage = maeeage;
		this.code = code;
	}
	
	
	public String getMessage() {
		return this.maeeage;
	}
	
	public String getCode() {
		return this.code;
	}
}
