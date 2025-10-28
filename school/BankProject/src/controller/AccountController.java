package controller;

import java.util.Scanner;

import entity.Customer;
import service.AccountService;


public class AccountController {
	private static final AccountController INSTANCE = new AccountController();
	
	public static AccountController getInstance() {
		return INSTANCE;
	}
	
	private AccountService service = AccountService.getInstance();
	
	public Customer manage(Scanner sc ) {
		
		Customer loginCustomer = null;
		
		while(true){
			System.out.println("--------- 계좌관리 ---------");
			System.out.println("0: 종료, 1:계좌개설, 2:입금, 3:출금 4:잔액");
			System.out.print("선택> :");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				case 0: return loginCustomer;
				case 1: 
					// 회원가입
					
					break;
				case 2: 
					// 로그인
					
					break;
				case 3: 
					// 회원목록
					
					break;
				default : 
					System.out.println("잘못 입력하셨습니다.");
					break;
			}// switch end
		}// while end
	
	
	}// manage end
}
