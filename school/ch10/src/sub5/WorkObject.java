package sub5;

public class WorkObject {
	
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodA 작업 실행");
		notify();    // 다른 스레드를 실행 대기 상태로 만듬
		try {
			wait();  // 자신의 스레드를 일시 정지로 만듬.
		}catch(InterruptedException e){
			
		}
	}
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodB 작업 실행");
		notify();    // 다른 스레드를 실행 대기 상태로 만듬
		try {
			wait();  // 자신의 스레드를 일시 정지로 만듬.
		}catch(InterruptedException e){
			
		}
	}
	
	public synchronized void methodC() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodC 작업 실행");
		notify();    // 다른 스레드를 실행 대기 상태로 만듬
		try {
			wait();  // 자신의 스레드를 일시 정지로 만듬.
		}catch(InterruptedException e){
			
		}
	}
	
	
}
