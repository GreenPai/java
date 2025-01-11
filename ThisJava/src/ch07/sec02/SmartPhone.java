package ch07.sec02;

import ch07.sec02.Phone;

public class SmartPhone extends Phone {
	//필드선언
	public boolean wifi;
	
	// 생성자 선언
	SmartPhone(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	// 메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
