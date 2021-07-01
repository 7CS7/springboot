package com.cs.springaop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.cs.springaop.dao.Account;

@Aspect
@Component
@Order(3)
public class DemoLoggingAspect {

	/*@Before("execution(public void addAccount())")
	public void beforeAddAccount() {
		System.out.println("Executing @Before");
	}*/
	/*@Before("execution(public void com.cs.springaop.dao.AccountDao.addAccount())")
	public void beforeAddAccount() {
		System.out.println("Executing @Before");
	}*/
	@AfterReturning(pointcut = "execution(* com.cs.springaop.dao.AccountDao.findAccount(..))",returning = "result")
	public void afterReturnFindAccount(JoinPoint joinpt,List<Account> result) {
		String meth=joinpt.getSignature().toShortString();
		System.out.println(">>>after returning---");
		System.out.println("result is: "+result);
		convertAccountToUpperClass(result);
	}
	
	private void convertAccountToUpperClass(List<Account> result) {
		for(Account acct:result){
			String theUpperName=acct.getName().toUpperCase();
			acct.setName(theUpperName);
		}
		
	}
	//System.out.println("result is: "+result);

	//@Before("execution(public void add*())")
	//@Before("execution(void add*())")
	//@Before("execution(* add*())")
	//@Before("execution(* add*(com.cs.springaop.dao.Account))")
	//@Before("execution(* add*(com.cs.springaop.dao.Account,..))")
	//@Before("execution(* add*(..))")
	
	
	@Before("com.cs.springaop.aspect.AopExpressions.forDaoPackage()")
	public void beforeAddAccount(JoinPoint theJoinPoint) {
		System.out.println(">>>>executing @before for demo");
		MethodSignature metSig=(MethodSignature) theJoinPoint.getSignature();
		System.out.println("Method: "+metSig);
		Object[] args=theJoinPoint.getArgs();
		for(Object tempArgs:args) {
			System.out.println(tempArgs);
			if(tempArgs instanceof Account) {
				Account theAccount=(Account) tempArgs;
				System.out.println("account name: "+theAccount.getName());
				System.out.println("account level: "+theAccount.getLevel());
			}
		}
		
	}
	
	
	
	
}
