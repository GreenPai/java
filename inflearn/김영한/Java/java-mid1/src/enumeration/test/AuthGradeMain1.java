package enumeration.test;

/**
 * 열거형 - 2026 6월 18일
 * ENUM
 * 문제와 풀이.
 */
public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("grade=" + value.name() + ", level=" +value.getLevel() + ", 설명=" + value.getDescription());
        }
    }
}
