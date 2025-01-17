package test4;

/*
 * 날짜 : 2025/01/17
 * 이름 : 우상호
 * 내용 : 예외처리 연습문제
 */

public class Test04 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";
		
		// int idx = fileName.
		int idx = fileName.indexOf(".");
		
		String title = fileName.substring(0, idx);
		System.out.println(title);
		String ext = fileName.substring(idx+1);
		System.out.println(ext);
		
		String strScores = "60, 72, 82, 86, 92";
		String[] scores = strScores.split(",");
		
		int total = 0;
		
		for(String score : scores) {
			total += Integer.parseInt(score.trim());
		}
		
		System.out.println("strScores 총점 : " + total);
	}

}
