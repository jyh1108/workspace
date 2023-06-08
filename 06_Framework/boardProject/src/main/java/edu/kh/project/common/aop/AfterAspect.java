package edu.kh.project.common.aop;

import org.aspectj.lang.annotation.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AfterAspect {

	private Logger logger = LoggerFactory.getLogger(AfterAspect.class);
	
	@Order(3)
	@After("CommonPointcut.serviceImplPointcut()")
	public void agterLog() {
		logger.info("--------------------------------------/n/n");
	}
}
