package sub2;

/**
 * 날짜 : 2025/01/20
 * 이름 : 우상호
 * 내용 : Java 스레드 상태 실습하기
 */

class WorkThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println("WorkThread...");
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("WorkThread 종료");
	};
}

public class ThreadJoinTest {
	public static void main(String[] args) {
		
		WorkThread work = new WorkThread();
		
		// 스레드 실행
		work.start();
		
		try {
			work.join(); //Main 스레드가 Work 스레드 종료 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료"); // 프로그램 종료
	}

}
