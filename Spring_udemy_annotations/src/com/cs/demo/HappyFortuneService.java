package com.cs.demo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getfortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day!";
	}

}
