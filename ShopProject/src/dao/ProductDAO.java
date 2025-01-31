package dao;

import java.util.ArrayList;
import java.util.List;

import db.DBHelper;
import db.SQL;
import entity.Product;

public class ProductDAO extends DBHelper{

	private final static ProductDAO INSTANCE = new ProductDAO();
	
	public static ProductDAO getINSTANCE() {
		return INSTANCE;
	}
	
	public void insertProduct(Product product) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_PRODUCT);
			psmt.setString(1, product.getProdName());
			psmt.setInt(2, product.getStock());
			psmt.setInt(3, product.getPrice());
			psmt.setString(4, product.getCompany());
			
			psmt.executeUpdate();
			psmt.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public Product selectProduct(int prodNo) {
		Product product = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
			psmt.setInt(1, prodNo);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				product = new Product();
				product.setProdNo(rs.getInt(1));
				product.setProdName(rs.getString(2));
				product.setStock(rs.getInt(3));
				product.setPrice(rs.getInt(4));
				product.setCompany(rs.getString(5));
			}
			psmt.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return product;
		
	}

	public List<Product> selectProducts() {
		List<Product> products = new ArrayList<>();
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement("");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
