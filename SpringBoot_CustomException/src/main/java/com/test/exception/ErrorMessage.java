package com.test.exception;

import java.util.Date;

public class ErrorMessage {

	private Date timestamp;
	private String url;
	private String msg;
	private int statusCode;
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	
	@Override
	public String toString() {
		return "ErrorMessage [timestamp=" + timestamp + ", url=" + url + ", msg=" + msg + ", statusCode=" + statusCode
				+ "]";
	}
	
	
	
}
