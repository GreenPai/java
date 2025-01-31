package db;

public class SQL {
	
	// CUSTOMER
	public static final String INSERT_CUSTOMER  = "INSERT INTO `bank_customer` values (?,?,?,?,?)";
	public static final String SELECT_CUSTOMER  = "SELECT * FROM `bank_customer` WHERE `C_NO` = ?";
	public static final String SELECT_CUSTOMERS = "SELECT * FROM `bank_customer`";
}
