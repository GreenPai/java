package service;

import java.util.List;

import dao.CustomerDAO;
import entity.Customer;

public class CustomerService {
	
	// 싱글톤
	private static final CustomerService INSTANCE = new CustomerService(); 
	
	public static CustomerService getInstance() {
		return INSTANCE;
	}
	
	private CustomerService() {}

	// DAO 객체 
	private CustomerDAO dao = CustomerDAO.getInstance();
	
	// 서비스 메서드
	
	// 회원가입
	public void registerCustomer(Customer customer) {
		dao.insertCustomer(customer);
	}
	
	// 로그인
	public Customer loginCustomer(String custId) {
		return dao.selectCustomer(custId);
	}
	
	
	// 회원탈퇴
	public void removeCustomer(String custId) {
		dao.deleteCustomer(custId);
	}
	
	// 회원수정
	public void modifyCustomer(Customer customer) {
		dao.updateCustomer(customer);
	}

	public List<Customer> listCustomer() {
		List<Customer> Customers= dao.listCustomer();
		return Customers;
	}
	
}
