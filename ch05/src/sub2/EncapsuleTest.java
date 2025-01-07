package sub2;

/*
 * 날짜 : 2025/01/07
 * 이름 : 우상호
 * 내용 : JAVA 클래스 캡슐화 실습하기
 */

public class EncapsuleTest {
	public static void main(String[] args) {
		
		// Car 객체 생성 초기화
		Car sonata = new Car("소나타", "흰색", 10);
				
//		sonata.name="소나타";
//		sonata.color="흰색";
//		sonata.speed=10;
		
		sonata.speedUp(60);
		sonata.speenDown(20);
		sonata.show();
		
		/*
		 * 출력:
		 * 차량명: 아반테
		 * 차량색: 검정
		 * 현재속도 : 20
		 */
		
		Car av = new Car("아반테", "검정", 0);
		av.speedUp(30);
		av.speenDown(10);
		av.show();
		
		av.setColor("흰색");
		av.show();
		
		/*
		 * Account 객체 생성 초기화(캡슐화 적용)
		 * 출력:
		 * 은행명: 국민은행
		 * 계좌번호 : 110-11-1011
		 * 입금주 : 김유신
		 * 현재잔액 : 10000
		 */
		
		Account kb = new Account("국민은행", "110-11-1011", "김유신", 10000);
		kb.deposit(20000);
		kb.withdraw(20000);
		kb.show();
		
		// 김유신 -> 김유진 개명
		kb.setName("김유진");
		kb.show();
		
		
				
		/*
		 * Account 객체 생성 초기화 (캡슐화 적용)
		 * 출력:
		 * 은행명 : 우리은행
		 * 계좌번호 : 110-11-1211
		 * 입금주 : 김춘추
		 * 현재잔액 : 15000
		 */
		
		Account we = new Account("우리은행", "110-11-1211", "김춘추", 10000);
		we.deposit(10000);
		we.withdraw(5000);
		we.show();
		
		// 우리 은행 -> 유리은행 상호 변경
		we.setBank("유리은행");
		we.show();
		
		
	}
}
