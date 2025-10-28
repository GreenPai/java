package service;

import dao.AccountDAO;
import dao.CustomerDAO;

public class AccountService {
	
	private static final AccountService INSTANCE = new AccountService();
	private AccountDAO dao = AccountDAO.getInstance();
	
	public static AccountService getInstance() {
		return INSTANCE;
	}
}
