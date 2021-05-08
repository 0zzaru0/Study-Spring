package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class MTest {
	public static void main (String [] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test06/applicationContext.xml");
		System.out.println("Spring Bean Container 생성완료");
		
		TV tv = (TV)factory.getBean("samsung");
		tv.powerOn();
		tv.powerOff();
		
		//TV tv = (TV)factory.getBean("lg");
		//tv.powerOn();
		//tv.powerOff();
	}

}
