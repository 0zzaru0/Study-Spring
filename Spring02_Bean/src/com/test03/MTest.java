package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main (String [] args) {
		
		//sertter 값을 통해 값 초기화 
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		Address kim = (Address) factory.getBean("kim");
		Address baek = (Address) factory.getBean("baek");
		
		System.out.println(kim.toString());
		System.out.println(baek);
		
	}

}
