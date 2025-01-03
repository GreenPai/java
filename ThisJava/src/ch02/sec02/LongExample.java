package ch02.sec02;

/*
 * 우상호
 * 장제목: 2장 변수와 타입
 * 작성일: 2024.12.31
 */

public class LongExample{
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;  
//		long var3 = 10000000000000;  //컴파일러는 int로 간주하기에 에러
		long var4 = 10000000000000L; 
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
//		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		
		
	}
}
