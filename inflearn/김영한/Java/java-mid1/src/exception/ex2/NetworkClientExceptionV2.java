package exception.ex2;

/**
 * 예외 처리 - 2026년 7월 8일
 * EX1을 리펙토링
 */
public class NetworkClientExceptionV2 extends Exception {

    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
