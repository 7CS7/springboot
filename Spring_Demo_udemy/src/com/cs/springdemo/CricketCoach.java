package com.cs.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "bat 2 hr and ball 2 hr";
	}

	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		
		return "just do it "+ fortuneService.getFortune();
	}

}
