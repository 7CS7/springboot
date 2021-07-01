package com.cs.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class CloudLoggingAspect {
	@Before("com.cs.springaop.aspect.AopExpressions.noGetterSetter()")
	public void logToCloud() {
		System.out.println(">>>>performing Logging to cloud");
	}
}
