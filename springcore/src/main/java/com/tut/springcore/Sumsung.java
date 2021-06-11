package com.tut.springcore;

import org.springframework.beans.factory.annotation.Autowired;

public class Sumsung {
	
	@Autowired
	MobileProcessor cpu;
	

	public void config()
	{
		System.out.println("octa core,8gb,5500mah battery");
		cpu.process();
	}


	public MobileProcessor getCpu() {
		return cpu;
	}


	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
}
