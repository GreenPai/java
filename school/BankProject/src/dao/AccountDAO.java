package dao;

public class AccountDAO {
	
	private static final AccountDAO INSTANCE = new AccountDAO();
	
	public static AccountDAO getInstance() {
		return INSTANCE;
	}
}
