package com.spring.mvc.model;

public class ModelEx {
	private String msg;
	public ModelEx() {
		// TODO Auto-generated constructor stub
	}
	
	public ModelEx(String msg) {
		super();
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return "ModelEx [msg=" + msg + "]";
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	
}
