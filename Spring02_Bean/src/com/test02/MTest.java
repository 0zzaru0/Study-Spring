package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main (String [] args) {
		
		//bean 2개 설정
		//main에서 생성된 빈을 getBean()을 통해 가져온 후 toString 실행
		//bean 설정시 매개변수 생성자를 이용하여 초기화 진행
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");

		Address lee = (Address)factory.getBean("lee");
		Address kim = (Address)factory.getBean("kim");
		
		System.out.println(lee);
		System.out.println(kim);
	}

}
