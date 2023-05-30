package edu.kh.project.common.aop;

import org.aspectj.lang.annotation.Pointcut;

// point cut을 모아둘 클래스
public class CommonPointcut {
	
	@Pointcut("execution(* edu.kh.project..*Impl*.*(..))")
	public void serviceImplPointcut() {
		
		
	}
	
	
}
