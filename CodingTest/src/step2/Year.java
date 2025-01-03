package step2;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		int n = 1;
		if(year%400==0) {
			
		}else if(year%4==0&&year%100!=0) {
			
		}else {
			n=0;
		}
		
		System.out.println(n);
	}

}
