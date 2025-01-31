package service;

import java.util.List;

import dao.ProductDAO;
import entity.Product;

public class ProductService {
	
	private static final ProductService INSTANCE = new ProductService();
	
	public static ProductService getInstance() {
		return INSTANCE;
	}
	
	private ProductService() {}
	
	private ProductDAO dao = ProductDAO.getINSTANCE();

	public void InsertProduct(Product product) {
		dao.insertProduct(product);
		
	}

	public Product SelectProduct(int prodNo) {
		Product product = dao.selectProduct(prodNo);
		return product;
		
	}

	public List<Product> selectProducts() {
		return dao.selectProducts();
	}

}
