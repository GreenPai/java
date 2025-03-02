package service;

import java.util.List;

import dao.OrderDAO;
import entity.Order;

public class OrderService {

	private static final OrderService INSTANCE = new OrderService();
	public static OrderService getInstance() {
		return INSTANCE;
	}
	private OrderService() {}
	
	private OrderDAO dao = OrderDAO.getInstance();
	
	public void makeOrder(Order order) {
		dao.insertOrder(order);
	}
	
	public List<Order> showOrders() {
		return dao.selectOrders();
	}
	public Order selectMyOrder(String custId) {
		return dao.selectMyOrder(custId);
	}
}