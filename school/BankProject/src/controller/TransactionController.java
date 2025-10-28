package controller;


import java.util.Scanner;

import entity.Customer;

import service.TransactionService;

public class TransactionController {
	
	private static final TransactionController INSTANCE = new TransactionController();
	
	public static TransactionController getInstance() {
		return INSTANCE;
	}
	
	private TransactionService service = TransactionService.getInstance();
	
	public Customer manage(Scanner sc) {
		
		Customer loginCustomer = null;
		
		while(true){
			System.out.println("--------- 거래관리 ---------");
			System.out.println("0: 종료, 1:입금, 2:출금, 3:조희");
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
