package chapter3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class LoggingAdvice {
	//관점1
	public void beforeAdvice() {
		System.out.println("###메소드 실행전에 로그를 출력합니다.###");
	}
	//관점2
	public void afterAdvice() {
		System.out.println("$$$$아이템을 구매해 주셔서 감사합니다. $$$$");
	}
	//관점3
	public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
//		ProceedingJoinPoint joinpoint 이거는 정의되있는거임
		//추가로직(before)
		Signature method = joinPoint.getSignature();
		System.out.println("&&내가 실행한 메소드:::" + method.getName());
		// 메소드를 실행하는 부분
		joinPoint.proceed(); 
		//추가로직(after)
		if("buyGoods".equals(method.getName())) {
			System.out.println("Goods를 구매해주셔서 감사합니다.");
		}else {
			System.out.println("Item을 구매해주셔서 감사합니다.");
		}
	}
	
}
