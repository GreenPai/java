package sub3;
/*
 * 날짜 : 2025/01/02
 * 이름 : 우상호
 * 내용 : Java 반복문 for 실습하기 
 */
public class ForTest {

	public static void main(String[] args) {
		
		// for
		for(int i=0; i<10; i++) {
			System.out.println("i : " + i);
		}
		
		// 1부터 10까지 합
		int sum1 = 0;
		
		for(int k=1; k<=10; k++) {
			sum1 += k;
		}
		
		System.out.println(sum1);
		
		// 1부터 10까지 짝수합
		int sum2=0;
		for(int k=1; k<=10; k++) {
			if(k%2==0) sum2 += k;
		}
		
		System.out.println(sum2);
		
		// for 중첩
		for(int a=1 ; a<=3; a++) {
			System.out.println("a : " + a);
			
			for(int b=1; b<=5; b++) {
				System.out.println("b : " + b);
				
				for(int c=1; c<=7; c++) {
					System.out.println("c : " + c);
				}
			}
		}
		
		// 구구단
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " + " + j + " = " + (i*j));
			}
		}
		
		// 별삼각형
		/*
		for(int start=1; start<=10; start++) {
			for(int end=1; end<=start; end++) {
				System.out.print("⭐");
			}
			System.out.print("\n");
		}
		*/
		for(int start=10; start>=1; start--) {
			for(int end=start; end>=1; end--) {
				System.out.print("⭐");
			}
			System.out.print("\n");
		}

	}

}
