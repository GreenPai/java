package controller;
import java.util.Scanner;

public class CustomerController {

	public void manage(Scanner sc) {
		
		while(true) {
			System.out.println("--------- 회원관리 ---------");
			System.out.println("0: 메인, 1:회원가입, 2:회원목록, 3:로그인");
			System.out.println("선택 : ");
			
			int choice = sc.nextInt();
		
			switch(choice) {
			case 0:
				// 메인이동
				return;
			case 1:
				// 회원가입
				break;
			case 2:
				// 회원목록
				break;
			case 3:
				break;
				// 로그인
			default:
				break; 
			} // switch end
	}

}
}
