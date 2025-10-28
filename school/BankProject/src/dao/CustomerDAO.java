package dao;

import java.util.ArrayList;
import java.util.List;

import db.DBHelper;
import db.SQL;
import entity.Customer;

public class CustomerDAO extends DBHelper {
	private static final CustomerDAO INSTANCE = new CustomerDAO();
	
	public static CustomerDAO getInstance() {
		return INSTANCE;
	}
	
	public void registerCustomer(Customer customer) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, customer.getC_no());
			psmt.setString(2, customer.getC_name());
			psmt.setInt(3, customer.getC_dist());
			psmt.setString(4, customer.getC_phone());
			psmt.setString(5, customer.getC_addr());
			
			psmt.executeUpdate();
			closeAll();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public Customer loginCustomer(String c_no) {
		
		Customer customer = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, c_no);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				customer = new Customer();
				customer.setC_no(rs.getString(1));
				customer.setC_name(rs.getNString(2));
				customer.setC_dist(rs.getInt(3));
				customer.setC_phone(rs.getString(4));
				customer.setC_addr(rs.getString(5));
			}
			
			closeAll();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return customer;
	}

	public List<Customer> selectCustomers() {
		
			List<Customer> customers = new ArrayList<>();
			try {
				conn = getConnection();
				stmt = conn.createStatement();
				rs = stmt.executeQuery(SQL.SELECT_CUSTOMERS);
				
				while(rs.next()) {
					Customer customer = new Customer();
					customer.setC_no(rs.getString(1));
					customer.setC_name(rs.getNString(2));
					customer.setC_dist(rs.getInt(3));
					customer.setC_phone(rs.getString(4));
					customer.setC_addr(rs.getString(5));
					customers.add(customer);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		return customers;
	}
	
	
}
