package sub1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 날짜 : 2025/01/13
 * 이름 : 우상호
 * 내용 : Java 예외처리 실습하기
 */
public class ExceptionTest {
	public static void main(String[] args) {
		////////////////
		// 실행예외(런타임)
		////////////////
		
		//예외상항 - 어떤 수를 0으로 나눌 때
		int num1 = 1;
		int num2 = 0;
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = 0;
		
		try {
			//예외가 가능한 코드 작성
			 r4 = num1 / num2;
		}catch(Exception e) { // 다형성이 적용된 catch 구문 - Exception은 많은 에러 메시지의 Upcasting
			e.printStackTrace(); //예외 내용 콘솔 출력
		}
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		
		// 예외상황2 - 배열 인덱스
		int[] arr = {1,2,3,4,5};
		
		try {
			arr[5] = 5;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// 예외상황3 - 객체 생성없이 메서드 호출
		Animal animal = null; // 객체 선언, null은 값이 없음을 의미하는 값
	
		try {
			animal.move();
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		
		// 예외상항4 - 잘못된 캐스팅
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		//다운 캐스팅
		// Tiger tiger = (Tiger)a1;
		// Shark shark = (Shark)a2;
	
		// 다운캐스팅 
		if(a1 instanceof Tiger) {
			Tiger tiger = (Tiger) a1;
			tiger.move();
			tiger.hunt();
		}
		
		try {
			Shark shark = (Shark) a2;
			shark.move();
			shark.hunt();
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
		
		
		////////////////
		// 일반예외(컴파일 타임)
		////////////////
		
		// 동적 객체 생성
		try {
			Class clazz = Class.forName("sub1.Eagle");
			Constructor<?> constructor = clazz.getDeclaredConstructor();
			Eagle eagle = (Eagle) constructor.newInstance(); // 동적 객체 생성
			
			eagle.move();
			eagle.hunt();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} //sub1 패키지에 Eagle 클래스 정보 불러오기
		catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}finally {
			// 예외처리 발생여부에 상관없이 마지막에 무조건 실행되는 로직
			System.out.println("finally 실행...");
		}
		
		
		
		
		
		System.out.println("프로그램 정상 종료...");
	}// main end

}
