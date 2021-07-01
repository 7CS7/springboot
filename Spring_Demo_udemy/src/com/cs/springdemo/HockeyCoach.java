package com.cs.springdemo;

public class HockeyCoach implements Coach{
private FortuneService fortuneService;
private String email;
private String team;
private String name;
private int id;
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

	public HockeyCoach() {
	super();
	System.out.println("inside no arg constructor");
	// TODO Auto-generated constructor stub
}

	public FortuneService getFortuneService() {
	return fortuneService;
}

public void setFortuneService(FortuneService fortuneService) {
	this.fortuneService = fortuneService;
	System.out.println("inside setter method");
}

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

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run and goal";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
