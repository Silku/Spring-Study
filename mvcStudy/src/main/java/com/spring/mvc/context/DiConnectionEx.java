package com.spring.mvc.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("diConnectionEx")
public class DiConnectionEx {
	
	@Autowired(required = false)
//	required 연결된 객체가없을떄 null을 주지않겠다.
	@Qualifier("diex")
	private DiContext diex;
	
	public DiConnectionEx() {
		System.out.println("기본생성자");
	}

/*	
 *  객체를 여러개 생성하고싶다? 예시 > 
 *  private DiContext diex1;
 *  private DiContext diex2;
	@Autowired(required = false)
	public DiConnectionEx(@Qualifier("diex1")DiContext diex1, @Qualifier("diex2")DiContext diex2){
	super();
	this.diex1 = diex1;
	this.diex2 = diex2;
	}
*/
	public DiConnectionEx(DiContext diex) {
		super();
		System.out.println("필드 주입 생성자");
		this.diex = diex;
	}

	public DiContext getDiex() {
		return diex;
	}

	
	public void setDiex(DiContext diex) {
		System.out.println("setter 주입");
		this.diex = diex;
	}

	@Override
	public String toString() {
		if(diex == null) {
			return "";
		}else {
			return diex.diConnection();
		}
	}

}