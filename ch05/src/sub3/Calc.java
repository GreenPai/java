package sub3;

//싱글톤 객체
public class Calc {
	
	/* 싱글톤 ------------------------------------------------------- */
	
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	//외부에서 Calc 클래스를 생성 못하도록 막는다.
	private Calc() {}
	

	/*------------------------------------------------------- */
	
	public int plus(int x, int y) {
		return x + y;
	}

	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
	
}
