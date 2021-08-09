package com.spring.mvc.context;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("diex2")
public class DiEx2 implements DiContext{
	
	@Value("김태우")
	private String name;
	@Value("123456-1298765")
	private String number;
	


	@Override
	public String diConnection() {
		return "성명: " + name + " 주민번호: " + number;
	}
}

