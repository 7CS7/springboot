package com.cs.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AopExpressions {
	@Pointcut("execution(* com.cs.springaop.dao.*.*(..)))")
	public void forDaoPackage() {
		
	}
	
	@Pointcut("execution(* com.cs.springaop.dao.*.get*(..))")
	public void setter() {}
	@Pointcut("execution(* com.cs.springaop.dao.*.set*(..))")
	public void getter() {}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void noGetterSetter() {}
}
