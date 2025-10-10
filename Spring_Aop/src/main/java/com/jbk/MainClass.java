package com.jbk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		BankTranscation bt = context.getBean(BankTranscation.class);
		bt.transferMoney();
	}
}




         
              