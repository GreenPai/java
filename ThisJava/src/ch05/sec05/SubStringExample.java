package ch05.sec05;

/*
 * 우상호
 * 장제목: 5장 참조타입 p163
 * 작성일: 2025.01.07
 */

public class SubStringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
