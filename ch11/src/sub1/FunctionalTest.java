package sub1;

/*
 * 날짜 : 2025/01/21
 * 이름 : 우상호
 * 내용 : Java 함수형 프로그래밍
 */

interface Person{
	public void hello(); 
}

class Student implements Person{
	
	@Override
	public void hello() {
		System.out.println("Hello Student!");
	};
}

public class FunctionalTest {

	public static void main(String[] args) {
		
		// 객체지향 프로그래밍
		Person student = new Student();
		student.hello();
		
		// 익명객체(인터페이스를 직접 객체로 생성)
		Person developer = new Person() {
			
			@Override
			public void hello() {
				System.out.println("Hello Developer");
			}
		};
		
		developer.hello();
		
		// 함수형 프로그래밍
		Person teather = () -> {
			System.out.println("Hello Teacher!");
		};
		
		teather.hello();
		
		
	}

}
