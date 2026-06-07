package static2.ex;

/**
 *  static 문제와 풀이 : 2026/06/07
 */
public class MathArrayUtils {

    // private 생성자를 생성하지 않도록 막는다.
    // 기능만 제공을 위한 클래스이기때문에 생성자를 만들었을때 메모리만 차지하게 된다. 
    
    private MathArrayUtils() {
        //private 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
