package exception.basic.unchecked;

/**
 * 예외 처리 - 2026년 7월 8일
 * 언체크 예외
 */
public class Client {
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
