package com.cs.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
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

	public SwimCoach(FortuneService forSer) {
	super();
	this.forSer = forSer;
}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "swim 1000m  everyday";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return forSer.getfortune();
	}

}
