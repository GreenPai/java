package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sub2.User1;

public class PreparedSelectTest {
	public static void main(String[] args) {
		
		String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
		String USER = "root";
		String PASS = "1234";
		
		String sql = "SELECT * FROM `user1`";
		List<User1> users = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {

				User1 user1 = new User1();
				user1.setUid(rs.getString(1));
				user1.setName(rs.getString(2));
				user1.setHp(rs.getString(3));
				user1.setAge(rs.getInt(4));
				
				users.add(user1);
				
			}
			
			rs.close();
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			
		}
		
		for(User1 u : users) {
			System.out.println(u);
		}
		
		System.out.println("SELECT문 완료 ...");
		
	}
}
