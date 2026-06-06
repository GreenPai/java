package class1;

/**
 * 클래스와 데이터 : 2026/06/06
 * 배열 코드의 문제점:
 * 데이터가 변경 될 때 어려움이 있다.
 * 학생2의 요소를 제거하려면 학생2의 요소를 정확하게 찾아서 제거해줘야된다.
 */
public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentAges = {15, 16, 17, 20};
        int[] studentGrade = {90, 80, 70, 60};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrade[i]);
        }
    }
}
