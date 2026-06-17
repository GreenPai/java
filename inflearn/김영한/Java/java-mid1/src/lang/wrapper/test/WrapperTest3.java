package lang.wrapper.test;

/**
 * Wrapper 클래스 - 2026 6월 17일
 * 문제와 풀이
 */
public class WrapperTest3 {

    public static void main(String[] args) {
        String str = "100";

        //String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        //Integer -> int
        int intValue = integer1.intValue();
        System.out.println("intValue = " + intValue);

        //int -> Integer
        Integer integer2 = Integer.valueOf(intValue);
        System.out.println("integer2 = " + integer2);
    }
}
