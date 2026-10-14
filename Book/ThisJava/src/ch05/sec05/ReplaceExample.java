package ch05.sec05;

/*
 * 우상호
 * 장제목: 5장 참조타입 p162
 * 작성일: 2025.01.07
 */

public class ReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
