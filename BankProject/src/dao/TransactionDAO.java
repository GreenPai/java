package dao;


public class TransactionDAO {
	
	private static final TransactionDAO INSTANCE = new TransactionDAO();

	public static TransactionDAO getInstance() {
		return INSTANCE;
	}
}
