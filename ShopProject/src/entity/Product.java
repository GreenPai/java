package entity;

public class Product {
	private int ProdNo;
	private String ProdName;
	private int Stock;
	private int Price;
	private String Company;
	
	// 생성자
	public Product(){}
	
	public Product(int prodNo, String prodName, int stock, int price, String company) {
		super();
		ProdNo = prodNo;
		ProdName = prodName;
		Stock = stock;
		Price = price;
		Company = company;
	}

	public Product(String prodName, int stock, int price, String company) {
		super();
		ProdName = prodName;
		Stock = stock;
		Price = price;
		Company = company;
	}
	
	
	
	
	// Getter/Setter
	public int getProdNo() {
		return ProdNo;
	}

	public void setProdNo(int prodNo) {
		ProdNo = prodNo;
	}

	public String getProdName() {
		return ProdName;
	}

	public void setProdName(String prodName) {
		ProdName = prodName;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	// toString
	@Override
	public String toString() {
		return "Product [ProdNo=" + ProdNo + ", ProdName=" + ProdName + ", Stock=" + Stock + ", Price=" + Price
				+ ", Company=" + Company + "]";
	}

	
	
}
