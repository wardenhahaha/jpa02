package com.jpa02.common;

import java.sql.Timestamp;

public class ResultCommon<T> {
	private Boolean success;
	private String message;
	private String code; 
	private T data;
	private String stackTrace;
	private Timestamp currentTime;
	
	public ResultCommon() {
		currentTime=new Timestamp(System.currentTimeMillis());
	}
	public ResultCommon(boolean success, String message){
		this.success = success;
		this.message = message;
	}
	public ResultCommon(boolean success) {
		this.success=success;
	}
	public ResultCommon(String code,String message) {
		this.code=code;
		this.message=message;
	}
	public ResultCommon(boolean success,String message,T data) {
		this.success = success;
		this.message = message;
		this.data=data;
	}
	
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getStackTrace() {
		return stackTrace;
	}
	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}
	public Timestamp getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(Timestamp currentTime) {
		this.currentTime = currentTime;
	}
	
	
}
