package com.jbk;

import org.springframework.stereotype.Component;

@Component("Jio")
public class Jio implements Sim{

	@Override
	public String Calling() {
		// TODO Auto-generated method stub
		return "Your Calling Jio";
	}

}
