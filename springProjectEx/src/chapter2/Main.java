package chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BlackPhone blackPhone = (BlackPhone)context.getBean("blackPhone");
		blackPhone.show();
	}
	
	public static void main2(String[] args) {
		WhitePhone whitePhone = new WhitePhone();
		whitePhone.show();
		
		BlackPhone blackPhone = new BlackPhone();
		blackPhone.show();
		
		Battery newBattery1 = new Battery("새로산 배터리 - 생성자");
		blackPhone.setBattery(newBattery1);
		blackPhone.show();
		
		
		Battery newBattery2 = new Battery();
		newBattery2.setBatteryName("새로산 배터리2 - 세터");
		blackPhone.setBattery(newBattery2);
		blackPhone.show();
		
		
	}
	
}
