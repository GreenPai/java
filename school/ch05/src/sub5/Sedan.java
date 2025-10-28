package sub5;

public class Sedan extends Car{

	private int cc;
	private final int MAX_SPEED = 180;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	
	@Override
	public void speedUp(int speed) {
		// Sedan 클래스 맞게 메서드를 재정의
		this.speed += speed;
		
		if(this.speed > MAX_SPEED) {
			this.speed = MAX_SPEED;
		}
	}
	
	public void turbo() {
		 this.speed += 20;
	}

	public void show() {
		System.out.println("차량명 : "   + this.name);
		System.out.println("차량색 : "   + this.color);
		System.out.println("배기량 : "   + this.cc);
		System.out.println("현재속도 : " + this.speed);
		System.out.println("-------------------------");
	}
}
