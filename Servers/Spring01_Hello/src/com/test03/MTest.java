package com.test03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MTest {
	public static void main(String[] args) {
		
		//스프링은 거대한 컨테이너임과 동시에 Ioc/DI를 기반으로 하고 있는 거룩한 존재이며 서비스 추상화를 통해
		//삼위 일체로 .. 엥.. 토비의 스프링..
	
		// bean 생성 주입~
		
		//bean 생성시점
		//BeanFactory : 처음으로 getBean()이 호출된 시점에서야 해당 빈을 생성 ( lazy loading, 게으른 호출)
		//ApplicationContext : 컨텍스트 초기화 시점에 모든 빈을 미리 로드한 후 사용
		
		
		//1. 	
		Resource res = new ClassPathResource("com/test03/beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		
		//2.xml 파일 읽어서 bean 생성되게 처리 
		//ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/beans.xml");
		
	
		
		//new연산자없이 객체 생성했다. spring이 알아서 해준 것
		//기본 생성자 나오는거 확인 
		
		MessageBean bean = (MessageBean)factory.getBean("korean");
		bean.sayHello("스프링");
		
	
		bean = (MessageBean)factory.getBean("english");
		bean.sayHello("Spring");
		
		
	}

}
