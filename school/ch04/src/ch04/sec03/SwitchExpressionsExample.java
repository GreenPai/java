package ch04.sec03;

/*
 * 날짜 : 2025/01/03
 * 이름 : 우상호
 * 내용 : Java switch 문 실습하기 
 */
public class SwitchExpressionsExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A', 'a' -> {
				System.out.println("우수 회원입니다.");
			}
			case 'B', 'b' -> {
				System.out.println("일반 회원입니다.");
			}
			default -> {
				System.out.println("손님입니다.");
			}
		}
		
		
		}

}
