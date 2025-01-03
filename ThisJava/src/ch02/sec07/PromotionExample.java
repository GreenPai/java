package ch02.sec07;

/*
 * 우상호
 * 장제목: 2장 변수와 타입
 * 작성일: 2024.12.31
 */

public class PromotionExample{
	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue:" + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드:" + intValue);

		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue:" + longValue);
		
		longValue = 1000;
		float floatValue=longValue;
		System.out.println("floatValue:" + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue:" + doubleValue);
	}
}
