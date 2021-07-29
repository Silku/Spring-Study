package chapter3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * AOP(Aspect Oriented Programming) 관점지향 프로그래밍
 * Aspect : 어플리케이션의 핵심 기능은 아니지만 어플리케이션을 구성하는 중요한 요소, 
 * 			부가적인 기능을 담당하는 요소이다.
 * 			어플리케이션의 핵심기능과 부가적인 기능을 분리해서 Aspect 모듈로 만들어 설계하고 개발하는 방법
 * 			OOP을 돕는 보조적인 기술.
 * 			OOP는 모듈화의 핵심이 클래스이지만, AOP는 모듈화의 핵심이 관점(로깅, 보안, 트랜잭션)이다.
 *Advice : 부가 기능을 담은 모듈로 '공통로직' 을 담고 있는 코드
 *joinPoint: Advice를 적용가능한 지점(스프링 프레임워크 AOP에서는 각 객체의 메소드를 의미)
 *	
 *			객체기순으로 before /after를 지정
 *			before
 *			객체.메소드() //이 메소드를 joinPoint로 지정을통해
 *			after	
 *
 *PointCut: JoinPoint를 선별하는 기능을 정의한 모듈
 *Target: 대상 메소드를 가지는 객체
 *Proxy: Advice가 적용되었을때 만들어지는 객체
 *Weaving: Advice를 핵심로직에 적용하는 것.
 *
 */

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ItemTarget itemTarget = (ItemTarget)context.getBean("itemTarget");
		itemTarget.selectItem();
		System.out.println();
	}

}
