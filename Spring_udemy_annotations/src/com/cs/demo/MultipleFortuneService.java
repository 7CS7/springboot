package com.cs.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class MultipleFortuneService implements FortuneService {
private String[] data= {"abc","pqr","xyz"};
private Random myRandom=new Random();
	@Override
	public String getfortune() {
int index=myRandom.nextInt(data.length);
String theFortune=data[index];
		return theFortune;
	}

	

}
