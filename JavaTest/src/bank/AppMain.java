package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Account> accounts = new ArrayList<>();
	
	public static void main(String[] args) {
		
		boolean isRunning = true;
		while(isRunning) {
			System.out.println("--------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2){
				accountList();
			}else if(selectNo== 3){
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5)
				isRunning = false;
		}
		System.out.println("프로그램 종료");
	}
	


	private static void createAccount() {
		System.out.println("----------------- 계좌생성 -----------------");
	
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		
		System.out.print("계좌주: ");
		String owner = scanner.nextLine();
		
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		scanner.nextLine(); // 버퍼 잔처리
		
		Account account = new Account(ano,owner,balance);
		accounts.add(account);
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
	
	
	private static void accountList() {
		for(Account account : accounts) {
			System.out.println(account);
		}
	}
	
	private static void deposit() {
		
		try {
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();

			// 계좌 찾기
			Account account = findAccount(ano);
			if(account == null) {
				System.out.println("맞는 계좌가 없습니다. 초기화면으로 돌아갑니다.");
				return;
			}
			
			System.out.print("예금액: ");
			int money = scanner.nextInt();
			
			scanner.nextLine(); // 버퍼 잔처리
			
			
			// 돈 음수인 경우 오류처리.
			if(money < 0) {
				System.out.println("금액이 음수입니다. 초기화면으로 돌아갑니다.");
				return;
			}
			
			// 입금
			account.setBalance(account.getBalance() + money);
			
		}catch(Exception e) {
			System.out.println("입력 과정에서 오류가 발생해. 초기화면으로 돌아갑니다.");
			scanner.nextLine();
		}
		
		
	}
	
	private static void withdraw() {
		
		try {
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();

			// 계좌 찾기
			Account account = findAccount(ano);
			if(account == null) {
				System.out.println("맞는 계좌가 없습니다. 초기화면으로 돌아갑니다.");
				return;
			}
			
			System.out.print("출금액: ");
			int money = scanner.nextInt();
			
			scanner.nextLine(); // 버퍼 잔처리
			
			
			// 돈 음수인 경우 오류처리.
			if(money < 0) {
				System.out.println("금액이 음수입니다. 초기화면으로 돌아갑니다.");
				return;
			}else if(money > account.getBalance()) {
				System.out.println("출금 금액이 잔고보다 많습니다. 초기화면으로 돌아갑니다.");
			}
			
			// 출금
			account.setBalance(account.getBalance() - money);
			
		}catch(Exception e) {
			System.out.println("입력 과정에서 오류가 발생해. 초기화면으로 돌아갑니다.");
			scanner.nextLine();
		}
		
	}
	
	private static Account findAccount(String ano) {
		for(int i=0; i<accounts.size(); i++) {
			if(accounts.get(i).getAno().equals(ano)) {
				return accounts.get(i);
			}
		}
		return null;
	}
	
}
