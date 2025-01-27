package test6.sub08;

public class Developer extends Person {

	private String field;

	public Developer(String name, String birth, String field) {
		super(name, birth);
		this.field = field;
	}
	
	public void changeField(String field) {
		this.field = field;
	}
	
	public void printDeveloperInfo() {
		super.printPersonInfo();
		System.out.println("개발분야 : " + field);
	}
}
