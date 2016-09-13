package com.sea.result;

public class Result {

	public static final String SUCCESS = "0000";
	public static final String FAILURE = "0001";
	
	
	private String code;
	private String msg;
	private Object data;
	
	public Result() {
		code = SUCCESS;
		msg = "success";
	}
	
	
	public Result(String code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}



	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
