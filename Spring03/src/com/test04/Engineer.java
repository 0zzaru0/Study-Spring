package com.test04;

public class Engineer {

	//emp 클래스 객체를 필드로 가진다
	// is a 관계 / has a 관계

	private Emp emp;
	private String dept;
	
	public Engineer() {}

	public Engineer(Emp emp, String dept) {
		this.emp = emp;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return emp +"\t부서 : " + dept;
	}
	
	
	
	
}
