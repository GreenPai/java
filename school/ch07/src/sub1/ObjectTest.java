package sub1;

/*
 * 날짜 : 2025/01/14
 * 이름 : 우상호
 * 내용 : Java Object 클래스 실습하기
 */


public class ObjectTest {
	public static void main(String[] args) {
		
		// 자바 최상위 클래스 Object로 다형성
		Object a1 = new Apple("한국",3000);
		Object a2 = new Apple("일본",2000);
		Object a3 = new Apple("한국", 3000);
		
		//객체 비교
		// == -> 스택값, equals -> 힙값
		if(a1 == a2) {
			System.out.println("객체 a1, a2 주소값이 같다");
		}else {
			System.out.println("객체 a1, a2 주소값이 다르다");
		}
		
		if(a1.equals(a2)) {
			System.out.println("객체 a1, a2 인스턴스가 서로 같다.");
		}else {
			System.out.println("객체 a1, a2 인스턴스가 서로 다르다");
		}
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		
		
	}
}
