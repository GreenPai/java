package sub4;

public class WrapperTest {
	public static void main(String[] args) {
		// 기본 타입 - primitive -> 원시타입, 기본타입
		int var1 = 1;
		double var2 = 1.2;
		boolean var3 = true;
		
		
		// Wrapper 포장 (Boxing)
		// Integer -> 대문자 -> 클래스 -> 참조변수 -> 객체다.
		// 원시타입을 객체로 만든 것
		Integer box1 = var1;
		Double  box2 = var2;
		Boolean box3 = var3;
		
		System.out.println("box1 : " + box1);
		System.out.println("box2 : " + box2);
		System.out.println("box3 : " + box3);
		
		// 문자열 -> 기본타입 변환
		String str1 = "1";
		String str2 = "3.14";
		String str3 = "false";
		
		int value1 = Integer.parseInt(str1);
		double value2 = Double.parseDouble(str2);
		boolean value3 = Boolean.parseBoolean(str3);
		
		// 문자열 -> Wrapper 변환
		Integer w1 = Integer.valueOf(str1);
		Double  w2 = Double.valueOf(str2);
		Boolean w3 = Boolean.valueOf(str3);
		
		System.out.println("w1 : " + w1);
		System.out.println("w2 : " + w2);
		System.out.println("w3 : " + w3);
		
		// Wrapper -> 문자열 반환
		String s1 = w1.toString();
		String s2 = w2.toString();
		String s3 = w3.toString();
		
		// Wrapper -> 기본타입 반환(Unboxing)
		int v1 = w1;
		double v2 = w2;
		boolean v3 = w3;
		
	}
}
