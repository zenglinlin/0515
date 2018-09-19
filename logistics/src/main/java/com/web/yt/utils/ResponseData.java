package com.web.yt.utils;

import java.io.Serializable;

public class ResponseData implements Serializable {
	// 状态码
	private int status = 1;
	// 响应消息
	private String message = "OK";
	// 响应数据
	private Object data;
	
	public ResponseData() {
	}

	public ResponseData(String message) {
		this.message = message;
	}

	public ResponseData(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
  }