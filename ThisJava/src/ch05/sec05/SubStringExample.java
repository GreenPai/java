package ch05.sec05;

/**
 * 날짜 : 2025-01-07
 * 이름 : 우상호
 * 내용 : substring
 * 
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
