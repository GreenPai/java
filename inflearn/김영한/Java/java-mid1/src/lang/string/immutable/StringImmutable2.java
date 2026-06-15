package lang.string.immutable;

/**
 * String 클래스 - 2026 6월 15일
 * String 불변 객체 : 새로운 값을 만들어 대입한다.
 *
 * String은 문자열풀에 저장된다.
 * hello로 저장된 값을 바꾸면 다른 hello에 저장된 값도 바뀔것이다.
 */
public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
