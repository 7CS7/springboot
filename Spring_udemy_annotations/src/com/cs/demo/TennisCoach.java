package com.cs.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("tennis")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired
	//@Qualifier("happyFortuneService")
	@Qualifier("multipleFortuneService")
	private FortuneService forSer;
	@Value("${email}")
	private String email;
	@Value("${team}")
	private String team;
public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}
	@PostConstruct
	public void doStartup() {
		System.out.println("bean initialized...");
	}
	@PreDestroy
	public void doDestroyMethod() {
		System.out.println("bean destroyed");
	}

/*
 * @Autowired public TennisCoach(FortuneService forSer) { 
 * super(); 
 * this.forSer = forSer; 
 * }
 */
 public TennisCoach() { 
  super(); 
  System.out.println("inside default constructor");
  }
 

/*public FortuneService getForSer() {
	return forSer;
}
@Autowired
public void setForSer(FortuneService forSer) {
//public void anyMethodForSer(FortuneService forSer) {
	System.out.println("inside setter injection");
	this.forSer = forSer;
}*/

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice more and more";
	}



@Override
public String getDailyFortune() {
	// TODO Auto-generated method stub
	return forSer.getfortune();
}


}
