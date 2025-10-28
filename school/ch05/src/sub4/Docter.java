package sub4;

public class Docter extends Person{

	private String specialty;
	
	public Docter(String name, int age, String specialty) {
		super(name, age);
		this.specialty = specialty;
	}
	
	public void work() {
		super.introduce();
		System.out.println("저는 의사이며 전공은 " + specialty + " 입니다.");
	}

}
