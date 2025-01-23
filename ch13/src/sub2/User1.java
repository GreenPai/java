package sub2;

//User1 테이블 엔티티 클래스 
public class User1 {
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public User1() {}
	
	public User1(String uid, String name, String hp, int age) {
		this.uid  = uid;
		this.name = name;
		this.hp   = hp;
		this.age  = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getHp() {
		return hp;
	}
	
	public String getName() {
		return name;
	}
	
	public String getUid() {
		return uid;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "User1 [uid=" + uid + ", name=" + name + ", hp=" + hp + ", age=" + age + "]";
	}
	
	
	
}

