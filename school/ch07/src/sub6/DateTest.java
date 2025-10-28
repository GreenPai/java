package sub6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜 : 2025/01/14
 * 이름 : 우상호
 * 내용 : Java Date 클래스 실습하기
 */
public class DateTest {

	public static void main(String[] args) {
		
		// Date클래스
		Date date = new Date();
		System.out.println(date); // date.toString을 간접적으로 호출
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = sdf.format(date);
		
		System.out.println("result : " + result);
		
		// Calendar 클래스
		Calendar cal = Calendar.getInstance();
		int year  = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int dt    = cal.get(Calendar.DATE);
		int hour  = cal.get(Calendar.HOUR_OF_DAY);
		int min   = cal.get(Calendar.MINUTE);
		int sec   = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%02d-%d %d:%d:%d", year, month, dt, hour, min, sec);
		
		
		
	}

}
