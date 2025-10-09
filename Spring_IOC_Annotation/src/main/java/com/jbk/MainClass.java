package com.jbk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Employee e = context.getBean(Employee.class);
		System.out.println(e);
//		Employee e1 = context.getBean(Employee.class);
//		System.out.println(e1.hashCode());
//		System.out.println(e.hashCode());
//		System.out.println(e1 == e);
		
//		Demo e=context.getBean(Demo.class);
//		System.out.println(e);

}
}
