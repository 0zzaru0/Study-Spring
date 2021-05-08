package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main (String[]args) {
		
		/*
		 * 1. context 파일에 bean 2개 설정
		 *  - bean 하나는 생성자, 다른 하나는 setter을 이용하여 초기화
		 * 	- bean들의 id 값들은 임의로 지정
		 * 2. main getBean을 통해 생성된 빈을 주입시켜 toString로 확인
		 */
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		Emp kim = factory.getBean("lee",Emp.class);
		Emp lee = factory.getBean("kim",Emp.class);
		
		System.out.println(kim);
		System.out.println(lee);
		
		
		
		
	}

}
