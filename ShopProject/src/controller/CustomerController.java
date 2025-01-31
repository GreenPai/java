package controller;
import java.util.List;
import java.util.Scanner;

import entity.Customer;
import service.CustomerService;

public class CustomerController {
	
	// 서비스 객체
	private CustomerService service = CustomerService.getInstance();
	
	public Customer manage(Scanner sc) {
	
		Customer loginedCustomer = null;
		
		while(true) {
			System.out.println("--------- 회원관리 ---------");
			
			if(loginedCustomer == null) {
				System.out.println("0: 메인, 1:회원가입, 2:로그인, 3:회원목록");
			}else {
				System.out.println("0: 메인, 1:나의정보, 2:로그아웃, 3:회원목록");
			}
			
			System.out.println("선택 : ");
			
			int choice = sc.nextInt();
		
			switch(choice) {
			case 0:
				// 메인이동
				return loginedCustomer;
			case 1:
				if(loginedCustomer == null) {
					// 회원가입
					Customer inputCustomer = inputCustomer(sc);
					service.registerCustomer(inputCustomer);
					System.out.println("회원가입이 완료 되었습니다.");
				}else {
					// 나의 정보
					System.out.println(loginedCustomer);
				}
				break;
			case 2:
				if(loginedCustomer == null) {
					// 로그인
					String inputCustid = inputCustId(sc);
					loginedCustomer = service.loginCustomer(inputCustid);
					
					if(loginedCustomer != null) {
						System.out.println(loginedCustomer.getName() + "님이 로그인 했습니다.");
					}else {
						System.out.println("로그인에 실패했습니다.");
					}
				}else {
					// 로그아웃
					loginedCustomer = null;
				}
				break;
			case 3:
				// 회원목록
				List<Customer> customers = service.listCustomer();
				System.out.println(customers);
				break;
			default:
				break; 
			} // switch end
		}// while end
	}// manage end
	
	// 회원가입
	public Customer inputCustomer(Scanner sc) {
		sc.nextLine();
		
		System.out.print("아이디 : ");
		String custId = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("휴대폰 : ");
		String hp = sc.nextLine();
		
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		
		return new Customer(custId, name, hp, addr);
		
	}

	// 로그인
	public String inputCustId(Scanner sc) {
		sc.nextLine();
		
		System.out.print("아이디 : ");
		String custId = sc.nextLine();
		return custId;
	}
}
