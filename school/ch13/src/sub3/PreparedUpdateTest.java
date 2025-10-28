package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2025/01/23
 * 이름 : 우상호
 * 내용 : Java CRUD 실습하기
 */
public class PreparedUpdateTest {
	
	public static void main(String[] args) {
		
		String sql = "UPDATE `user1` SET `name`=? , `hp`=?, `age`= ? ";
			sql += "WHERE `uid`=?";
			
			String HOST = "jdbc:mysql://127.0.0.1:3306/studydb";
			String USER = "root";
			String PASS = "1234";
			
			try {
				// 1단계 - JDBC 드라이버 로드
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// 2단계 - 데이터베이스 접속
				Connection conn = DriverManager.getConnection(HOST, USER, PASS);
				
				// 3단계 - SQL 객체 생성
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, "한사랑");
				psmt.setString(2, "010-1234-5757");
				psmt.setInt(3, 28);
				psmt.setString(4, "j101");
				
				// 4단계 - SQL 실행
				psmt.executeUpdate();
				// 5단계 - 조회 결과 처리
				
				// 6단계 - 데이터베이스 종료
				psmt.close();
				conn.close();
				
			}catch(Exception e) {
				
			}
			
			System.out.println("Insert 성공 ...");
			
			
	}
}
