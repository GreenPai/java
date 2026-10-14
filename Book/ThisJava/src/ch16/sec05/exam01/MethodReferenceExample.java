package ch16.sec05.exam01;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		//메소드 참조
		person.action(Computer :: staticMethod);
		
		//인스턴스 메소드일 경우
		Computer com = new Computer();
		person.action(com::instanceMethod);
	}
}
