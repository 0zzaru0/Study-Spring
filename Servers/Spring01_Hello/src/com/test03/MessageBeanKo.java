package com.test03;

public class MessageBeanKo implements MessageBean {
	
	public MessageBeanKo() {
		System.out.println("ko �⺻������");
	}
	

	@Override
	public void sayHello(String name) {
		System.out.println("�ȳ��ϼ���." + name +"��");
		
	}

}
