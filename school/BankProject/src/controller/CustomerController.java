package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Customer;
import service.CustomerService;

public class CustomerController {

	private CustomerService service = CustomerService.getInstance();
	
	public Customer manage(Scanner sc) {
		
		Customer loginCustomer = null;
		
		while(true){
			System.out.println("--------- 회원관리 ---------");
			System.out.println("0: 종료, 1:회원가입, 2:로그인, 3:회원목록");
			System.out.print("선택> :");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				case 0: return loginCustomer;
				case 1: 
					// 회원가입
					Customer customer = inputCustomer(sc);
					System.out.println(customer);
					service.registerCustomer(customer);
					break;
				case 2: 
					// 로그인
					String c_no = inputc_no(sc);
					loginCustomer = service.loginCustomer(c_no);
					System.out.println(loginCustomer.getC_name() + "님 로그인이 완료되었습니다.");
					break;
				case 3: 
					// 회원목록
					List<Customer> customers = new ArrayList<>();
					customers = service.selectCustomers();
					System.out.println(customers);
					break;
				default : 
					System.out.println("잘못 입력하셨습니다.");
					break;
			}
		}

	
	}

	private String inputc_no(Scanner sc) {
		sc.nextLine();
		
		System.out.print("고객번호(c_no) : ");
		String c_no = sc.nextLine();
		return c_no;
	}

	private Customer inputCustomer(Scanner sc) {
		
		sc.nextLine();
		System.out.print("고객번호(c_no) : ");
		String c_no = sc.nextLine();
		
		System.out.print("고객명(c_name) : ");
		String c_name = sc.nextLine();
		
		System.out.print("고객구분(c_dist) : ");
		int c_dist = Integer.parseInt(sc.nextLine());
		
		System.out.print("전화번호(c_phone) : ");
		String c_phone = sc.nextLine();
		
		System.out.print("주소(c_addr) : ");
		String c_addr = sc.nextLine();
		
		return new Customer(c_no, c_name, c_dist, c_phone, c_addr);
	}

}
