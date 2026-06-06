package class1;

/**
 * 클래스와 데이터 : 2026/06/06
 * 문제점: 학생이 추가 될 수록 변수를 다시 설정해야 함으로서 코드가 길어진다.
 */

public class ClassStart1 {

    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름:" + student1Name + " 나이:" + student1Age + " 성적:" + student1Grade);
        System.out.println("이름:" + student2Name + " 나이:" + student2Age + " 성적:" + student2Grade);
    }
}
