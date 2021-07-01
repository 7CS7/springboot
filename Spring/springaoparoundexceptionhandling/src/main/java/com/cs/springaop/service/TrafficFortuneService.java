package com.cs.springaop.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;
@Component
public class TrafficFortuneService {
	public String getFortune() {
		try {
		TimeUnit.SECONDS.sleep(5);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		return "Expect heavy Traffic this morning";
		
	}
public String getFortune(boolean flag) {
	
	if(flag) {
		throw new RuntimeException("Road is blocked");
	}
	//return "Expect heavy Traffic this morning";
	return getFortune();
}
}
