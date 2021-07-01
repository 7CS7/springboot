package com.cs.springdemo;

public class FootballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		
		return "try to goal as many as possible";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	public void doMyStartup() {
		System.out.println("Do my stat up stuff...bean initialized");
	}
	public void doDestroy() {
		System.out.println("bean destroyed");
	}

}
