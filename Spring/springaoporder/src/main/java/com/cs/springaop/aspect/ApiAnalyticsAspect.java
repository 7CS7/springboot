package com.cs.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class ApiAnalyticsAspect {
	@Before("com.cs.springaop.aspect.AopExpressions.noGetterSetter()")
	public void performApiAnalytics() {
		System.out.println(">>>>performing API Analytics");
	}
}
