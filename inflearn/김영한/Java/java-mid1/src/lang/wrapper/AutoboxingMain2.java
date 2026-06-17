package lang.wrapper;

/**
 * Wrapper 클래스 - 2026 6월 17일
 * 오토박싱
 * 자바 5부터 오토 박싱을 지원
 */
public class AutoboxingMain2 {

    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱(Auto-boxing)

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱(Auto-Unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
