package ch02.sec01;

/*
 * 우상호
 * 장제목: 2장 변수와 타입
 * 작성일: 2024.12.31
 */

public class VariableUseExample{
	public static void main(String[] args) {
		int x=3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		}
}
