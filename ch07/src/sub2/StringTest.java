package sub2;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "Hello"; //리터럴 방식
		String str2 = new String("Hello");
		
		//문자열 비교 - 문자열 비교는 무조건 equals()!!!
		if(str1 == str2) System.out.println("응 맞아");
		if(str1.equals(str2)) System.out.println("응 맞아2");
		
		System.out.println("str1 : "  + str1);
		System.out.println("str2 : "  + str2);
		
		//문자열 길이
		String message = "Hello,Korea";
		System.out.println("message 길이 : " + message.length());
		
		// 문자열 추출
		char c1 = message.charAt(0);
		char c2 = message.charAt(6);
		System.out.println("message 문자열 1번째 문자 : " + c1);
		System.out.println("message 문자열 7번째 문자 : " + c2);
		
		//문자열 자르기
		String sub1 = message.substring(0,5);
		String sub2 = message.substring(6);
		
		System.out.println("message 문자열 0 ~ 5까지 문자열 : " + sub1);     
		System.out.println("message 문자열 6 ~ 마지막 까지 문자열 : " + sub2); 
		
		// 문자열 인덱스
		int idx1 = message.indexOf("e");
		int idx2 = message.lastIndexOf("e"); 
		System.out.println("idx1 : " + idx1);
		System.out.println("idx2 : " + idx2);
		
		// 문자열 분리
		String[] words = message.split(",");
		for(String word : words) {
			System.out.println(word);
		}
		
		// 문자열 교체
		String mes = message.replace("Korea" ,"Japan" );
		System.out.println(mes);
		
		// 문자열 변환 String.valueOf() -> 정적 메서드(static)
		int n1 = 1000;
		String n2 = "1000";
		
		if(n2.equals(String.valueOf(n1))) System.out.println("성공");
		
		
	}

}
