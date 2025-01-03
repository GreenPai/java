package sub1;

/*
 * 날짜 : 2024/12/31
 * 이름 : 우상호
 * 내용 : ch02.변수와 연산자 
 * 
 */

public class VariableTest {
	public static void main(String[] args) {
		
		// 변수
		int a = 3; // 초기화(최초로 변수에 값을 저장)
		int b = 7; 
		
		System.out.println("a 값 : " + a);
		System.out.println("b 값 : " + b);
		
		a=5; // 재할당
		b=9;
		
		System.out.println("a 값 : " + a);
		System.out.println("b 값 : " + b);
		
		// 상수 -> 항상 고정값이다.
		// 대문자를 쓰는 것이 관례이다.
		final int NUM = 5;
		
		System.out.println("num 값 : " + NUM);
		
	}
}
