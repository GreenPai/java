package step2;

import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		String qr;
		if(n1>0) {
			if(n2>0) {
				qr = "1";
			}else {
				qr = "4";
			}
		}else {
			if(n2>0) {
				qr = "2";
			}else {
				qr = "3";
			}
		}
		
		System.out.println(qr);
	}
}
