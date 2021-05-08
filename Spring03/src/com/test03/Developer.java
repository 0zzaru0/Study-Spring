package com.test03;

public class Developer extends Emp {
	
	// setter나 생성자를 이용한 초기화였다면 생성자 + setter 같이 해보는 걸로 한다 
	
	private String dept;

	public Developer() {}

	//emp 부모클래스 필드를 초기화 할 수 있는 생성자 
	public Developer(String name, int salary) {
		super(name, salary);

	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + "\t 부서 : " + dept ;
	}

	
	
	
	

}
