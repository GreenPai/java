package sub5;

/*
 * 날짜 : 2025/01/14
 * 이름 : 우상호
 * 내용 : Java Math 클래스 실습하기
 */
public class MathTest {

	public static void main(String[] args) {
		// Math m = new Math();
		// 기본 메서드
		System.out.println("절대값 : " + Math.abs(-5));
		System.out.println("제곱근 : " + Math.sqrt(9));
		System.out.println("올림값 : " + Math.ceil(4.6));
		System.out.println("올림값 : " + Math.ceil(4.2));
		System.out.println("내림값 : " + Math.floor(4.6));
		System.out.println("내림값 : " + Math.floor(4.2));
		System.out.println("반올림 : " + Math.round(4.6));
		System.out.println("반올림 : " + Math.round(4.2));
		
		//random 메서드
		System.out.println("랜덤 : " + Math.random());
		double num1 = Math.random();
		double num2 = num1 * 10;
		System.out.println(num2);
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : " + num3);
		
		double rand = Math.ceil(Math.random() * 45);
		System.out.println("rand : "  + rand);
		
	}

}
