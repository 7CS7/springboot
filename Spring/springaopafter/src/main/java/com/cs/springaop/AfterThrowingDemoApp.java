package com.cs.springaop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cs.springaop.dao.Account;
import com.cs.springaop.dao.AccountDao;
import com.cs.springaop.dao.MembershipDao;
import com.cs.springaop.demo.DemoConfig;

/**
 * Hello world!
 *
 */
public class AfterThrowingDemoApp 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDao dao=con.getBean("accountDao",AccountDao.class);
        MembershipDao mdao=con.getBean("membershipDao",MembershipDao.class);
       List<Account> acc=dao.findAccount(false);
        
        System.out.println("-----------");
        System.out.println(acc);
        List<Account> theAcc=null;
        try {
        	boolean flag=true;
        	theAcc=dao.findAccount(flag);
        }catch (Exception e) {
        	System.out.println("Main program caught exception"+e);
        }
        con.close();
    }
}
