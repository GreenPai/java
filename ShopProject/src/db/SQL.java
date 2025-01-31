package db;

public class SQL {
	
	// customer
	public static final String INSERT_CUSTOMER = "INSERT INTO `Customer` VALUES (?,?,?,?,NOW())";
	public static final String SELECT_CUSTOMER = "SELECT * FROM `Customer` WHERE `custId`=?";
	public static final String SELECT_CUSTOMERS = "SELECT* FROM `Customer";
	
	// order
	public static final String INSERT_ORDER = "INSERT INTO `Orders` SET "
												+ "`orderId`=?,"
												+ "`orderProduct`=?,"
												+ "`orderCount`=?,"
												+ "`orderDate`=NOW()";
	
	public static final String SELECT_ORDERS = "SELECT "
												+ "`orderNo`,"
												+ "`orderId`,"
												+ "`prodName`,"
												+ "`orderCount`,"
												+ "`price`,"
												+ "`orderCount` * `price` as `total`,"
												+ "`orderDate` "
												+ "FROM `Orders` as a "
												+ "JOIN `Product` as b ON a.orderProduct = b.prodNo";

	public static final String SELECT_MY_ORDER = "SELECT * FROM `ORDERS` WHERE `ORDERID` = ?";
	
	// product
	// alter table `product` modify `prodNo` int auto_increment;
	public static final String INSERT_PRODUCT = "INSERT INTO `Product` SET "
												+ "`prodName`=?,"
												+ "`stock`=?,"
												+ "`price`=?,"
												+ "`company`=?";
	
	public static final String SELECT_PRODUCTS = "SELECT * FROM `Product`";
	
	public static final String SELECT_PRODUCT = "SELECT * FROM `PRODUCT` WHERE PRODNO = ?";
	
}