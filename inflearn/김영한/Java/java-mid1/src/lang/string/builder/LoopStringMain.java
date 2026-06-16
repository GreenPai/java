package lang.string.builder;

/**
 * StringBuilder 클래스 - 2026 6월 16일
 * String 2000ms / StringBuilder 3ms
 */
public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
