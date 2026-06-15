package lang.string.equals;

/**
 * String 클래스 - 2026 6월 15일
 * String은 문자열 풀에 자바 실행 시점에 만들어지므로
 * hello 같은 값은 새로 만들지 않고 기존에 잇는것을 사용한다.
 */
public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교:" + (str1.equals(str2)));

        String str3 = "hello"; //x003
        String str4 = "hello"; //x004
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}
