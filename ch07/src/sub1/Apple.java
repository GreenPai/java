package sub1;

public class Apple { // 암묵적으로 Object 클래스 상속 - extends Object
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
	
	
	
	
	
}
