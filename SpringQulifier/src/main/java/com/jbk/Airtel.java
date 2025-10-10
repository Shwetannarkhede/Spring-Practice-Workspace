package com.jbk;

import org.springframework.stereotype.Component;

@Component("Airtel")
public class Airtel implements Sim{

	@Override
	public String Calling() {
		// TODO Auto-generated method stub
		return " UR calling Airtel";
	}
	
	

}
