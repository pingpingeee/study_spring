package springex_8_1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	public Object loggerAop(ProceedingJoinPoint joinPoint) {
		String signatureStr = joinPoint.getSignature().toShortString();
		Object obj = null;

		System.out.println("@@@### start===>" + joinPoint.getSignature().toShortString());
		try {
			obj = joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		} finally {
			System.out.println("@@@### end===>" + joinPoint.getSignature().toShortString());

		}
		return obj;
	}
}
