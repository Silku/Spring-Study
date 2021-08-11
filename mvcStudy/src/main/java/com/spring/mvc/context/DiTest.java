package com.spring.mvc.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {

	public static void main(String[] args) {
		/*
		 * AnnotationConfigApplicationContext an = new
		 * AnnotationConfigApplicationContext();
		 * an.register(com.spring.mvc.context.DiAppConfig.class); an.refresh();
		 */
// 여러파일을 생성하고자 할때 register 사용하고, refresh를 해 준다.
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(com.spring.mvc.context.DiAppConfig.class);
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/mvc/context/DiBeans.xml");
		//DiConnectionEx di = (DiConnectionEx)context.getBean("diconnectionEx");
		//DiConnectionEx di = (DiConnectionEx)an.getBean("diConnectionEx");
		//System.out.println(di);
	}

}
