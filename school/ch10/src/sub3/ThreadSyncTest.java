package sub3;

/**
 * 날짜 : 2025/01/20
 * 이름 : 우상호
 * 내용 : Java 스레드 동기화 실습하기
 */

public class ThreadSyncTest {
	
	public static void main(String[] args) {
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);

		/*
		ct1.run();
		ct2.run();
		ct3.run();
		*/
		
		//비동기 방식 
		//작업이 끝나기 전에 main이 더 먼저 끝나서 값이 0이 나온다.
		ct1.start();
		ct2.start();
		ct3.start();
		
		//쓰레드 3개가 setNum() 메서드를 서로 경쟁하는 경우가 발생합니다.
		
		try {
			ct1.join();
			ct2.join();
			ct3.join();
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("count 결과 : " + count.getNum());
	}
}
