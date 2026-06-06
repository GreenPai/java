package ref;

/**
 * 기본형과 참조형 : 2026/06/06
 * Exception in thread "main" java.lang.NullPointerException:
 * Cannot assign field "value" because "data" is null
 */
public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}
