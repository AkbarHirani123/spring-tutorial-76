package com.caveofprogramming.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	// @Pointcut("args(exposure, aperture)")
	// public void somePointCut(int exposure, double aperture) {
	// }
	//
	// @Pointcut("target(com.caveofprogramming.spring.aop.Camera)")
	// public void targetCamera() {
	// }
	//
	// @Before("targetCamera() && somePointCut(exposure, aperture)")
	// public void withinDemoAdvice(int exposure, double aperture) {
	// System.out.println("...Before Advice...");
	//
	// System.out.printf("exposure %d, aperture %.2f\n", exposure, aperture);
	// }
	//
	// @After("within(com.caveofprogramming.spring.aop.*) && !@annotation(Deprecated)")
	// public void someAfterAdvice() {
	// System.out.println("AFTER ADVICE RUNNING!\n");
	// }

	@DeclareParents(value="com.caveofprogramming.spring.aop.*", defaultImpl=com.caveofprogramming.spring.aop.Machine.class)
	private IMachine machine;
	
	@Around("within(com.caveofprogramming.spring.aop.*)")
	public void runLogger(ProceedingJoinPoint p) {

		System.out.println("-Machine is now running.\n");
		try {

			p.proceed();

		} catch (Throwable e) {

			e.printStackTrace();

		}
		System.out.println("-Machine has now stopped.\n");
	}
}
