package com.tut.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
	@Bean
	public Sumsung getPhone()
	{
		return new Sumsung();
	}
	
	@Bean
	public MobileProcessor getProcessor()
	{
		return new SnapDragon();
	}

}
