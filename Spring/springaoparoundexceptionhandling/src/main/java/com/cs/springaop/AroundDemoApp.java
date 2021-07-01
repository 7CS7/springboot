package com.cs.springaop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cs.springaop.dao.Account;
import com.cs.springaop.dao.AccountDao;
import com.cs.springaop.dao.MembershipDao;
import com.cs.springaop.demo.DemoConfig;
import com.cs.springaop.service.TrafficFortuneService;

/**
 * Hello world!
 *
 */
public class AroundDemoApp 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(DemoConfig.class);
       // AccountDao dao=con.getBean("accountDao",AccountDao.class);
        //MembershipDao mdao=con.getBean("membershipDao",MembershipDao.class);
               
               TrafficFortuneService tfs=con.getBean("trafficFortuneService",TrafficFortuneService.class);
              boolean flag=true;
               String data=tfs.getFortune(flag);
              System.out.println("My Fortune : "+data);
              System.out.println("finished");
              con.close();
    }
}
