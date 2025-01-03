package test1;

/*
 * 날짜 : 2025/01/03
 * 이름 : 우상호
 * 내용 : 자바 자료형 연습문제
 */
public class Test08 {

	public static void main(String[] args) {
		int n = 5;
		
		for(int i = 0; i<n; i++) {
			for(int j=n-i; j>0; j--) {
				System.out.print(" ");
			}
			
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println("\n");
		}
	}

}
