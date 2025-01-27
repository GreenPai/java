package test6.sub10;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private int orderNo;
	private Customer customer;
	private List<Product> products;
	private int totalPrice;
	
	public Order(int orderNo, Customer customer) {
		this.orderNo = orderNo;
		this.customer = customer;
		this.products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}
	
	

}
