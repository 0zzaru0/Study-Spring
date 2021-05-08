package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main (String[]args) {
		
		//객체 생성은 Spring이
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		// 아무런 설정없이 BEAN 생성하면 기본생성자로 (과일 : banana 가격 : 5000)
		MessageBean banana = (MessageBean)factory.getBean("banana");
		banana.sayHello();
		
		//매개변수 생성자(constructor-arg, value)
		MessageBean apple = (MessageBean)factory.getBean("apple");
		apple.sayHello();
		
		//id값 제대로 적기
		MessageBean mango = (MessageBean)factory.getBean("mango");
		mango.sayHello();
		
	}
}
