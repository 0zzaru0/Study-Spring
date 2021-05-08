package com.test06;

public class LgTV implements TV{
	
	public LgTV() {
		System.out.println("lg tv 생성완료");
	}

	@Override
	public void powerOn() {
		System.out.println("lg tv on");
		
	}

	@Override
	public void powerOff() {
		System.out.println("lg tv off");
		
	}

	@Override
	public void volUp() {
		System.out.println("lg tv volume up");
		
	}

	@Override
	public void volDown() {
		System.out.println("lg tv volume down");
		
	}
	
	

}
