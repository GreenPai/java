package test6.sub02;

public class Product {
	
	private String productId;   //상품 아이디
	private String productName; //상품 이름
	private int price;          //상품 가격
	private int quantity;       //재고 수량
	
	
	public Product(String productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void updatePrice(int price) {
		this.price = price;
		System.out.println("키보드 가격 수정 됨");
	}
	
	public void addStock(int quantity) {
		this.quantity += quantity;
		System.out.printf("키보드 %2d개 재고 추가 됨 \n" , quantity );
	}
	
	public void printProductInfo() {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price);
		System.out.println(quantity);
	}

}
