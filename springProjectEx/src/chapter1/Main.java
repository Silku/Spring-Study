package chapter1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloSpring helloSpring = (HelloSpring)context.getBean("helloSpring");
		System.out.println(helloSpring.getMessage());
	}
	
	public static void main2(String[] args) {
		HelloSpring helloSpring = new HelloSpring();
		helloSpring.setMessage("Hello_spring!");
		System.out.println(helloSpring.getMessage());
	}

}
