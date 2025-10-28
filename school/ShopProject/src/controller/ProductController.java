package controller;

import java.util.List;
import java.util.Scanner;

import entity.Product;
import service.ProductService;

public class ProductController {
	
	ProductService service = ProductService.getInstance();
	
	public void manage(Scanner sc) {
			
			Product product = null;
			while(true) {
				sc.nextLine();
				
				System.out.println("--------- 상품관리 ---------");
				System.out.println("0: 메인, 1:상품등록, 2:상품목록, 3:상품검색");
				System.out.print("선택 : ");
				
				int choice = Integer.parseInt(sc.nextLine());
				//int choice = sc.nextInt();
				
				switch(choice) {
				case 0:
					// 메인이동
					return; // 메서드 종료
				case 1:
					// 상품등록
					product = InsertProduct(sc);
					service.InsertProduct(product);
					System.out.println(product);
					break;
				case 2:
					// 상품목록
					List<Product> products = service.selectProducts();
					
					break;
				case 3:
					// 상품검색
					int prodNo = inputProdNo(sc);
					product = service.SelectProduct(prodNo);
					if(product != null) {
						System.out.println(product);
					}else {
						System.err.println("관련된 상품이 없습니다.");
					}
					break;
				default:
					break; 
				} // switch end
			}// while end
	}
	
	public Product InsertProduct(Scanner sc) {
		
		System.out.print("제품 이름 입력(PRODNAME) : ");
		String prodname = sc.nextLine();
		
		System.out.print("제품 양(STOCK) : ");
		String stock = sc.nextLine();
		
		System.out.print("제품 가격(PRICE) : ");
		String price = sc.nextLine();
		
		System.out.print("회사(COMPANY) : ");
		String company = sc.nextLine();
		
		Product product = new Product(prodname, Integer.parseInt(stock), Integer.parseInt(price), company);
		return product;
	}
	
	public int inputProdNo(Scanner sc) {
		System.out.print("검색할 제품 번호를 입력해주세요.");
		return Integer.parseInt(sc.nextLine());
	}
	
	
}
