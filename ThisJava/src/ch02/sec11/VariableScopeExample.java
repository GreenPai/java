package ch02.sec11;

/*
 * 우상호
 * 장제목: 2장 변수와 타입
 * 작성일: 2024.12.31
 */

public class VariableScopeExample{
	public static void main(String[] args) {
		
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
		// int v3 = v1 + v2 + 5; // 에러발생 v2 사용 불가
	}
}
