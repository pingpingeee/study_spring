package com.lgy.spring_8_1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	// loggerAop : advice(공통기능 자체-메소드)
	// joinPoint : 핵심기능(공통기능이 적용되는 대상 - 메소드)
	public Object loggerAop(ProceedingJoinPoint joinPoint) {
		// getSignature().toShortString() : 핵심기능 클래스의 메소드 정보를 가지고 옴
		String signatureStr = joinPoint.getSignature().toShortString();
		System.out.println(signatureStr + "is start");
		long st = System.currentTimeMillis();
		Object obj = null;

		try {
			// 핵심기능 실행
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + "is start");
			System.out.println(signatureStr + "의 경과시간 : " + (et - st));
		}
		return obj; // 핵심기능 반환
	}
}
