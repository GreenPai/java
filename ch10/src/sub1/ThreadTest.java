package sub1;

/**
 * 날짜 : 2025/01/20
 * 이름 : 우상호
 * 내용 : Java (Thread) 실습하기
 */

class SubThread extends Thread{
	
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(getName() + " 스레드 실행 중...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(getName() + " 스레드 종료...");
	};
}

public class ThreadTest {

	public static void main(String[] args) {
		
		//스레드 생성
		SubThread st1 = new SubThread();
		SubThread st2 = new SubThread();
		
		//스레드 이름
		st1.setName("작업1");
		st2.setName("작업2");
		
		st1.start();
		st2.start();
		
		// 메인 스레드 작업 실행
		for(int i=0; i<10; i++) {
			System.out.println(" 메인 스레드 실행 중...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(" 메인 스레드 종료...");
	}
}
