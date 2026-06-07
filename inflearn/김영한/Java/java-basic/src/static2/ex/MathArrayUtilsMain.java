package static2.ex;

import static static2.ex.MathArrayUtils.*;

/**
 *  static 문제와 풀이 : 2026/06/07
 *  static import -> MathArrayUtils
 */
public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + sum(values));
        System.out.println("average=" + average(values));
        System.out.println("min=" + min(values));
        System.out.println("max=" + max(values));
    }
}
