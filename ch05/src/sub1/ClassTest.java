package sub1;

/*
 *	날짜 : 2025/01/07
 *	이름 : 우상호
 *	내용 : JAVA 클래스 실습하기
 */


public class ClassTest {
	public static void main(String[] args) {
		// car 객체 생성
		Car sonata = new Car();
		// 객체 초기화
		sonata.name =  "소나타";
		sonata.color = "흰색";
		sonata.speed =  0;
		
		sonata.speedUp(100);
		sonata.speenDown(20);
		
		sonata.show();
		
		System.out.println();
		
		// 객체 선언
		Car avante;
		
		// 객체 생성
		avante = new Car();
		// 객체 초기화
		avante.name = "아반테";
		avante.color="흰색";
		avante.speed=10;
		
		//객체 상호작용
		avante.speedUp(70);
		avante.speenDown(20);
		avante.show();
		
		// Account 객체 생성
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id = "110-12-1101";
		kb.name="김유신";
		kb.balance=10000;
		
		kb.deposit(100000);
		kb.withdraw(50000);
		kb.show();
		
		/*
		 * 출력:
		 * 은행명 : 우리은행
		 * 계좌번호 : 110-11-1021
		 * 입금주 : 김춘추
		 * 현재잔액 : 15000
		 */
	
		Account we = new Account();
		we.bank="우리은행";
		we.id="110-11-1021";
		we.balance=15000;
		we.name="김춘추";
	
		we.show();
	}
}
