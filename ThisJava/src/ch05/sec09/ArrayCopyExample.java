package ch05.sec09;

/*
 * 우상호
 * 장제목: 5장 참조타입 p190
 * 작성일: 2025.01.08
 */



public class ArrayCopyExample {
	public static void main(String[] args) {
		//길이 3인 배열
		String[] oldstrArray = {"java", "array", "copy"};
		//길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldstrArray, 0, newStrArray, 0, 3);
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}
