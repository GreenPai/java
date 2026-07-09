package exception.ex3.exception;

/**
 * 예외 처리 - 2026년 7월 9일
 * 연결을 실패한 예외처리
 */
public class ConnectExceptionV3 extends NetworkClientExceptionV3 {

    private final String address;

    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
