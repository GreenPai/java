package service;


import dao.TransactionDAO;

public class TransactionService {
	
	private static final TransactionService INSTANCE = new TransactionService();
	private TransactionDAO  dao = TransactionDAO.getInstance();
	
	public static TransactionService getInstance() {
		return INSTANCE;
	}

}
