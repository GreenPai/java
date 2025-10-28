package service;

import java.util.List;

import dao.CustomerDAO;
import entity.Customer;

public class CustomerService {
	
	private static final CustomerService INSTANCE = new CustomerService();
	private CustomerDAO dao = CustomerDAO.getInstance();
	
	public static CustomerService getInstance() {
		return INSTANCE;
	}


	public void registerCustomer(Customer customer) {
		dao.registerCustomer(customer);
	}


	public Customer loginCustomer(String c_no) {
		Customer customer = dao.loginCustomer(c_no);
		
		return customer;
		
	}


	public List<Customer> selectCustomers() {
		
		return dao.selectCustomers();
	}
	
	

}
