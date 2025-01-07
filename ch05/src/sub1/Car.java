package sub1;

/*
 *	날짜 : 2025/01/07
 *	이름 : 우상호
 *	내용 : JAVA 클래스 실습하기
 */

// Car 클래스 정의(설계)
public class Car {

	// 속성(멤버 변수)
	String name;
	String color;
	int speed;
		
	// 기능(멤버 메서드)
	public void speedUp(int speed) {
		// this는 현재 클래스를 지칭
		this.speed += speed;
	}
		
	public void speenDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}

}
