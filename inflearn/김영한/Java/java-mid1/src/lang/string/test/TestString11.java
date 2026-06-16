package lang.string.test;

/**
 * String 문제와 풀이 - 2026 6월 16일
 */
public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
