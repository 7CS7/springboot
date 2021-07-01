package com.cs.removexml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.cs.removexml")

public class Config {
	@Bean
	public Pepsi getPepsi() {
		return new Pepsi();
	}
	@Bean
public Std getStd() {
	Std st=new Std(getPepsi());
	return st;
}
}
