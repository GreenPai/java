package sub3;

/*
 * 날짜 : 2025/01/14
 * 이름 : 김철학
 * 내용 : Java StringBuilder 클래스 실습하기
 */
public class StringBuilderTest {

	public static void main(String[] args) {
		
		// String 객체의 불변성 특성으로 메모리 낭비가 발생
		String str = "Hello";
		System.out.println("str 주소 : " + System.identityHashCode(str)); // 정확한 주소값은 아니다.
		
		str += "World" ;
		System.out.println("str 주소 : "  + System.identityHashCode(str));
		
		//String의 불변성을 개선한 StringBuilder 문자열 가공
		StringBuilder sb = new StringBuilder();
		sb.append("World");
		System.out.println("str 주소 : " + System.identityHashCode(sb));
		
		sb.append("Hello");
		System.out.println("str 주소 : " + System.identityHashCode(sb));
		
		// 6에서 7까지 삭제
		sb.delete(6, 8);
		System.out.println(sb.toString());
		
		sb.replace(0, 6, "SKK");
		System.out.println(sb.toString());
		
		System.out.println("str 주소 : "  + System.identityHashCode(sb));
		}

}
